package udemy

abstract class MyList {

  def head: Int
  def tail: MyList
  def isEmpty: Boolean
  def add(ele: Int): MyList
  def printElements: String
  override def toString: String = "[" + printElements +"]"

}

object Empty extends MyList {
  def head: Int = throw new NoSuchElementException
  def tail: MyList = throw new NoSuchElementException
  def isEmpty: Boolean = true
  def add(ele: Int): MyList = new NonEmpty(ele, Empty)
  def printElements: String = " "

}

class NonEmpty(h: Int, t: MyList) extends MyList {
  def head: Int = h
  def tail: MyList = t
  def isEmpty: Boolean = false
  def add(ele: Int): MyList = new NonEmpty(ele, this)
  def printElements: String =
    if(t.isEmpty) " " + h
    else h + " " + t.printElements
}

object ListTest extends App {
  //Empty.head  // throws error NoSuchElementException
  //Empty.tail  // throws error NoSuchElementException
  println(Empty.isEmpty)
  println(Empty.add(1))

  val nonempt = new NonEmpty(50, Empty)
  println(nonempt.head)
  println(nonempt.tail)
  println(nonempt.isEmpty)
  println(nonempt.add(100))

  val nonempt1 = new NonEmpty(20,new NonEmpty(30, new NonEmpty(40, Empty)))
  println(nonempt1.head)
  println(nonempt1.tail)
  println(nonempt1.tail.head)
  println(nonempt1.tail.tail.head)
  println(nonempt1.isEmpty)
  println(nonempt1.add(10).head)
  println(nonempt1.toString)
}


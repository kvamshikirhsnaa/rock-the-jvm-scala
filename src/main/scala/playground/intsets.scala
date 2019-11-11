package playground

object set1 extends App {
  val t1 = new NonEmpty(3, new Empty, new Empty)
  println(t1)
  val t2 = t1 incl 5
  println(t2)
  val t3 = t2 incl 4
  println(t3)
  val t4 = t1 incl 6
  println(t4)

}
abstract class IntSet {
  def contains(x: Int): Boolean
  def incl(x: Int): IntSet
}
class Empty extends IntSet {
  def contains(x: Int): Boolean = false
  def incl(x: Int): IntSet = new NonEmpty(x, new Empty, new Empty)
  override def toString = "."
}

class NonEmpty(ele: Int, left: IntSet, right: IntSet) extends IntSet {
  def contains(x: Int): Boolean =
    if(x < ele) left contains x
    else if(x > ele) right contains x
    else true

  def incl(x: Int): IntSet =
    if(x < ele) new NonEmpty(ele, left incl x, right)
    else if(x > ele) new NonEmpty(ele, left, right incl x)
    else this
  override def toString = "{"+ left +","+ ele+ ","+ right +"}"
}


package udemy

object Prac1 extends App {
  val w = new Writer("chetan", "bagath",1980)
  val n = new Novel("half girlfriend", 2016, w)
  val w1 = new Writer("durjoy", "dutta",1986)
  val n1 = new Novel("some one likes you", 2015, w1)
  val w3 = new Writer("chetan", "bagath",1980)

  w.fullName
  println(n.authorAge)
  println(n.isWrittenBy(w))
  println(n.isWrittenBy(w1))
  println(n.isWrittenBy(w3))

  val c = new Counter
  c.inc.print
  c.inc.inc.inc.print
  c.inc(5).print

  val d = new Counter(20)
  d.dec.print
  d.dec(3).print


}
/*
  Writer Class
    - Writer: firstName, surName, year
    - method fullName
 */

class Writer(val firstName: String, val surName: String, val year: Int){

  def fullName = println(firstName+ " " +surName)
}

/*
  Novel Class
    - Novel: name, year, auhtor
    - method authorAge
    - method isWrittenBy
    - new instance of copy taking newYear
 */

class Novel(val name: String, val year: Int, val author: Writer){

  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int) = new Novel(name, newYear, author)

}
/*
  Counter class
    - receives an int value
    - mehtod current count
    - method to incremenet/decrement => new Counter
    - overload inc/dec to receive an amount
 */

class Counter(val count: Int = 0) {

  def inc = {
    println("incrementing")
    new Counter(count + 1) // immutability
  }
  def dec = {
    println("decrementing")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if(n <= 0) this
    else inc.inc(n - 1)
  }
  def dec(n: Int): Counter = {
    if(n <= 0) this
    else dec.dec(n - 1)
  }
  def print = println(count)

}

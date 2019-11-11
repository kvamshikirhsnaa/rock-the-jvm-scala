package playground

object ratinal extends App {
  val x = new Rational(1,3)
  println(x)
  println(x.result)
  val y = new Rational(5,7)
  println(y)
  println(y.result)
  val z = new Rational(3,2)
  println(z)
  println(z.result)
  println(x + y + z)
  println(x - y - z)
  println(x less y)
  println(y less z)
  println(x max y)
  println(y max z)
  println(x max z)
  val s = new Rational(1,0)
  println(s + s)
}

class Rational(a: Int, b:Int) {
  require(b != 0, "denominator must be zero")
  def num = a
  def den = b

  override def toString = num +"/"+ den
  def result = num/den.toDouble

  def +(p: Rational) =
    new Rational((num * p.den + den * p.num),den * p.den)
  def neg: Rational = new Rational(-num, den)
  def -(q: Rational) = q.neg
  def less(q: Rational) = num * q.den < den * q.num
  def max(q: Rational) =
    if(this less(q)) q else this

}



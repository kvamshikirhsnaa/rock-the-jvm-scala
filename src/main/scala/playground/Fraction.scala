package playground

class Fraction(val n: Int, val d: Int) {
  override def toString = n +"/"+ d
  def result = n/d.toDouble
  def +(p: Fraction) = {
    new Fraction((n * p.d + d * p.n) , (d * p.d))
  }
  def neg = (-n,d)
}

object First {
  def main(args: Array[String]): Unit = {
    val f = new Fraction(2,3)
    println(f)
    println(f.result)
    val s = new Fraction(4,5)
    println(s)
    println(s.result)
    val r = f + s
    println(r)
    println(r.result)
    println(f.neg)
  }
}

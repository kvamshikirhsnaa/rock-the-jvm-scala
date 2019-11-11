package playground

object exer extends App {
  def product(f: Int => Int)(a: Int, b: Int):Int = {
    if (a > b) 1
    else f(a) * product(f)(a + 1, b)
  }
  def fact(n: Int): Int = product(x => x)(1, n)
  println(product(x => x)(2,3))
  println(fact(5))
  println(product(x => x)(2,5))
  println(fact(7))






}

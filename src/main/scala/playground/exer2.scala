package playground

object exer2 extends App {
  def mapReduce(f: Int => Int,combine: (Int, Int)=> (Int), zero: Int)(a: Int, b: Int): Int = {
    if(a > b) zero
    else combine(f(a), mapReduce(f, combine, zero)(a + 1, b))
  }
  def product(f: Int => Int)(a: Int, b: Int) =
    mapReduce(f,(x,y) => (x * y), 1)(a, b)
  println(product(x => x)(3,4))
  println(product(x => x)(2,5))
  println(product(x => x)(4,8))


}

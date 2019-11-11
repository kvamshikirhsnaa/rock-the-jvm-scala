class Demo {
  var n1 = 0
  var n2 = 0
  private var n3 = 0
  var result = 0
  def mul(n1: Int, n2: Int) = {
    result = n1 * n2
  }
}

val d1 = new Demo

d1.n1 = 2
d1.n2 = 4

d1.mul(2,4)

d1.result

d1.mul(2,3)

d1.result




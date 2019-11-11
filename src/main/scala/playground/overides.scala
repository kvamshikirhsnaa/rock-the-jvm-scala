package playground

object over extends App {



  abstract class Base {
    def foo = 2
    def bar:Int
  }
  class Sub extends Base {
    override def foo = 3
    def bar = 2
  }

}

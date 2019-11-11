package playground

object MatchCaseTest {

  def main(args:Array[String]):Unit = {

    println(select(2))     //it printing result with Unit
    println(choice(1))
    select(2)
    choice(1)                // it's not printing output
    println(choice(1))

    def select(x: Int): Unit = x match {

      case 1 => println("one")
      case 2 => println("two")
      case _ => println("none")
    }

    def choice(x: Int): String = x match {
      case 1 => "one"
      case 2 => "two"
      case _ => "none"
    }

  }

}

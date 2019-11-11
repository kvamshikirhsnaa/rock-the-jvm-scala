package udemy

object AnonymousClasses extends App {

  abstract class Animal {
    def eat: Unit

  }

  val funnyAnimal: Animal = new Animal {
    override def eat: Unit = println("aamaamaam")
  }
  /* internal execution

    class AnonymousClasses$$anon$1 extends Animal {
    override def eat: Unit = println("aamaamaam")
    }
    val funnyAnimal: Animal = new AnonymousClasses$$anon$1

  */
  funnyAnimal.eat
  println(funnyAnimal.getClass)

  class Person(name: String) {
    def sayHi: Unit = println(s"Hi, my name is $name, how can i help")
  }

  val saikrishna = new Person("SaiKrishna") {
    override def sayHi: Unit = println(s"Hi, my name is Sai, how can i be of service")
  }

  saikrishna.sayHi

}

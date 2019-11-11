package udemy

object AbstractDataTypes extends App {

  //abstract
  abstract class Animal {
    val creatureType: String
    def eat: Unit
  }

  class Dog extends Animal {
    override val creatureType: String = "Domestic"
    def eat = println("aamaamaam")
  }

  //traits
  trait Carnivore {
    def eat(animal: Animal): Unit
  }

  class Crocodile extends Animal with Carnivore {
    override val creatureType = "croc"
    def eat: Unit = println("auauaauau")
    def eat(animal: Animal): Unit = println(s"I'm a croc and I'm eating ${animal.creatureType}")
  }

  val dog = new Dog
  val croc = new Crocodile
  println(dog.creatureType)
  dog.eat
  croc.eat
  croc.eat(dog)




}

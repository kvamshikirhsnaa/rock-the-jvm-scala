package udemy

object InheritanceAndTraits extends App {

  class Animal {
    val creatureType = "Domestic"
    def eat = println("aamaamaam")
    private def bark = println("bow")
    protected def run = println("fast")
    def barking = {
      bark
      println("bow bow")
    }
  }

  class Dog extends Animal {
    def crunch = {
      run
      println("fast fast")
    }
  }
  val dog = new Dog
  dog.eat
  dog.crunch
  dog.barking
  println(dog.creatureType)

  //overriding
  class Lion extends Animal {
    override val creatureType: String = "Wild"
    override def eat = {
      super.eat
      println("avuravuru")
    }
  }

  class Monkey(override val creatureType: String) extends Animal {
    override def eat = println("fruits")
  }

  val lion = new Lion
  lion.eat
  println(lion.creatureType)

  val monkey = new Monkey("friendly")
  monkey.eat

  // constructors
  class Person(name: String, age: Int){
    def this(name: String) = this(name, 0)
  }

  class Adult(name: String, age: Int, idCard: String) extends Person(name)

  // type substitution
  val unknownAnimal: Animal = new Monkey("friendly")
  unknownAnimal.eat

  // preventing overrides




}

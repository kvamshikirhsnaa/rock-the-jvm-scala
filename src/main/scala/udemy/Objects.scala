package udemy

object Objects {

  // SCALA doesn't has class-level functionality(like static clause in java)

  object Person {

    // factory method
    def from(mother: Person, father: Person): Person = new Person("SAIKRISHNA")
    def apply(mother: Person, father: Person): Person = new Person("GOUTHAMI")

  }

  class Person(val name: String) {

  }

  def main(args: Array[String]): Unit = {

    val Anasuya =  new Person("ANASUYA")
    val Srinivasulu =  new Person("SRINIVASULU")
    println(Anasuya == Srinivasulu)

    val s = Person.from(Anasuya, Srinivasulu)
    val g = Person(Anasuya, Srinivasulu)
    println(s.name)
    println(g.name)

  }

}


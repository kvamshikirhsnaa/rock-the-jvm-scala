package udemy

object MethodNotation extends App{

  class Person(val name: String, val favoriteMovie: String){

    def likes(movie: String) = movie == favoriteMovie
    def +(person: Person) = s"${this.name} is hanging out with ${person.name}"
    def isAte: Boolean = true
    def number(a: Int) = a + 10
    def apply(): String = s"Hi, my name is $name, i like $favoriteMovie"
    def apply(a: Int) = a * a

  }

  val p = new Person("vamshikrishna","Aparichitudu")

  println(p.likes("Aparichitudu"))
  println(p likes "Aparichitudu")   // both or equivalent
  // infix notation = operator notation, method which have one parameter we can pass like this.
  // is called syntactic sugar

  val q = new Person("mahesh", "Temper")

  println(q.+(p))
  println(q + p)  // both or equivalent

  println(1 + 2)
  println(1.+(2))

  // ALL Operators are methods in scala

  //postfix notation
  println(p.isAte)
  println(p isAte) // both are equivalent
  // postfix notation works with if method has no parameter.

  println(p.number(10))
  println(p number(10))

  //apply()
  println(p.apply())
  println(p()) // both are equivalent.
  println(p)

  println(p.apply(10))
  println(p(10))

}



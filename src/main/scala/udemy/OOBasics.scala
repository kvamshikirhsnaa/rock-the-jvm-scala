package udemy

object OOBasics extends App {

  val person = new Person("aishwarya", 24)
  println(person)
  println(person.name)
  println(person.age)
  println(person.x)
  person.greet("vamshikrishna")
  person.greet2("vamshikrishna")
  person.greet3("vamshikrishna")
  person.greet()

  val p = new Person("ganga")
    println(p.name)
    println(p.age)

  val q = new Person()
  println(q.name)
  println(q.age)


}

//constructor
class Person(val name: String, val age: Int = 22) {

  //body
  val x = 3
  println(1 + 5)
  println(x + 7)

  //method
  def greet(name: String) =
    println(s"$name says: Hello, $name")
  def greet2(name: String) =
    println(s"$this.name says: Hello, $name")
  def greet3(name: String) =
    println(s"${this.name} says: Hello, $name")

  //overloading
  def greet() =
    println(s"hi, my name is $name")

  //multiple constructors
  def this(name:String) = this(name, 22)
  def this() = this("vk")





}

package traitexamples

trait Friend {
  val name: String
  def listen() = println("Your friend " + name + " is listening")
}

class Human(val name: String) extends Friend

class Man(override val name: String) extends Human(name)

class Woman(override val name: String) extends Human(name)

class Animal

class Dog(val name: String) extends Animal with Friend

object Sample extends App{

  val mahesh = new Man("mahesh")
  val divya = new Woman("divya")
  val jackey = new Dog("jackey")

  mahesh.listen
  divya.listen
  jackey.listen
}

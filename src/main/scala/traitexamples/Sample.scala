package traitexamples

trait Animal{
  def speak: Unit
}

class Dog(val name: String) extends Animal{
  override def speak: Unit = println(s"$name is barking")
}

class Cat(val name: String) extends Animal{
  override def speak: Unit = println(s"$name is meowing")
}

object Sample extends App{
  val jackey = new Dog("Jackey")
  val kity = new Cat(("Kity"))

  jackey.speak
  kity.speak
}
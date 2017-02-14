package scalaspring

abstract class Animal {
 def speak(): Unit
}

class Dog(name: String) extends Animal {
  override def speak() {
    println(s"$name says: Woof")
  }
}

class Cat(name: String) extends Animal {
  override def speak() = {
    println(s"$name says: Meow")
  }
}

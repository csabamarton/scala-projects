package scalaspring

import org.springframework.context.support.ClassPathXmlApplicationContext

object ScalaSpringExample {
  def main(args: Array[String]) {

    val ctx = new ClassPathXmlApplicationContext("applicationContext.xml")

    val dog = ctx.getBean("dog").asInstanceOf[Animal]
    val cat = ctx.getBean("cat").asInstanceOf[Animal]

    dog.speak
    cat.speak
  }
}

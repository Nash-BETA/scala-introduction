trait Nameable {
  val name: String
  def display(): Unit = {
    println(name)
  }
}

class Employee(val name: String) extends AnyRef with Nameable

val taro = new Employee("taro")
taro.display()
abstract class Shape {

  def draw(): Unit = {
    println("不明な図形")
  }
}

class Triangle extends Shape {
  override def draw(): Unit = {
    println("三角形")
  }
}

class Rectangle extends Shape {
  override def draw(): Unit = {
    println("四角形")
  }
}
class UnknownShape extends Shape

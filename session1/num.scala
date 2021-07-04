object Num extends App {
  val maybeNum: Option[Int] = Some(123)
  val num:Int = maybeNum match{
    //Some(num)は値が存在していることを示す
    case Some(num) if num < 0 => 0
    case Some(num) => num
    case None => 0
  }

  println(num)
}

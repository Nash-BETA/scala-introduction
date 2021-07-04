object Weight extends App {
  val weight = 120
  val message = if (weight <= 100) {
    "OK"
  } else {
    "オーバー"
  }

  println(message)
}
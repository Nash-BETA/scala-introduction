object Match extends App {
  val n = 5
  n match {
    case 1 => println("Gold")
    case 2 => println("Silver")
    case 3 => println("Bronze!")
    case other => println("You didn't get a prize")
  }

  //｜を使って複数パターンの表記
  val m = 2
  m match {
    case 1 | 2 | 3 => println("よくやった！！")
    case other => println("ドンマイ")
  }

}

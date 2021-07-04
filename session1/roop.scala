object Roop extends App {
  var i = 0
  while (i < 3) {
    println(i)
    i += 1
  }


  val k = 3
  for {j <- 1 to 10}
    println(k * j)
}

class Point(val x: Int, val y: Int){
  def distance(that:Point):Int = {
    val xdiff = math.abs(this.x - that.y)
    val ydiff = math.abs(this.x - that.y)
    math.sqrt(xdiff * xdiff + ydiff * ydiff).toInt
  }

  def +(that:Point):Point =
    new Point(x + that.x,y + that.y)
}

//書き換え例
class Point2(vx: Int, vy: Int){
  //書き込み不可
  val x = vx
  //書き込み可能
  var y = vy

  def distance(that:Point):Int = {
    val vxdiff = math.abs(this.x - that.y)
    val vydiff = math.abs(this.x - that.y)
    math.sqrt(vxdiff * vxdiff + vydiff * vydiff).toInt
  }

  def +(that:Point):Point =
    new Point(x + that.x,y + that.y)
}


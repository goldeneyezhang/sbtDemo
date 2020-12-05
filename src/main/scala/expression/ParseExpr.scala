package expression

object ParseExpr extends Arith {
  def main(args:Array[String]) = {
    val arg:String = "2 * (3 +7)"
    println("input : "+arg)
    println(parseAll(expr,arg))
    //println("input : "+args(0))
   // println(parseAll(expr,args(0)))
  }
}

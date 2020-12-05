package expression

import java.io.FileReader

object ParseJSON extends JSON {
  def main(args:Array[String]) = {
    val reader = new FileReader("src/main/scala/expression/address-book.json")
    println(parseAll(value,reader))
  }
}

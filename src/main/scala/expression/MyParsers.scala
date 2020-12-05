package expression

import scala.util.parsing.combinator.RegexParsers

object MyParsers extends RegexParsers{
  val ident:Parser[String] = """[a-zA-z_]\w*""".r
}


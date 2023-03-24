object EvalExpr {
  def evalExpr(expr: String): Double = {
    println(expr)
    val tokens = expr.split(" ")
    var result = tokens.head.toDouble
    var i = 1

    while (i < tokens.length) {
      val operator = tokens(i)
      val operand = tokens(i + 1).toDouble
      operator match {
        case "+" => result += operand
        case "-" => result -= operand
        case "*" => result *= operand
        case "/" => result /= operand
        case _ => throw new IllegalArgumentException(s"Invalid operator: $operator")
      }
      i += 2
    }
    result
  }
  def main(args: Array[String]): Unit = {
    println(evalExpr("5 + 3 * 2 - 6 / 3"))
  }
}


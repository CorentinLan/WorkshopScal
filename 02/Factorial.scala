object Factorial {
    def factorialrec(n: Int): Int = {
        if (n <= 1) 1
        else n * factorialrec(n - 1)
    }

    def factorial(n: Int): Int = {
        var result = 1
        for (i <- 1 to n) {
            result *= i
        }
        result
    }
    def main(agrs: Array[String]) = {
        println(factorial(5))
        println(factorialrec(5))
    }
}
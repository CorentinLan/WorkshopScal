object FizzBuzz {
    def FizzBuzz(n: Int): Unit= {
        if (n > 0) {
            FizzBuzz(n - 1)
            if (n % 3 == 0 && n % 5 == 0) println("FizzBuzz")
            else if (n % 3 == 0) println("Fizz")
            else if (n % 5 == 0) println("Buzz")
            else println(n.toString)
        }
    }
    def main(args: Array[String]): Unit = {
        FizzBuzz(17)
    }
}
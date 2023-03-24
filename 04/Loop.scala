object Loop {
    def LoopFor = {
        for (i <- 1 to 5) {
            println(i)
        }
    }
    def LoopRecPlus(n: Int): Unit = {
        if (n <= 5) {
            println(n)
            LoopRecPlus(n + 1)
        }
    }
    def LoopRecMinus(n: Int): Unit = {
        if (n > 0) {
            LoopRecMinus(n - 1)
            println(n)
        }
    }
    def main(args: Array[String]) = {
        LoopFor
        LoopRecPlus(1)
        LoopRecMinus(5)
    }
}
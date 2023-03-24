object Mean {
    def MeanVarargs(numbers: Int*): Double = {
        if (numbers.isEmpty) {
            0.0
        } else {
            numbers.sum.toDouble / numbers.length.toDouble
        }
    }
    def MeanIt(a: Int, b: Int, c: Int): Double = {
        var result = a + b + c
        result.toDouble / 3.0
    }
    def main(args: Array[String]) = {
        println(MeanIt(5, 3, 13).toString)
        println(MeanVarargs(5,16,17,9,25,71,35,36,11,19).toString)
    }
}
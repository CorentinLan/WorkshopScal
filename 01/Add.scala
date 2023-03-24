object Add{
    def AddIt(a: Int, b: Int): Int = {
        a + b
    }
    def AddList(numbers: List[Int]): Int = {
        numbers.sum
    }
    def main(args: Array[String]) = {
        println(AddIt(5, 3).toString)
        println(AddList(List(1, 2, 3, 4)).toString)
    }
}

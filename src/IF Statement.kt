fun main(args: Array<String>) {
    var a = 2
    var b = 5

    var myInt: Int = if (a > b)
                    {
                        println("a is greater: ")
                        a
                    }
                     else
                    {
                        print("b is greater: ")
                        b
                    }
       println(myInt)

}
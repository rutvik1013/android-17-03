fun main()
{
    println("Enter 1st number: ")
    var a=readLine()!!.toInt()

    println("Enter operator: ")
    var op=readLine()

    println("Enter 2nd number: ")
    var b=readLine()!!.toInt()

    when(op)
    {
        "+"->
        {
            var c=a+b
            println("Addition:$c")

        }
        "-"->
        {
            var d=a-b
            println("Substraction:$d")
        }
        "*"->
        {
            var e=a*b
            println("Multiplication:$e")
        }
        "/"->
        {
            var f=a/b
            println("Division:$f")
        }
    }

}

fun main()
{
    println("Enter 1st number:")
    var a=readLine()!!.toInt()

    println("Enter operator: ")
    var op=readLine()

    println("Enter 2nd number: ")
    var b=readLine()!!.toInt()

    when(op)
    {

        "+"->
        {
            println(a+b)
        }
        "-"->
        {
            println(a-b)
        }
        "*"->
        {
            println(a*b)
        }
        "/"->
        {
            println(a/b)
        }

    }

}
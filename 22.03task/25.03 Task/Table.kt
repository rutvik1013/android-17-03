// Write a program you have to print table of given number
fun main()
{
    println("Enter Number of Table:")
    var n=readLine()!!.toInt()
    println("Table:")
    var a=1
    for(i in 1..10)
    {
        a=n*i
        println("$n*"+i+"="+a)

    }
}
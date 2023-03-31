//Write a program to find out the factorial of given number using function

fun facto(n:Int)
{
    println("Enter Number:")
    var n=readLine()!!.toInt()
    var fact=1
    for(i in 1..n)
    {
        fact=fact*i

    }
    println("Factorial of $n=$fact")
}
fun main()
{
    println(facto(5))
}

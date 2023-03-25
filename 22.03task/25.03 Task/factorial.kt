// Write a  program you have to find the factorial of given number.

fun main()
{
    println("Enter a  number:")
    var n= readLine()!!.toInt()
    var fact=1
    for(i in 1..n)
    {
        fact=fact*i
    }
    println("Factorial of $n=$fact")
}
// Write a program to make summation of given number.

fun main()
{
    var sum=0
    println("Enter Number:")
    var n=readLine()!!.toInt()

    while(n>0)
    {
         sum=sum+n%10
        n=n/10
    }
    println("Sum of Digits:$sum")
}
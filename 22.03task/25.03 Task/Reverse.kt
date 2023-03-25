// Write a program you have toprint the number in reverse order.

fun main()
{
    var sum=0
    var r=0

    println("Enter Number:")
    var n=readLine()!!.toInt()

    while(n>=1)
    {
        if(n<10)
            sum=n
        else
            sum=n%10
        r=(r*10)+sum
        n=n/10

    }
    println("Reverse Number:$r")

}
// Write a program you have to make summation of first and last digits(e.g. 1234 ans:-5)

fun main()
{
    var sum=0
    var lastdigit=0

    println("Enter number:")
    var n=readLine()!!.toInt()

    lastdigit=n%10
    sum=(sum*10)+lastdigit

    while(n>0)
    {
        if(n>9)
            n=n/10

        else
        {
            lastdigit=n
            sum=sum+lastdigit
            n=n/10
        }
    }
    println("Total of First and Last Digit:$sum")
}
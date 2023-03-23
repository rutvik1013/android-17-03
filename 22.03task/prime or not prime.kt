fun main()
{
    println("Enter Number:")
    var n=readLine()!!.toInt()

    if(n%2==0)
    {
        println("Prime Number$n")
    }
    else
    {
        println("Not Prime$n")
    }
}
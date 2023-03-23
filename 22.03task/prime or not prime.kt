fun main()
{
    println("Enter Number:")
    var n=readLine()!!.toInt()
    var number=0
    for(i in 2 until n)
    {
        if(n%i==0)
        {
            number=1
            break
        }
    }
    if(number==1)
    {
        println("Prime Number")
    }
    else
    {
        println("Not prime")
    }
}

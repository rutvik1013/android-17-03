fun main()
{
    var n=0
    var a=0

    println("Enter Any Number:")
     n=readLine()!!.toInt()

    for(i in 2..n/2)
    {
        if(n%i==0)
        {
            println("Not prime Number")
            a=1
        }
    }
    if(a==0)
    {
        println("Prime Number")
    }
}

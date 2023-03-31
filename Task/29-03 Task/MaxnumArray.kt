fun max(n:Int)
{
    println("Enter Number:")
    var n=readLine()!!.toInt()
    for(i in 1..n)
    {
        var max=0
        for(j in i..n)
        {
            if(n>max)
                max=n
        }
    }
    println("Max Array:")
}
fun main()
{
    println(max(5))
}
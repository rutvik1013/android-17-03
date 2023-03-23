fun main()
{
    println("Enter Year:")
    var y=readLine()!!.toInt()
    if(y%4==0)
    {
        println("Leap year")
    }
    else
    {
        println("Not Leap year")
    }
}
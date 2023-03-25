// Write a program to find out the max from given number(e.g.1562 max num is 6)

fun main()
{
    var max=0

    println("Enter number:")
    var num=readLine()!!.toInt()

    while(num>0)
    {
        var temp=num%10
        if(temp>max)
        {
            max=temp
        }
        num=num/10


    }
    println("Max number:$max")
}
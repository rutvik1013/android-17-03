// Write a program to copy string one string to another string without using string function
fun main()
{
    println("Enter the sring:")
    var str=readLine()
    for(i in 0..str!!.length)
    {
        var copy=str!![i]
        println(copy)
    }
}

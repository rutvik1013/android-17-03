// Write a Program of Make a string reverse using recursive Function.

fun main()
{
    val str="Rutvik"
    val reversed=reverse(str)
    println("Reverse string:$reversed")
}
fun reverse(str:String):String
{
    if(str.isEmpty())
    {
        return str
    }
    return reverse(str.substring(1))+str[0]

}

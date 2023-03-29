open class Rectangle {
    fun area(l:Int,b:Int):Int
    {
        return l*b/2
    }
    fun area(s:Int):Int
    {
        return s*s
    }
}
fun main()
{
    var r1=Rectangle()

    println(r1.area(10,6))
    println(r1.area(6))
}
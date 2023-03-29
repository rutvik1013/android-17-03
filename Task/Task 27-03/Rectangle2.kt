open class Rectangle2
{
    fun area(l:Int,b:Int)
    {

        println(l*b)
    }
    fun perimeter(l:Int,b:Int)
    {
        println(2*(l+b))
    }
}
class square:Rectangle2()
{
    fun square(s:Int)
    {
        println(s*s)
    }
    fun permiter(s:Int)
    {
        println(s*s)
    }
}
fun main()
{
    var r1=Rectangle2()
    var s1=square()

    println(r1.area(5,7))
    println(r1.perimeter(7,8))
    println(s1.area(5,5))
    println(s1.permiter(6))
}
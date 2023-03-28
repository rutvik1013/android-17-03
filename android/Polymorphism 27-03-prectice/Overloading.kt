class Overloading {
    fun calc(a:Int,b:Int):Int
    {
        return a+b
    }
    fun calc(a:Int,b:Int,c:Int):Int
    {
        return a*b*c
    }

}
fun main()
{
    var o1=Overloading()

    println(o1.calc(2,3))
    println(o1.calc(2,3,2))
}
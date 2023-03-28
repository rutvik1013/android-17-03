class Overloading2 {
    fun calc(a:Int,b:Int):Int
    {
        return a+b
    }
    fun calc(a:Double,b:Double):Double
    {
        return a*b
    }
}
fun main()
{
    var o1=Overloading2()

    println(o1.calc(2,3))
    println(o1.calc(2.00,7.00))

}
class myfirstclass2
{
    fun haspassed(marks:Int):Boolean
    {
        return marks>40
    }
}
// infix function
infix fun myfirstclass2.isscholar(marks:Int):Boolean
{
    return marks>90
}
fun main()
{
    var a1=myfirstclass2()
    println(a1.haspassed(88))
    println(a1.isscholar(88))

    var a2=myfirstclass2()
    println(a2.haspassed(99))
    println(a2.isscholar(99))
}
class myfirstclass
{
    fun haspassed(marks:Int):Boolean
    {
        return marks>40
    }
}
// Extension Function
fun myfirstclass.isscholar(marks:Int):Boolean
{
    return marks>90
}
fun main()
{
    var m1=myfirstclass()
    println(m1.haspassed(88))
    println(m1.isscholar(92))

    var m2=myfirstclass()
    println(m2.haspassed(99))
    println(m2.isscholar(99))
}
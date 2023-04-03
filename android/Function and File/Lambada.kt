class Myfirstclass3
{
    fun addtwonum(a:Int,b:Int,action:(Int)->Unit)
    {
        val sum=a+b
        action(sum)
    }
}
fun main()
{
    // Lambada Function
    val a=Myfirstclass3()
    val aLambda:(Int)->Unit={s:Int->println(s)}
    a.addtwonum(2,7 ,aLambda)
}
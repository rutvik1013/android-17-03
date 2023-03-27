interface A2
{
    fun a2()

}
interface B2
{
    fun b2()

}
class c2:A2,B2
{
    override fun a2()
    {
        println("A Executed")

    }
    override fun b2()
    {
        println("B Executed")
    }
}
fun main()
{
    var c2=c2()
    c2.a2()
    c2.b2()
}
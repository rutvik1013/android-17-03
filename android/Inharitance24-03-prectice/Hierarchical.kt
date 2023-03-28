open class Bank()
{
    fun bank()
    {
        println("Banking")
    }
}
class current:Bank()
{
    fun current()
    {
        println("Current")
    }
}
class Saving:Bank()
{
    fun save()
    {
        println("Saving")
    }
}
fun main()
{
    var c=current()
    var s=Saving()

    c.current()
    s.save()
    c.bank()
}
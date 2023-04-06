class Testcallrun1
{
    fun run()
    {
        for(i in 1..5)
        {
            println("Test call Run1 is:"+i)
        }
    }
}
class Testcallrun2
{
    fun run()
    {
        for(i in 1..5)
        {
            println("Test call Run2 is:"+i)
        }
    }
}
fun main()
{
    var t1=Testcallrun1()
    var t2=Testcallrun2()

    t1.run()
    t2.run()
}
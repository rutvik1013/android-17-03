//  W.A.J. P to create one thread by implementing Runnable interface in Class.
class A:Runnable
{
    override fun run()
    {
        for(i in 1..5)
        {
            println("Thread A:"+i)
        }
    }
}
fun main()
{
    var t=Thread(A())

    t.start()
}
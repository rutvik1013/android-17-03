//  W.A.J. P to create one thread by extending Thread class in another Class.
 class A1:Thread()
{
     override fun run()
     {
         for(i in 1..5)
         {
             println("Thread 1:"+i)
         }
     }
 }
class B1:Thread()
{
    override fun run()
    {
        for(i in 1..5)
        {
            println("Thread 2:"+i)
        }
    }
}
fun main()
{
    var a1=A1()
    var b1=B1()

    a1.start()
    b1.start()
}
class newTestThreadTwice1:Thread()
{
     override fun run()
    {
        println(message = "I am newTestThreadTwice1: ")
    }
}
fun main()
{
    var t1=newTestThreadTwice1()

    t1.start()
    t1.start()
}
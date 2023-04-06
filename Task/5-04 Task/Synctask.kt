class massege
{
    fun send(name:String)
    {
        println("Sending"+name)
            Thread.sleep(2000)
        println(name+"sent")
    }
}
 class send(private var name:String, var massege:massege):Thread()
{
    override fun run()
    {
        synchronized(massege)
        {
            massege.send(name)
        }
    }
}
fun main()
{
    var send=massege()

    var s1=send("Babariya",send)
    var s2=send("Rutvik",send)

    s1.start()
    s2.start()
}
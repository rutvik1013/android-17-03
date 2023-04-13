// Write a simple function name start() return the string "OK"(Basic function.)

class msg
{
    fun send(message:String)
    {
        println("Sending "+message)
        Thread.sleep(2000)
        println("Return "+message)
    }
}

class msgsender(var message: String,var msg_sender:msg):Thread()
{
    override fun run()
    {
        synchronized(msg_sender)
        {
            msg_sender.send(message)
        }
    }
}

fun main()
{
    var msg = msg()
    var message = msgsender("OK",msg)
    message.start()
}
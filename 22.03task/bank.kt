import java.math.BigInteger

class bank {
    constructor(id:Int)
    {

        println("$id")
    }
    constructor(id:Int,name:String)
    {
        println("$id,$name")
    }
    constructor(id:Int,name:String,acc_no:BigInteger)
    {
        println("$id,$name,$acc_no")
    }

}
fun main()
{
    println("Enter Your id:")
    var id=readLine()!!.toInt()

    println("Enter Your name:")
    var name=readLine()

    println("Enter Your Account Number:")
    var acc_no=readLine()!!.toBigInteger()

    var b1=bank(id)
    var b2=bank(id,"$name",acc_no)


}

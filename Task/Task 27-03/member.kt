import java.math.BigInteger

open class member
{
    fun input(name:String,age:Int,phone_no:BigInteger,adress:String,salary:Int)
    {
        println("$name,$age,$phone_no,$adress,$salary")
    }
}
open class employee:member()
{
    fun specialization()
    {
        println()
    }
}
class manager:member()
{
    fun department()
    {
        println()
    }
}
fun main()
{
    println("Enter Name:")
    var name=readLine()

    println("Enter Age:")
    var age=readLine()!!.toInt()

    println("Enter Phone Number:")
    var ph_no=readLine()!!.toBigInteger()

    println("Enter adress:")
    var adress=readLine()

    println("Enter Salary:")
    var salary=readLine()!!.toInt()

    var printsalary=member()
    var specialization=employee()
    var department=manager()

    println(printsalary.input("$name",age,ph_no,"$adress",salary))

}
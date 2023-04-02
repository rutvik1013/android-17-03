interface person
{
    fun person(name:String,age:Int)
    {
        println("$name,$age")
    }
}
interface student
{
    fun student(per:Float)
    {
        println("$per")
    }
}
class teacher:person,student
{
    fun teacher(salary:Int)
    {
        println("$salary")
    }
}
fun main()
{
    println("Enter Person Name:")
    var name= readLine()!!.toString()
    println("Enter person Age:")
    var age= readLine()!!.toInt()

    println("Enter Student Percentage:")
    var per= readLine()!!.toFloat()

    println("Enter Teacher,s Salary:")
    var salary= readLine()!!.toInt()

    var t1=teacher()

    println(t1.person("$name",age))
    println(t1.student(per))
    println(t1.teacher(salary))

}
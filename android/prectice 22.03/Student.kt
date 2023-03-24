class Student {
    // Data Members

    var id=0
    var name=""
    var n=0
}
fun main()
{
    // object creation
    var s1=Student()
    var s2=Student()
    var s3=Student()

    println("Enter your Id:")
    var id1=readLine()!!.toInt()

    println("Enter your Name:")
    var name1=readLine()

    s1.id=id1
    s1.name=name1.toString()

    println("Your id is ${s1.id} and your Name is ${s1.name}")

}
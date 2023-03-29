open class Parent {
    fun P()
    {
        println("This is Parent class")
    }
}
open class Child:Parent()
{
    fun C()
    {
        println("This is Child class")
    }
}
class method1:Parent()
{
    fun P1()
    {
        println("This is Parent class")
    }
}
class method2:Child()
{
    fun C1()
    {
        println("This is Child Class")
    }
}
class method3:Parent()
{
    fun C2()
    {
        println("This is  Parent class from child class")
    }
}
fun main()
{
    var M1=method1()
    var M2=method2()
    var M3=method3()

    M1.P1()
    M2.C1()
    M3.C2()
}
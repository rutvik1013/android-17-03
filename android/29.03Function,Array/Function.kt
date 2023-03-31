// Function

fun add(a:Int,b:Int):Int// With Parameter and with Return type
{
    return a+b
}
fun add2(a:Int,b:Int)//With without
{
    var c=a+b
    println(c)
}
fun add3():Int //without with
{
    var a=5
    var b=6
    var c=a+b
    return c
}
fun add4() //without without
{
    var a=5
    var b=6
    var c=a+b
    println(c)
}
fun main()
{
    println(add(6,5))
    add2(5,6)
    println(add3())
    add4()

}
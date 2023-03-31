/*Write a program to perform addition, subtraction, multiplication and division of two
numbers using Function*/
fun add(a:Int,b:Int):Int
{
    println("Addition:")
    return a+b
}
fun sub(a:Int,b:Int):Int
{
    println("Substraction:")
    return a-b
}
fun multi(a:Int,b:Int):Int
{
    println("Multiplication:")
    return a*b
}
fun div(a:Int,b:Int):Int
{
    println("Division:")
    return a/b
}
fun main()
{
    println(add(10,8))
    println(sub(10,5))
    println(multi(5,9))
    println(div(12,6))
}


fun fibo(n:Int)
{
    println("Enter Number:")
    var n=readLine()!!.toInt()
    var a=0
    var b=1
    var c=0
    println("Fibonacci Series:")
    for(i in 1..n)
    {
        println(a)
        c=a+b
        a=b
        b=c
    }
}
fun main()
{
    println(fibo(5))
}
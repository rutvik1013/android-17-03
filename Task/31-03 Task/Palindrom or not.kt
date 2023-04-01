/* Write a Program of Print a number and check the number is palindrome or not using
recursive Function*/
fun main()
{
    println("Enter Any Number:")
    var n= readLine()!!.toInt()
    var p=rec(n)
    if(p==n)
        println("Palindrom")
    else
        println("Not Palindrom")
}
fun rec(n:Int):Int {
    var a=0

    if(n==0)
    {
        return a
    }
    a=(a*10)+(n%10)
  run  {
        return rec(n / 10)
    }
}

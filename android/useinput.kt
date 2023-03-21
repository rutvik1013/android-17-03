fun main()
{
    println("Enter your Name: ")
    var name=readLine()

    println("Enter your Mobile Number:")
    var number=readLine()!!.toBigInteger()
     var email1="@"

    println("Enter your Email:")
    var email=readLine()

    if(email!!.contains(email1))
    {
        println("Email is valid")
    }
    else
    {
        println("Email is not valid")
    }

    println("Name:$name")
    println("Mobile Number:$number")
}
fun main()
{
    println("Enter Your Age:")
    var age=readLine()!!.toInt()

    if(age>=18) println("You can Vote")else println("You cannot Vote")
}
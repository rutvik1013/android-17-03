fun main()
{
    println("Enter first number: ")
    var a=readLine()!!.toInt()

    println("Enter second number: ")
    var b=readLine()!!.toInt()

    println("Enter third number:: ")
    var c=readLine()!!.toInt()

    if(a<b)
    {
      if(b<c)
      {
          println("B is max")
      }
        else
      {
          println("C is max")
      }
    }
    else
    {
        println("A is max")
    }
}


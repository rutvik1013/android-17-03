fun main()
{
    println("Enter Maths marks: ")
    var m=readLine()!!.toInt()

    println("Enter gujarati marks: ")
    var g=readLine()!!.toInt()

    println("Enter English: ")
    var e=readLine()!!.toInt()

    println("Enter Hindi marks: ")
    var h=readLine()!!.toInt()

    println("Enter science marks: ")
    var s=readLine()!!.toInt()

    var total=m+g+e+h+s
    println("Total=$total")

    var per=total/5
    println("Percentage=$per")

    if(per>75)
    {
        println("Distinction:")
    }
    else if(per>60&&per<=75)
    {
        println("First class")
    }
    else if(per>50&&per<=60)
    {
        println("Second class")
    }
    else if(per>35&&per<=50)
    {
        println("Pass class")
    }
    else
    {
        println("Fail")
    }
}
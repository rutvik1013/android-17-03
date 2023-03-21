fun main()
{


    println("Enter your maths marks: ")
    var m= readLine() !!.toInt()

    println("Enter your scince marks: ")
    var s=readLine() !!.toInt()

    println("Enter your gujarati marks: ")
    var g=readLine() !!.toInt()

    println("Enter your hindi marks: ")
    var h=readLine()!!.toInt()

    println("Enter your English marks: ")
    var e=readLine() !!.toInt()

    var Total=m+s+g+e+h
    println("Total=$Total")


    var per = Total/5
    println("Percentage=$per")







}
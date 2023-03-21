fun main()
{
    println("Enter your age: ")
    var age=readLine()!!.toInt()

    if(age>=18)
    {
        println("Eligible for vote")

        if(age>=60)
        {
            println("Senior Citizen")
        }
        else
        {
            println("Young Age")
        }
    }
    else
    {
        println("Not Eligible for vote")
    }
}
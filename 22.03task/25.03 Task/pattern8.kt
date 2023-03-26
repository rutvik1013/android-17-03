fun main()
{
    for(i in 1..5)
    {
        for(k in i downTo 5-1)
        {
            println(" ")
        }
        for(j in 1..i)
        {
            print("$j")
        }
        println()
    }
}
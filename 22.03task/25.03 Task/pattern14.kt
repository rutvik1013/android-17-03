fun main()
{
    for(i in 5 downTo(1))
    {
        for(k in i..5-1)
        {
            print(" ")
        }
        for(j in 1..2*i-1)
        {
            print("*")
        }
        println()
    }
}
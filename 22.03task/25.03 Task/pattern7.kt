fun main()
{
    for(i in 1..5)
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
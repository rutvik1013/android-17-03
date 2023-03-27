fun main()
{
    for(i in 1..5)
    {
        for(a in (5-1)downTo i)
        {
            print(" ")
        }
        for(b in 1..i)
        {
            print("* ")
        }
        println()
    }
    for(c in 4 downTo 1)
    {
        for(d in(4-1)downTo c)
        {
            print(" ")
        }
        for(d in 1..c)
        {
            print(" *")
        }
        println()
    }
}
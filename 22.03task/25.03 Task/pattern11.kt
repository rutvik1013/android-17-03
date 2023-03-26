fun main()
{
    var n=5
    for(i in 1..n)
    {
        for(j in i..n)
        {
            print(i+j%2)
        }
        println()
    }
}
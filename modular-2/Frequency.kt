fun main()
{
    val str="RutvikSinh Babariya"
    val ch='a'
    var frequency=0

    for(i in 0..str.length-1)
    {
        if(ch==str[i])
        {
            ++frequency
        }
    }
    println("Frequency of $ch=$frequency")
}
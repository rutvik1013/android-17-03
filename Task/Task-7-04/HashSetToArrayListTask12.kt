//Write a Java program to convert a hash set to a List/ArrayList.

fun main()
{
    var hash=HashSet<String>()
    hash.add("A")
    hash.add("B")
    hash.add("C")
    for(i in hash)
    {
        println(i)
    }

    var a= arrayListOf<String>("A","B","C")
    println("ArrayList:"+a)

}



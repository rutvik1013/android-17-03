import kotlin.jvm.internal.Intrinsics.Kotlin

// Write a Java program to extract a portion of a array list.
fun main()
{
    var a= arrayListOf<String>()
    a.add("C++")
    a.add("C Programming")
    a.add("Python")
    a.add("Java")
    a.add("Kotlin")
    println("....................")
    for(i in a)
    {
        println(i)
    }
    println(".......................")
    println(a.get(3))

}


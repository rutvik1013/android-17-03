import java.util.*
import kotlin.collections.HashSet

// Write a Java program to convert a hash set to an array.
fun main()
{
    var a=HashSet<String>()
    a.add("A")
    a.add("B")
    a.add("C")
    for(i in a)
    {
        println(i)
    }
    var array= arrayOfNulls<String>(a.size)
    a.toArray(array)
    println("Array:${Arrays.toString(array)}")
}
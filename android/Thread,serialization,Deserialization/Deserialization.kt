import java.io.FileInputStream
import java.io.ObjectInputStream

fun main()
{
    var o1= ObjectInputStream(FileInputStream("D://abc.txt"))
    var s1:Student=o1.readObject() as Student
    println(s1.id)
    println(s1.name)
}
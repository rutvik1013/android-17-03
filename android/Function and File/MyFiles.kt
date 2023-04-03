import java.io.FileOutputStream

fun main()
{
    var data="Welcome to tops"
    var a=FileOutputStream("D://rutvik.txt")
    a.write(data.toByteArray())
}
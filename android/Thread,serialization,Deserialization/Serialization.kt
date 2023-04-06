import java.io.FileOutputStream
import java.io.ObjectOutputStream

fun main()
{
    var s1=Student(101,"Rutvik")
    var fout= FileOutputStream("D://abc.txt")
    var out= ObjectOutputStream(fout)
    out.writeObject(s1)
}
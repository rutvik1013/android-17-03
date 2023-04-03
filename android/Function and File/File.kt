import java.io.FileOutputStream

fun main()
{
    println("Enter Name:")
    var n=readLine()!!.toString()

    println("Enter surname:")
    var s=readLine()!!.toString()

    println("Enter E_mail:")
    var e= readLine()!!.toString()

    println("Enter passWord:")
    var p= readLine()

    println("Enter conform password:")
    var c= readLine()

    var name1="Name:$n,Surname:$s,E_mail:$e,PassWord:$p,Conform_password,$c"

    if(e!!.contains(e))
    {
        if(p==c)
        {
            var a=FileOutputStream("D://File.txt")
            a.write(name1.toByteArray())
        }
        else
        {
            println("PassWord is Not valid")
        }

    }
    else
    {
        println("E_mail is Not valid:")
    }
}





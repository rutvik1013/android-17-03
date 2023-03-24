class default(var id:Int,var name:String,var surname:String,var email:String )
{
    fun display()
    {
        println("$id,$name,$surname,$email")
    }
}
fun main()
{
    var d=default(101,"Prakruti","vyas","prakruti@gmail.com")
    var d1=default(102,"Rutvik","Babariya","Rutvik@gmail.com")
    var d2=default(103,"Manan","Viradiya","Manan@gmil.com")

    d.display()
    d1.display()
    d2.display()
}
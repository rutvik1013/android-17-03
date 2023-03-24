class primary
{
    constructor(id:Int)
    {
        println("$id")
    }

    constructor(id:Int,name:String)
    {
        println("$id,$name")
    }
    constructor(id:Int,name:String,surname:String)
    {
        println("$id,$name,$surname")
    }
}
fun main()
{
    var p1=primary(101,"Manan")
    var p2=primary(102,"Rutvik","Babariya")
}
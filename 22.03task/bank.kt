class bank {
    constructor(id:Int)
    {
        println("$id")
    }
    constructor(id:Int,name:String)
    {
        println("$id,$name")
    }
    constructor(id:Int,name:String,acc_no:Int)
    {
        println("$id,$name,$acc_no")
    }

}
fun main()
{
    var b1=bank(102,"Rutvik")
    var b2=bank(102,"Rutvik",10009898)
}
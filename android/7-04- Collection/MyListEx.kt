// Add -> Add Single Eements
// addAll-> add All list
//remove->Single object
// removeAt->remove single  object through index
//retainAll->get common details

fun main()
{
    var list=ArrayList<String>()
    list.add("Android")
    list.add("Java")
    list.add("Php")
    list.add("Flutter")


    var list2=ArrayList<String>()
    list2.add("ST")
    list2.add("GD")
    list2.add("WD")
    list2.add("Android")
    println(message = ".............................................")

//    list.addAll(list2)
//    list.remove("Wd")
//    list.removeAt(4)

  list.retainAll(list2)
    for(i in list)
    {
        println(i)
    }
}
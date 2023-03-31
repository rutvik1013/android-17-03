// Write a Program of Factorial using Recursive Function

fun main(args: Array<String>) {
    val n = 5
    val factorial =fact(n)
    println("Factorial of $n = $factorial")
}

fun fact(n: Int): Long {
    if (n >= 1)
        return n*fact(n - 1)
    else
        return 1
}
package basicFunctions

fun reverse(num: Int):Int {
    var number = num
    var reversed = 0
    while(number != 0) {
        val digit =number % 10
        reversed = reversed * 10 + digit
        number /= 10
    }
    return reversed
}
fun main() {
    val res :Int = reverse(23)
    println(res)
}
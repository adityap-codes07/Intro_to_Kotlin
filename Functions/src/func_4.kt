fun func4(name : String, age : Int = 12):String {
    return "hii $name, congrats on you $age Birthday"
}
fun main() {
    val res : String = func4(name = "addy")
    println(res)
}
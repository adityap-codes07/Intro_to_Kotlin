package basicFunctions

fun main() {
    birthdayGreet(age= 21, name = "Addy")
}
fun birthdayGreet(name : String,age : Int) {
    println("Happy Birthday $name, congratulations on your $age birthday.")
}
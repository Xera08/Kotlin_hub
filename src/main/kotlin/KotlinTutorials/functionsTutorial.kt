package KotlinTutorials

fun main() {
    val a: Int = 56
    val b: Int = 97

    println("Is number ${a} even? ${checkEven(a)}")
    println("Is number ${b} even? ${checkEven(b)}")

}

fun checkEven(number: Int): Boolean {
    if (number % 2 == 0) {
        return true
    } else {
        return false
    }
}
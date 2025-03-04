package KotlinTutorials

fun main() {
    val cars = arrayOf("Volvo", "BMW", "Ford", "Mazda")

    println(cars[0])
    cars[0] = "Opel"
    println(cars[0])
    println(cars.size)

    if ("Volvo" in cars) {
        println("It exists!")
    } else {
        println("It does not exist.")
    }

    for (x in cars) {
        println(x)
    }
}
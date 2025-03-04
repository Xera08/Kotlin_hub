package KotlinTutorials

fun main() {
    var i = 0
    while (i < 5) {
        println(i)
        i++
    }


    var a = 0
    do {
        println(a)
        if (a == 2) {
            break
        }
        if (a == 1) {
            a++
            continue
        }
        println("YARRR!")
        a++

    }
    while (a < 4)
}
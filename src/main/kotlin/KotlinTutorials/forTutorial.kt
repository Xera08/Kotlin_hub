package KotlinTutorials

fun main() {

    var languages: Array<String> = arrayOf("Ukr", "Eng", "Ger", "Swe", "Ita")
    for (language in languages) {
        println(language)
    }

    println()
    for (i in 0..3) { // ranges tutorial
        println(languages[i])
    }

}
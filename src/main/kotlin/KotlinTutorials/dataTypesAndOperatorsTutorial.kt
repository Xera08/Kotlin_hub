package KotlinTutorials

fun main() {
    val myNum = 5             // Int
    val myDoubleNum = 5.99    // Double
    val myLetter = 'D'        // Char
    val myBoolean = true      // Boolean

    val myText = "Hello"      // String
    var myText2: String
    myText2 = " World!"
    println(myText.lowercase() + myText2.uppercase())
    println(myText.indexOf("Hell"))

    val shortNum: Short = 5000   // from -32768 to 32767
    val intNum: Int = 100000     // from -2147483648 to 2147483647
    val longNum: Long = 15000000000L  // from -9223372036854775808 to 9223372036854775807

    val convertedNum: Long = shortNum.toLong()

    val myNum1: Float = 35E3F // 35 * 10^3
    val myNum2: Double = 12E4 // 12 * 10^4
    println(myNum1)
    println(myNum2)
}
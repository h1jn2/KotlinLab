package ch2.section4_control

fun main() {
    val a = 5

    if (a < 10) println("$a < 10")

    if (a > 0 && a <= 10) println("a > 0 && a <= 10")
    else if (a > 10 && a <= 20) println("a > 10 && a <= 20")
    else println("a > 20")

    if (a > 10) "hello"

    val result = if (a > 10) "hello" else "world"
    println(result)

    val result2 = if (a < 10) {
        println("hello")
        10 + 20
    } else {
        println("world")
        20 + 20
    }

    println(result2)

    val result3 = if (a > 20) 10
    else if (a > 30) 30
    else 40

    println(result3)
}
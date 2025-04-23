package ch2.section4_control

fun main() {
    val a = 1

    fun testWhen(data: Any) {
        when (data) {
            1 -> println("1")
            "hello" -> println("hello")
            is Boolean -> println("Boolean Type")
            else -> {}
        }
    }

    when (a) {
        10, 20, 30 -> println("10, 20, 30")
        40, 50 -> println("40, 50")
        10 + 20 -> println("30")
    }

    when(a) {
        in 1 .. 10 -> println("1..10")
        !in 11 .. 20 -> println("11..20")
    }

    val result = when(a) {
        1 -> "1"
        2 -> "2"
        3 -> {
            println("3")
            3
        }
        else -> 0
    }

}
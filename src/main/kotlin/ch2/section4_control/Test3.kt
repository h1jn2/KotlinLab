package ch2.section4_control

fun main() {
    for(i in 1..10) {
        print("$i ")
    }
    println()
    for (i in 1 until 10) {
        print("$i ")
    }
    println()
    for (i in 1..10 step 2) {
        print("$i ")
    }
    println()
    for (i in 10 downTo 1 step 2) {
        print("$i ")
    }
    println()

    val array = arrayOf("hello", "world")

    for (value in array) {
        print("$value ")
    }
    println()
    for (index in array.indices){
        print("$index ")
    }
    println()
    for ((index, value ) in array.withIndex()) {
        print("$index, $value")
    }
}
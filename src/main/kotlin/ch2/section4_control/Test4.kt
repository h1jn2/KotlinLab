package ch2.section4_control

fun main() {
    aaa@ for (i in 1..3) {
        for (j in 1..3) {
            if (j > 1) break@aaa
            println("$i $j")
        }
    }
}
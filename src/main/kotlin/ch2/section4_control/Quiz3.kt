package ch2.section4_control

class Quiz3 {

}

fun main() {
    print("양수 입력: ")
    val number = readln().toIntOrNull() ?: 0

    for (i in 2..number) {
        for (j in 2..i) {
            if (i % j == 0 && i != j) break
            if (i == j) print("$i ")
        }
    }
}
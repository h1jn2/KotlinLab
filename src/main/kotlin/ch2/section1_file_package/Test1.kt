package ch2.section1_file_package

// top level 에 선언된 변수, 함수는 동일 패키지 내에서 global 처럼 이용
var sum = 0

fun calSum() {
    for (i in 1 .. 10) {
        sum += i
    }
}

class User {
    val name = "kim"
    fun sayHello() {
        println("Hello " + name)
    }
}

fun main() {
    println("Hello Kotlin")
    calSum()
    User().sayHello()
}
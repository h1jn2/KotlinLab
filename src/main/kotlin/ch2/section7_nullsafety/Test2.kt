package ch2.section7_nullsafety

fun main() {
    class User

    // 일반 객체 무조건 객체(주소값) 비교
    val user1: User = User()
    val user2: User? = user1
    println("user1 == user2 : ${user1 == user2}")   // true
    println("user1 === user2 : ${user1 === user2}") // true

    val data1: Int = 1000
    val data2: Int = 1000
    val data3: Int? = 1000
    val data4: Int? = 1000
    // 기초타입, non-null 무조건 값 비교
    println("data1 == data2 : ${data1 == data2}")   // true
    println("data1 === data2 : ${data1 === data2}") // true
    // 기초타입, nullable == 값 비교, === 객체(주소값) 비교
    println("data3 == data4 : ${data3 == data4}")   // true
    println("data3 === data4 : ${data3 === data4}") // false
}
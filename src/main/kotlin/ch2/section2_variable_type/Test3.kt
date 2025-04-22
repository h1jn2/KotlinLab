package ch2.section2_variable_type.three

val intData: Int = 10
var result = intData.minus(5)

fun main() {
    result = intData.minus(5)

    val a1: Int = 123
    val a2: Long = 10L
    val a3: Double = 10.0
    val a4: Float = 10.0f

    val a5 = 100_000_000_000

    val str1 = "hello \n world"
    val str2 ="""
        hello
        world
    """

    println(str1)
    println(str2)

    fun sum(no: Int): Int {
        var sum = 0
        for (i in 1 .. no) {
            sum += i
        }
        return sum
    }

    val name = "홍길동"

    println("name: $name , sum: ${sum(5)}")
}
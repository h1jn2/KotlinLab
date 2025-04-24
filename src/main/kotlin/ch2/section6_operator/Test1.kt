package ch2.section6_operator

fun someFun(vararg a: String) {
    val iterator = a.iterator()

    while (iterator.hasNext())
        println(iterator.next())
}

// 연산자 재정의
class MyClass {
    var no = 0
    operator fun plus(arg: Int): Int {
        return no - arg
    }
}

operator fun MyClass.minus(arg: Int): Int {
    return no + arg
}

fun main() {
    val array = arrayOf("hello", "world")
    someFun("one", "two", *array)

    val list = listOf("hello", "world")
    someFun("one", *list.toTypedArray(), "two")

    val obj = MyClass()
    println("${obj + 10}, ${obj - 5}")
}
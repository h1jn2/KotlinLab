package ch2.section8_exception

fun some(array: Array<Any>) {
    try {
        val intData = array[0] as Int
        val data: String = array[2] as String
        val data2: Int = data.toInt()
    } catch (e: ClassCastException) {
        println("ClassCastException")
    } catch (e: ArrayIndexOutOfBoundsException) {
        println("ArrayIndexOutOfBoundsException")
    } catch (e: Exception) {
        println("Exception")
    }
}

fun some2(arg: String): Int {
    // try-catch Expression 으로 활용 가능
    return try {
        println("try")
        arg.toInt()
        10
    } catch (e: Exception) {
        println("exception")
        0
    } finally {
        println("finally")
        100
    }
}

fun main() {
    val array = arrayOf<Any>("0", 1, "6")
    some(array)
    val array2 = arrayOf<Any>(10, "5")
    some(array2)

    println(some2("2"))
    println(some2("hello"))
}
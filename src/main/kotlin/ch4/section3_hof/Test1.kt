package ch4.section3_hof

fun main() {
    fun hofFun(x1: Int, argFun: (Int) -> Int) {
        val result = argFun(10)
        println("$x1, $result")
    }

    hofFun(10, { x -> x * x })
    hofFun(10) { x -> x + x }

    fun hofFun2(no: Int, argFun1: (Int) -> Int, argFun2: (Int) -> Boolean) {
        argFun1(10)
        argFun2(10)
    }

    hofFun2(10, { it * it }, { it > 100 })

    val array = arrayOf(10, 20, 15, 22, 8)
    array.filter { it > 10 }
        .forEach { println(it) }

    fun hofFun3(str: String): (x1: Int, x2: Int) -> Int {
        when (str) {
            "-" -> return { x1, x2 -> x1 - x2 }
            "+" -> return { x1, x2 -> x1 + x2 }
            "*" -> return { x1, x2 -> x1 * x2 }
            else -> return { x1, x2 -> x1 / x2 }
        }
    }

    val resultFun = hofFun3("*")    // hotFun3 의 리턴값인 함수가 들어감
    println(resultFun(10, 20))

    fun myFilter(list: List<Int>, arg: (Int) -> Boolean): List<Int> {
        val resultList = mutableListOf<Int>()
        val iterator = list.iterator()
        while (iterator.hasNext()) {
            val no = iterator.next()
            val result = arg(no)
            if (result) resultList.add(no)
        }
        return resultList
    }

    val testList = listOf(10, 20, 3, 6, 30)
    myFilter(testList) { it > 15 }.forEach { println(it) }
}
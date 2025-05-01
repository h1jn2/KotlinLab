package ch4.section3_hof

fun main() {
    val fun1 = { x: Int ->
        println("hello world")
        x * 10
    }

    val fun2 = fun(x: Int): Int {
        println("hello world")
        return x * 10
    }

    val fun3 = fun(x: Int): Int = x * 10

    fun hofFun(argFun: (Int) -> Int) {
        argFun(10)
    }
    hofFun(fun(x: Int): Int = x * 10)
}
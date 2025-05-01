package ch4.section3_inline

// inline 함수 내에서 매개변수 중 inline 되지 않고 함수로 유지되어야 하는 함수를 지칭
// 대표적으로 inline 의 매개변수 함수인데 inline 에서만 사용하지 않고
// 다른 hof 를 호출하면서 매개변수로 전달하는 경우 -> noinline
inline fun test1(argFun1: (x: Int) -> Int, noinline argFun2: (x: Int) -> Int) {
    argFun1(10)
    argFun2(10)
}

open class TestClass {
    open fun some() {}
}

// crossinline: inline 함수에 전달되는 람다함수임에도 불구하고
// non local return 을 못하게 할 때 -> return 못 쓰게 할 때
// 다른 context 즉 객체에 대입되어 사용이 될 때
inline fun test2(crossinline argFun:() -> Unit) {
    val obj = object : TestClass() {
        override fun some() = argFun()
    }
}

fun main() {
    test1({ it * 10 }, { it * 20 })

    test2 {
        println("test2")
//        return    // error
    }
}
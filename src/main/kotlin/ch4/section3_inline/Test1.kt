package ch4.section3_inline

fun myFun1(argFun: (Int) -> Int): Int {
    return argFun(10)
}

inline fun myFun2(argFun: (Int) -> Int): Int {
    return argFun(10)
}

fun testFun() {
    myFun1 { it * 10 }
    myFun2 { it * 20 }
}

fun some(fun1: (Int, Int) -> Int, fun2: (Int) -> Int): Int {
    val result = fun1(10, 20)
    val result2 = fun2(result)
    println("some")
    return result2
}

inline fun some2(fun1: (Int, Int) -> Int, fun2: (Int) -> Int): Int {
    val result = fun1(10, 20)
    val result2 = fun2(result)
    println("some2")
    return result2
}

fun localReturnTestFun() {
    var result = some({ arg1, arg2 -> arg1 * arg2 }) { result ->
        if (result < 0) return@some 0
        else return@some result
    }

    println("test1 $result")

    result = some2({ arg1, arg2 -> arg1 * arg2 }) { result ->
        if (result < 0) return@some2 0
        else return@some2 result
    }

    println("test2 $result")
}

fun nonLocalResultTest(): Int {
    // non local return 일반 hof 에서 사용 불가
//    some({ arg1, arg2 -> arg1 * arg2 }) { result ->
//        if (result < 0) return 0
//        else return result
//    }

    some2({ arg1, arg2 -> arg1 * arg2 }) { result ->
        if (result < 0) return 0
        else return result
    }
    return 0
}

fun main() {
    testFun()

//    some
//    test1 200
//    some2
//    test2 200
    localReturnTestFun()

    nonLocalResultTest()

}
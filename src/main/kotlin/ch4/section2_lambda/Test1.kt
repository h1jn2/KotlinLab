package ch4.section2_lambda

// 동일한 함수 타입이 여러번 사용된다면 편의성을 위해 타입을 정의하고 이용
typealias MyFunType = (Int) -> Boolean
typealias MyInt = Int

fun main() {
    var some = { no: Int -> println("some $no") }
    some(10)

    // 윗 줄의 some 에 의해 함수 타입이 (Int) -> Unit 으로 고정
//    some = { arg: String -> println("some $arg") }  // error

    // 람다 함수 내에 return 사용 불가
    val some2 = { arg1: Int, arg2: Int ->
        println("$arg1, $arg2")
        arg1 * arg2
    }

    println(some2(10, 20))

    // 매개변수를 가지지 않는 람다함수는 -> 생략 가능
    val some3 = {
        println("some3")
        10 * 10
    }

    // 함수 타입이 선언되어 있다면 매개변수의 타입 유추 가능
    val some4: (Int, Int) -> Boolean = { arg1, arg2 ->
        if (arg1 > arg2) true
        else false
    }

    val some5: MyFunType = { arg ->
        true
    }

    // 매개변수 하나이고 타입 유추 가능한 경우 it 으로 대체 가능
    val some6: (Int) -> Int = { it * 10 }

    class User(val name: String, val age: Int)
    val some8: (User) -> Int = { it.age }
}
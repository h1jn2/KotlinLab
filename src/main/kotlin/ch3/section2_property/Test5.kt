package ch3.section2_property.test5

import kotlin.properties.Delegates

// 초기값, 변경 순간의 callback
class User {
    var name: String by Delegates.observable("", {props, old, new ->
        println("old: $old, new: $new")
    })
}

lateinit var data1: String
class Test {
    lateinit var data2: String
    fun some() {
        // 초기화 되었는 지 확인
        // :: 코틀린에서의 참조 지정 방법
        println(::data2.isInitialized)
    }

    fun isData2Initialized(): Boolean {
        return ::data2.isInitialized
    }
}

fun main() {
    val user = User()
    println(user.name)
    user.name = "kim"
    user.name = "lee"
    println(user.name)

    val obj = Test()
    obj.some()

    println(::data1.isInitialized)
    println(obj.isData2Initialized())

    data1 = "hello"
    obj.data2 = "world"

    println(::data1.isInitialized)
    println(obj.isData2Initialized())
}
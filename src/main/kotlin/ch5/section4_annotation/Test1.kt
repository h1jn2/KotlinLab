package ch5.section4_annotation

import java.lang.reflect.Method

// 단위 테스트
// 애플리케이션 테스트

annotation class TestBegin

annotation class TestEnd

annotation class TestEqualsInt(val expect: Int, val desc: String)

class MyClass {
    fun some(arg1: Int, arg2: Int): Int {
        return arg1 + arg2
    }
}

class Test {
    val obj = MyClass()

    @TestBegin
    fun begin() {
        println("begin")
    }

    @TestEnd
    fun end() {
        println("end")
    }

    @TestEqualsInt(expect = 10, desc = "some() equals test")
    fun some(): Int {
        return obj.some(5, 5)
    }
}

// junit 에서 실행되는 코드라는 가정
fun main() {
    val obj = Test()

    val methods = Test::class.java.methods

    val beginMethodList = mutableListOf<Method>()
    val endMethodList = mutableListOf<Method>()
    val assetMethodList = mutableListOf<Method>()

    for (method in methods) {
        if (method.isAnnotationPresent(TestBegin::class.java))
            beginMethodList.add(method)
        if (method.isAnnotationPresent(TestEnd::class.java))
            endMethodList.add(method)
        if (method.isAnnotationPresent(TestEqualsInt::class.java))
            assetMethodList.add(method)
    }

    for (method in beginMethodList) {
        // TestBegin 어노테이션이 추가된 그 함수 호출
        // 함수를 호출하기 위해서는 매개변수가 먼저 준비되어야 함 없어도 준비
        val arguments = arrayOfNulls<Any>(0)
        method.invoke(obj, *arguments)
    }

    for (method in assetMethodList) {
        val annotation = method.getAnnotation(TestEqualsInt::class.java)
        val expect = annotation.expect
        val desc = annotation.desc

        println("Test $desc")
        val arguments = arrayOfNulls<Any>(0)
        val result = method.invoke(obj, *arguments) as Int
        if (result == expect)
            println("result ok expect: $expect, result: $result")

    }
    for (method in beginMethodList) {
        val arguments = arrayOfNulls<Any>(0)
        method.invoke(obj, *arguments)
    }
}

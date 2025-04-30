package ch3.section9_object.three

interface SomeInterface {
    fun interfaceFun()
}

open class SomeClass {
    fun someClassFun() {
        println("someClassFun")
    }
}

class Outer {
    // 타입을 가지는 익명클래스의 객체 -> Any 타입이 아님
    // 상위 타입 혹은 interface 타입으로 이용
    val myInner: SomeClass = object: SomeClass(), SomeInterface {
        override fun interfaceFun() {

        }
    }

    // 객체명 선언
    object MyObject {
        var no = 0
        fun myFun() { }
    }

    // companion
    companion object MyObject2 {
        var no = 0
        fun myFun() { }
    }

    object AA: SomeClass() {

    }
}

fun main() {
    val obj = Outer()
    obj.myInner.someClassFun()

    Outer.MyObject.no++
    Outer.MyObject.myFun()
//    Outer.MyObject()  // error 클래스가 아닌 객체이기 때문에 생성 불가

    // companion
    Outer.MyObject2.no++
    Outer.MyObject2.myFun()

    Outer.no++
    Outer.myFun()


}
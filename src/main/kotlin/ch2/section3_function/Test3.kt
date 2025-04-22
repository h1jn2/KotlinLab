package ch2.section3_function

// infix
class MyClass {
    infix fun myFun(a: Int) {
        println("MyClass myFun call $a")
    }
}

// extension 기법: 클래스 외부에서 특정 클래스에 멤버 추가가 가능
// 아무 클래스에 다 추가 가능
infix fun MyClass.myFun2(a: Int) { }
infix fun Int.myFun3(x: Int) { }

fun main() {
    val obj = MyClass()
    obj.myFun(10)
    obj myFun 10
    obj.myFun2(10)
    obj myFun2 10

    val no: Int = 10
    no.myFun3(10)
    no myFun3 10

    // 가변 인수
    fun someFun(arg1: Int, vararg arg2: Int) {
        for (a in arg2) {
            println(a)
        }
    }

    someFun(10)
    someFun(10, 20, 30, 40)
}
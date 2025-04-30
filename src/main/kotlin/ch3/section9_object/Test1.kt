package ch3.section9_object

class Outer {
    var no: Int = 10
    fun outerFun() {
        println("outerFun")
    }

    // nested class 는 자바의 static inner class
    // static 이기 때문에 object 멤버 이용 불가
    class Nested {
        var name: String = "kim"
        fun myFun() {
            name = "kim"
//            no = 20       // error
//            outerFun()    // error
        }
    }
}

// inner class 는 object 멤버로 추가 되기 때문에 object 멤버 이용 가능
class Outer2 {
    var no: Int = 10
    fun outerFun() {
        println("outerFun")
    }

    inner class Nested2 {
        var name: String = "kim"
        fun myFun() {
            name = "kim"
            no = 20
            outerFun()
        }
    }
}

fun main() {
    // nested class 는 static 멤버이므로 outer 클래스 명으로 바로 접근
    val obj = Outer.Nested()
    obj.myFun()

    // object 멤버이기 때문에 객체 생성한 후에 접근
    val obj2 = Outer2()
    obj2.Nested2().myFun()
}
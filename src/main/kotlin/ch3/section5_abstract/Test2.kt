package ch3.section5_abstract.test2

interface MyInterface1 {
    fun myFun1()
}

interface MyInterface2 {
    fun myFun2()
}

open class Super {
    fun mySuperFun() { }
}

// 상위 클래스 (1개), 인터페이스 (n개) 순서 없음
class Sub: Super(), MyInterface1, MyInterface2 {
    override fun myFun1() {
        TODO("Not yet implemented")
    }

    override fun myFun2() {
        TODO("Not yet implemented")
    }
}

class Sub2: Super(), MyInterface1, MyInterface2 {
    override fun myFun1() {
        TODO("Not yet implemented")
    }

    override fun myFun2() {
        TODO("Not yet implemented")
    }
}

fun main() {
    val obj: Sub = Sub()
    val obj1: Super = Sub()
    obj1.mySuperFun()
    obj.myFun1()

    // interface 는 타입으로 활용 가능
    val obj2: MyInterface1 = Sub()
    obj2.myFun1()
}

interface MyInterface3 {
    // 추상형으로 선언 -> java 로 변형 시점에 getter/setter 가 추상형이 됨
    val data1: Int

    // interface 에서 field 가질 수 없음
    // 값을 직접 대입하면 이 변수가 자바 interface 에 선언되어야 하는데
    // 자바 interface 는 static final 만 허용, 일반 변수 허용하지 않음
//    val data2: String = "kim" // error


    // get() 추가되면 추상형이 아님 (field 는 자바의 변수를 지칭)
//    val data2: String     // error
//        get() = field

    // 추상형이 아니려면 var 의 경우 get, set 모두 선언 해야 함
    // get 만 선언하면 default set 이 추가되는데 그 곳에 field 가 있기 때문
//    var data3: String     // error
//        get() = "kim"

    val data2: String
        get() = "kim"

    var data3: String
        get() = "kim"
        set(value) { }
}
















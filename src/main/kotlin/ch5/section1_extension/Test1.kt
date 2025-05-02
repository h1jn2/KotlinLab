package ch5.section1_extension

class Test {
    val data: Int = 10
    fun myFun() { println("myFun") }
}

// 초기값 직접 대입 안 되고 getter/setter 에 field 사용 불가

//val Test.extensionData = 10   // error 초기값 못 줌
//val Test.extensionData
//    get = field   // error field 사용 못 함
val Test.extensionData
    get() = 20

var Test.extensionData2: Int
    get() = 30
    set(value) {

    }

// Mutable 클래스가 있고 이 클래스로 마지막 항목을 추출하는 일이 빈번해
// 맨 마지막 항목을 지칭하는 프로퍼티가 있으면 좋겠다
var <T> MutableList<T>.lastItem: T
    get() = this.last()
    set(value) {
        this[this.size - 1] = value
    }

fun Test.extensionFun() {
    println("extensionFun")
}

fun main() {
    val obj = Test()
    println("${obj.data}, ${obj.extensionData}")
    obj.myFun()
    obj.extensionFun()

    val list = mutableListOf(10, 20)
    println(list.lastItem)
    list.lastItem = 50
    println(list.lastItem)
}
package ch5.section5_deligate

import kotlin.reflect.KProperty

interface Print {
    fun print(arg: String)
}

class MyDelegatee: Print {
    override fun print(arg: String) {
        println("delegatee $arg")
    }
}

// 여러 프로퍼티의 getter, setter 에 공통 코드가 있느 ㄴ경우
// 위임을 하나 선언하고 이곳에서 처리하도록
class PropertyDelegate {
    var result: Int = 0

    // 어떤 프로퍼티 값 획득이 발생했을 때 자동으로 실행
    // 매개변수로 원한다면 어떤 프로퍼티에 의해 실행된건지 분석되도록 정보 전달
    operator fun getValue(thisRef: Any?, property: KProperty<*>): Int {
        println("getValue $thisRef, ${property.name}")
        return result
    }

    operator fun setValue(thisRef: Any?, property: KProperty<*>, value: Int) {
        result = 0
        println("setValue $value, ${property.name}")
        for (i in 1 .. value)
            result += 1
    }
}

class Test {
    var sum: Int by PropertyDelegate()
}

class MyDelegator(obj: MyDelegatee): Print by obj

fun main() {
    val obj = MyDelegator(MyDelegatee())
    obj.print("hello")

    val obj2 = Test()
    obj2.sum = 10
    println(obj2.sum)
    obj2.sum = 100
    println(obj2.sum)

}
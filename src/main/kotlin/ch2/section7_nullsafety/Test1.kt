package ch2.section7_nullsafety

var data1: String = "kim"
var data2: String? = "kim"

fun main() {
//    data1 = null  // error
    data2 = null

    // nullable 이 타입적으로 non-null 의 상위타입
    var data3: String? = data1  // 암시적 캐스팅
    data3 = data2

    var data4: String = data1
//    data4 = data2 // error -> 명시적 캐스팅 해야함
    data2 = "kim"
    data4 = data2 as String // -> non-null 명시적 캐스팅
    data2 = null
//    data4 = data2 as String // error
    // 왼쪽 객체가 null 이 아니면 캐스팅 진행
    // null 이면 전체 null
//    data4 = data2 as? String
    val data5: String? = data2 as? String
    val data6: String = data2 as? String ?: ""

    class User {
        var name: String? = "kim"
    }

    val user: User? = User()
    println(user?.name?.length)

    // 객체가 null 이 아닐 때 실행구문, null 일 때 실행구문
    user?.let {
        println("hello")
    } ?: {
        println("world")
    }
}
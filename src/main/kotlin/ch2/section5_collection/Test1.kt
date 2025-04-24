package ch2.section5_collection

fun main() {
    val array = arrayOf(10, "Hello", true)

    array[0] = 20
    array[2] = "world"
    println("${array[0]}, ${array.get(0)}")
    println("${array.size}, ${array.get(0)}")

    val array2 = arrayOf<Int>(10, 20, 30)

    val array3 = intArrayOf(10, 20)
    val array4 = doubleArrayOf(10.0, 20.0)

    // 사이즈만 지정하고 이후에 데이터 지정
    val array5 = arrayOfNulls<Int>(3)
    array5[0] = 10

    // 객체 직접 생성하면서 초기화
    val array6 = Array<String>(3, { "" })
    val array7 = Array<Int>(3, { 0 })

    // { } 함수
    val array8 = Array<Int>(3, { i -> i * 10 })

    // 각 기초타입의 배열 클래스도 제공
    val array9 =
}
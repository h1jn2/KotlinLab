package ch2.section2_variable_type.five

fun main() {
    val data1 = 10
    val data2: Double = data1.toDouble()
//    val data3: Double = data1 as Int  // error 상하위 관계가 아니기 때문

    val data4: Number = data1
    val data5: Int = data4 as Int

    val data6: String = data1.toString()
    val data7: Int = data6.toInt()
}

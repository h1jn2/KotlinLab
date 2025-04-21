package ch2.section2_variable_type.one

val data1: Int = 10
var data2: Int = 20

class MyClass {
    val data3: Int = 10
    var data4: Int = 20

    fun someFun() {
        val data5: Int
        var data6: Int

        data5 = 10
        data6 = 20

        val result = data5 + data6
    }
}
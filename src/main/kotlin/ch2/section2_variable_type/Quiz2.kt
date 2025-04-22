package ch2.section2_variable_type

const val DEPARTMENT_SALE = 0
const val DEPARTMENT_DEV = 1
const val DEPARTMENT_MARKETING = 2

var department = 1

fun calcBonus() {
    if (department == DEPARTMENT_SALE) {
        println("연봉에 10을 곱한다")
    } else if (department ==  DEPARTMENT_DEV) {
        println("연봉에 50을 곱한다")
    }
}

fun main() {
    val data1: Int = 10
    val data2: Double = data1.toDouble()
    val data3: Int = data2.toInt()

    println("data1: $data1 , data2: $data2 , data3: $data3")

    val str = "10"
    val intStr: Int = str.toInt()
    val str2: String = (20).toString()
    println("int Str: $intStr , str2 : $str2")
    println("${str + 10}, ${intStr + 10}")
}
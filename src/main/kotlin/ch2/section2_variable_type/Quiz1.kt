package ch2.section2_variable_type

var javaScore: Int = 83
var pythonScore: Int = 100
var temp: Int = 0

fun main() {
    println("[ 교환 전 ]\njavaScore: $javaScore\npythonScore: $pythonScore")
    println("------------------------")

    temp = javaScore
    javaScore = pythonScore
    pythonScore = temp

    println("[ 교환 후 ]\njavaScore: $javaScore\npythonScore: $pythonScore")

}
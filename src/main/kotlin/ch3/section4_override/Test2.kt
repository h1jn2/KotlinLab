package ch3.section4_override

class Test {
    var data1: String = "hello"
    var data2: String = "world"
//        private get() = field // error
        private set(value) {
            field = value
        }
}

fun main() {
    val obj = Test()
    println("${obj.data1}, ${obj.data2}")
    obj.data1 = "aaa"
//    obj.data2 = "bbb" // error
    println("${obj.data1}, ${obj.data2}")
}
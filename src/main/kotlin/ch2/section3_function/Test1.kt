package ch2.section3_function

fun main() {
    fun sum(a: Int, b: Int): Int {
        var sum = 0

        // 함수 안에 선언했으므로 이 내부 함수는 outer 함수의 local 함수
        // outer 에서 호출해서 사용 / 외부에 리턴
        fun calSum() {
            for (i in a..b) {
                sum += i
            }
        }
        calSum()
        return sum
    }

    val result = sum(1, 10)
    println(result)

    // single expression function
    fun some(a: Int, b: Int): Int {
        return a + b
    }
    fun some1(a: Int, b: Int): Int = a + b
    fun some2(a: Int, b: Int) = a + b

    // overloading
    fun myFun(a: String) { }
    fun myFun(a: String, b: String) { }
    fun myFun(a: Int) { }
}
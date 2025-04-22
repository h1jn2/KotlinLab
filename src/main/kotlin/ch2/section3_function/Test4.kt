package ch2.section3_function

// 매개변수 개수만큼 업무 반복
fun loogPrint (no: Int = 1) {
    var count = 1
    while (true) {
        println("hello")
        if (no == count) return
        else count++
    }
}

// 위의 로직을 재귀 알고리즘으로 구현
fun recPrint(no: Int = 1, count: Int = 1) {
    println("recPrint")
    return if (no == count) return else recPrint(no - 1, count)
}

tailrec fun tailRecPrint(no: Int = 1, count: Int = 1) {
    println("tailRecPrint")
    return if (no == count) return else tailRecPrint(no - 1, count)
}

// tailrec 을 추가했다고 모든 함수가 재귀해제 되는 것이 아니라
// 함수의 마지막 실행 구문이 자신 함수 호출하는 경우만 가능
tailrec fun sum(no: Int): Int {
    if (no < 0) return no
    else return no + sum(no - 1)
}

fun main() {
    loogPrint(3)
    recPrint(3)
    tailRecPrint(3)
    println(sum(5))
}
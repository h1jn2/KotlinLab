package ch4.section5_collection_api

fun main() {
    // forEach: for 대체용 람다함수 순차적으로 데이터 전달하면서 실행
    val list1 = listOf(12, 8, 9, 20)
    list1.forEach { println(it) }

    // fold: 이전 실행 결과를 자동으로 그 다음 실행 시 매개변수로 전달
    // 초기값 지정 가능 -> 10
    // total:  이전 결과값, next: 다음 값
    var result = list1.fold(10, { total, next ->
        println("$total, $next")
        total + next
    })
    println("result: $result")

    list1.filter { it > 10 }.forEach { println(it) }

    list1.map { it * 10 }.filter { it > 100 }.forEach { println(it) }
}
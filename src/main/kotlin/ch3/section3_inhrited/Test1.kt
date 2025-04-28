package ch3.section3_inhrited

open class Shape() {
    var x: Int = 0
    var y: Int = 0
    fun draw() { }
}

// 상위 클래스에
class Rect: Shape() {
    var width: Int = 0
}

fun main() {
    val obj = Rect()

    println("${obj.x}, ${obj.y}, ${obj.width}")
}

open class Super(name: String){
    constructor(name: String, age: Int): this(name)
}

// case1 - 주생성자만 선언된 경우
// 클래스 선언 부분에서 상위 생성자 호출 구문 명시
class Sub: Super("a")
class Sub1: Super("a", 10)

// case2 - 보조생성자만 있는 경우
// 상위 생성자 호출 구문을 보조 생성자의 선언 영역에서 명시할 수 없음
class Sub2: Super {
    constructor(name: String): super(name)
    constructor(name: String, age: Int): super(name, age)
}

// case3 - 보조, 주생성자 모두 선언된 경우
// 자신의 주 생성자가 있다면 보조에서 바로 상위 호출 불가능 보조에서 주 생성자 호출시켜야 함
class Sub3(): Super("a") {
    constructor(name: String): this()
    constructor(name: String, age: Int): this(name)
}

// 하위 객체 생성 시점에 상위 생성자는 무조건 호출되도록
// 보조 생성자에서 주생성자가 있다면 주생성자 호출
package ch3.section10_value


// value 클래스 선언
// @JvmInline: Java 로 변경 시에 Id 클래스로 int 데이터가 wrapping 되는 부분을 해제시켜라
@JvmInline
value class Id(val value: Int)

@JvmInline
//value class Id2()   // error 프로퍼티 하나가 무조건 주생성자에 선언되어야 함
//value class Id2 { val value = 10 }  // error 프로퍼티는 주생성자에 선언
//value class Id2 (val value: Int, val value2: Int) // error 주생성자에 하나만 선언
// 주생자에 단 하나의 프로퍼티만 선언되어야 하고 바디에 프로퍼티가 선언되면 안됨
// 일반적으로 클래스 내에 들어가는 init, 생성자, 함수 추가 가능
// 그러나 이렇게 클래스를 선언하면 자바에선 그냥 객체이기 때문에 value 를 선언한 목적과 의도에 위배
// => value 클래스는 가급적 간단하게, 값 하나만 표현하도록 권장
value class Id2(val value: Int) {
    init {
        println("hello")
    }
    constructor(arg1: String): this(10)
    fun someFun() {}
}

fun sayHello(id: Id) {

}

fun main() {
    sayHello(Id(0))
}
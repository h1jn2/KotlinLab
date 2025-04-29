package ch3.section7_enum

enum class Direction {
    NORTH, SOUTH, WEST, EAST
}

// enum 상수에 개발자 임의 데이터 추가
enum class Direction2(val no: Int, val email: String) {
    // enum 상수는 enum 클래스의 하위 타입이기 때문에 상위 생성자 연결 관계 맞추어야 함
    NORTH(10, "a@a.com"), SOUTH(20, "b@b.com")
}

// enum 상수에 함수까지 추가하고 싶은 경우
enum class Direction3 {
    NORTH {
        // 클래스 Body
        // 임의 변수 선언, 임의 함수 선언 가능
        // 단, 타입적으로 표현이 안 되어서 이 클래스 내에서만 이용이 가능함
        val data1: Int = 10
        fun some1() { }

        override val data3: Int = 10
        override fun some3() {
            println("north some3")
        }
    }, SOUTH {
        val no: Int = 20
        fun some2() { }

        override val data3: Int = 10
        override fun some3() {
            println("north some3")
        }
    };  // enum 상수 영역과 enum 클래스 영역의 구분을 표시해주기 위해 세미콜론 찍어줘야 함

    // 정상 프로퍼티, 정상 함수는 enum 상수와 관련 없음
    val data2 = 10
    fun some() { }

    abstract val data3: Int
    abstract fun some3()
}

fun main() {
    // enum 클래스 타입으로 변수가 선언되면 enum 상수 중 하나만 대입 가능
    // enum 상수가 결국 enum 클래스의 하위 객체이기 때문에 가능
    val data: Direction = Direction.NORTH

    println("${data.name}, ${data.ordinal}")    // NORTH, 0

    val data2: Direction2 = Direction2.SOUTH
    println("${data2.no}, ${data2.email}")      // 20, b@b.com

    // enum 상수는 하위 객체이기 때문에
    val data3: Direction3 = Direction3.NORTH
    println("${data3.data3}")   // 10
    data3.some3()   // north some3

}
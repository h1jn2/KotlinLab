package ch3.section6_data

data class User1(val name: String, val no: Int)

// data 클래스의 작성 규칙은 클래스 선언 위치에 있음
// 클래스 바디를 가질 수 있고 변수, 함수, 생성자 가질 수 있음
// data 클래스에 자동 지원되는 사항에서 body 내용은 제외
data class User2(val name: String, val age: Int) {
    var address: String = "seoul"
    fun someFun() {}

    constructor(name: String) : this(name, 0)
}

class User(val no: Int, val name: String)
data class UserData(val no: Int, val name: String) {
    var email: String? = null
    constructor(no: Int, name: String, email: String): this(no, name) {
        this.email = email
    }
}

fun main() {
    val user1 = User(1, "kim")
    val user2 = User(1, "kim")
    val user3 = UserData(1, "kim")
    val user4 = UserData(1, "kim")

    // false, true, false
    // 일반 클래스의 equals 함수는 Any 의 equals 함수를 이용 -> 객체 비교
    // data 클래스의 equals 함수는 값 비교
    println("${user1.equals(user2)}, ${user3.equals(user4)}, ${user1.equals(user3)}")

    val user5 = UserData(1, "kim", "a@a.com")
    val user6 = UserData(1, "kim", "b@b.com")

    // true. true
    // data 클래스는 주생성자의 멤버만 비교
    println("${user5.equals(user6)}. ${user5.equals(user3)}")

    // false, false, true, false
    // data 클래스의 equals 함수가 값 비교로 구현되어 있어 편하지만
    // 경우에 따라 객체 비교가 필요한 경우가 있음
    // ==: 값 비교, ===: 객체 비교 / 일반 클래스는 모두 객체 비교
    println("${user1 == user2}, ${user1 === user2}, ${user3 == user4}, ${user3 === user4}")

    println(user1.toString())   // ch3.section6_data.User@179d3b25
    println(user3.toString())   // UserData(no=1, name=kim)
    println(user5.toString())   // UserData(no=1, name=kim)

}
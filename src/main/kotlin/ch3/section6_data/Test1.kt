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

    // 구조 분해 할당
    val no1 = user3.component1()
    val name1 = user3.component2()
//    val n1 = user3.component3()   // error 주생성자의 매개변수 개수만큼 생성
    println("$no1, $name1")

    // 한꺼번에 여러개의 데이터 추출
    val (no2, name2) = user3
    println("$no2, $name2")

    // 멤버 변수를 모두 뽑고싶지 않을 때
    val (_, c) = user3
    println("$c")

    // data 클래스가 아닌 list 도 가능함
    val list = listOf(1, 2, 3, 4, 5)
    val (d1, d2) = list
    println("$d1, $d2") // 1, 2

    val (e1, e2) = list.drop(1)
    println("$e1, $e2") // 2, 3

    val (_, f1, _, f2) = list
    println("$f1, $f2") // 2, 4

    val g1 = list.component5()
    println("$g1")  // 5

    // 어떤 함수에서 데이터를 여러개 리턴시키고자 할 때 tuple 기법 -> 코틀린 지원 X
    // data 클래스로 비슷하게 흉내
    data class Datas(var data1: Int, var data2: Int, var data3: Int)

    fun getDatas(): Datas {
        return Datas(10, 20, 30)
    }

    val (k1, k2, k3) = getDatas()
    println("$k1, $k2, $k3")


}
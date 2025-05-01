package ch4.section3_hof

fun main() {
    class User() {
        var name: String? = null
        var age: Int? = null
        constructor(name: String, age: Int): this() {
            this.name = name
            this.age = age
        }

        fun sayHello() { }
        fun sayInfo() { }
    }

    // User 객체의 멤버에 반복적으로 접근해야 할 때
    val user = User()
    user.name = "kim"
    user.age = 20
    user.sayHello()
    user.sayInfo()

    // run
    // { } 이 User 클래스 내에 선언된 효과
    // run 에 대입한 람다함수의 리턴값이 run 의 리턴값
    val runResult = user.run {
        name = "kim"
        age = 20
        sayHello()
        sayInfo()
        10
    }

    println(runResult)  // 10

    // apply
    // 리턴값이 apply 에 적용한 객체
    val user1 = user.apply {
        name = "lee"
        age = 30
        sayHello()
        sayInfo()
    }

    // user: lee, user1: lee
    println("user: ${user.name}, user1: ${user1.name}")

    // let
    // user 객체를 람다의 매개변수로 전달
    user.let {
        println("${it.name}, ${it.age}")
    }

    // with
    // 리턴값 없이
    with(user) {
        name = "park"
        age = 40
    }
}
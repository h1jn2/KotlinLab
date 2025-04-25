package ch3.section1_constructor.q

class User(val name: String?, val age: Int){
    constructor(): this(null, 0)
    constructor(name: String): this(name, 0)

    fun printUserInfo() { println("name: $name, age: $age") }
}

fun main() {
    val user1 = User()
    user1.printUserInfo()

    val user2 = User("kim")
    user2.printUserInfo()

    val user3 = User("kim", 30)
    user3.printUserInfo()
}
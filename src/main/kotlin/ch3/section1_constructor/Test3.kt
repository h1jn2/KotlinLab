package ch3.section1_constructor

class User(name: String) {
    init {
        println("init")
    }

    constructor(name: String, age: Int) : this(name) {
        println("constructor")
    }
}

class User2(name: String) {
    constructor(name: String, age: Int) : this(name)
    constructor(name: String, age: Int, email: String) : this(name, age)
}

fun main() {
    User("kim")
    User("kim", 30)
}
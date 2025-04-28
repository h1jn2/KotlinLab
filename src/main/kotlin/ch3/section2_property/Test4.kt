package ch3.section2_property.test4

val data1: String by lazy {
    println("data1 lazy")
    "hello"
}

class User1 {
    val name: String by lazy {
        println("name lazy")
        "kim"
    }

    val age: Int by lazy {
        println("age lazy")
        0
    }

    init {
        println("init")
    }
}

fun main() {
    val user = User1()
    println("name before")
    println(user.name)
    println("name after")
    println("name before")
    println(user.name)
    println("name after")

    println("age before")
    println(user.age)
    println("age after")
}

//init
//name before
//name lazy
//kim
//name after
//name before
//kim
//name after
//age before
//age lazy
//0
//age after
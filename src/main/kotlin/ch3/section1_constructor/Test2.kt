package ch3.section1_constructor

fun main() {
    class User {
        constructor(name: String)
    }

    class User2 {
        constructor()
        constructor(name: String)
        constructor(name: String, age: Int)
    }

    class User3 {
        init {
            println("init")
        }

        constructor() {
            println("constructor")
        }
    }
    User3()

    class User4 {
        // 보조 생성자의 매개변수에는 var, val 을 추가하여 멤버 변수로 만들 수 없음
        constructor(name: String) {
            println(name)
        }

        init {
//            println(name) // error
        }
//        val data = name   // error

//        fun some() {      // error
//            println(name)
//        }
    }
}
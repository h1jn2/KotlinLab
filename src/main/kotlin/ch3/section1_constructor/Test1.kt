package ch3.section1_constructor

fun main() {
    // 주 생성자 선언
    class MyClass
    class MyClass2()
    class MyClass3 constructor()

    val obj1 = MyClass()
    val obj2 = MyClass2()
    val obj3 = MyClass3()

    class User1(name: String, age: Int = 0)

    var user1 = User1("kim", 20)
    user1 = User1("lee")

    class User2(name: String) {
        init {
            println("init")
        }
    }

    var user2 = User2("kim")
    user2 = User2("lee")

    class User3(name: String) {
        val data = name
        init {
            println("init $name")
        }

        fun someFun() {
//            println("someFun $name") // error
        }
    }

    class User4(val name: String) {
        val data = name
        init {
            println("init $name")
        }
        fun someFun() {
            println("someFun $name")
        }
    }
}
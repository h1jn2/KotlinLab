package ch2.section3_function

fun main() {
    fun sayHello(name: String = "lee", no: Int = 0) {
        println("Hello $name, no: $no")
    }
    sayHello("kim", 10)
    sayHello()
    sayHello(no = 10, name = "kim")

    fun myFun(arg1: String, arg2: Int = 10, arg3: String = "Hello", arg4: Int) { }
    myFun("aa", 20, "bb", 30)
    myFun(arg4 = 40, arg3 = "bb", arg1 = "aa", arg2 = 30)
//    myFun("aa", 10)   // error
    myFun(arg1 = "aa", arg4 = 10)
}
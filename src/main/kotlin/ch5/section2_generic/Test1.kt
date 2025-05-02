package ch5.section2_generic

class MyClass<T, A> {
    var data: A? = null
    fun myFun(arg: T): A? {
        return data
    }
}

fun <T> someFun(arg: T): T? {
    return null
}

fun main() {
    val obj: MyClass<String, Int> = MyClass()
    obj.data = 10
//    obj.data = "hello"    // error
    obj.myFun("hello")?.plus(10)
    someFun<Int>(20)
    someFun<String>("hello")
}
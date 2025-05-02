package ch5.section1_extension

open class Super {
    open fun superFun() {
        println("Super superFun")
    }
}

class Sub: Super() {
    var data = 20
    override fun superFun() {
        println("Sub superFun")
    }

    fun some1 (data: Int) {
        this.data = data
        superFun()
        super.superFun()
    }
}

fun Sub.some2(data: Int) {
    this.data = data
    superFun()
//    super.superFun() // error 자바 컴파일 시에 Sub로 들어가지 않음
    // 확장 함수 내에서 super 사용 불가
}

fun Super.sayHello() {
    println("Super say hello")
}

fun Sub.sayHello() {
    println("Sub say hello")
}

fun main() {
    val obj: Super = Sub()
    obj.superFun()
    obj.sayHello()  // Super say hello 다형성 안 됨
}
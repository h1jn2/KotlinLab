package ch5.section2_generic.two

open class Super {
    open fun sayHello() {
        println("Super say hello")
    }
}

class Sub : Super() {
    override fun sayHello() {
        println("Sub say hello")
    }
}

class MyClass<T> {
    fun a(arg: T): T? {
        return null
    }
}

class MyClass2<out T> {
    //    fun a(arg: T): T { return null }    // error
    fun a(arg: Int): T? {
        return null
    }
}

class MyClass3<in T> {
    //    fun a(arg: T): T? { return null }   // error
    fun a(arg: T): Int? {
        return null
    }
}

fun main() {
    val obj: Super = Sub()
    val obj2: Sub = obj as Sub

    // in, out 이 추가되지 않은 제네릭 타입은 불공변(invariance)
    val obj3 = MyClass<Sub>()
//    val obj4: MyClass<Super> = obj3 // error
//    val obj4: MyClass<Sub> = MyClass<Super>() // error

    // covariance 상위타입의 객체에 하위타입이 대입될 수 있음
    val obj5: MyClass2<Super> = MyClass2<Sub>()
//    val obj6: MyClass2<Sub> = MyClass2<Super>()  // error

    // constravariance
//    val obj7: MyClass3<Super> = MyClass3<Sub>()   // error
    val obj8: MyClass3<Sub> = MyClass3<Super>()
}
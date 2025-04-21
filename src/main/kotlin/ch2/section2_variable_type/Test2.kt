package ch2.section2_variable_type.two

import kotlin.random.Random

//val valData = 10

val valData: Int
    get() { // getter
        return Random.nextInt(0, 100)
    }

const val myConst = 10
//const var myConst2 = 10   // error

class MyClass {
//    const val myConst3: Int = 10  // error
}

fun some() {
//    const val myConst4 = 10   // error
}

fun main() {
//    valData = 20

    println(valData)
    println(valData)
}
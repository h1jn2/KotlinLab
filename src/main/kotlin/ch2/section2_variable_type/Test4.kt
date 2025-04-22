package ch2.section2_variable_type.four

val data1: java.lang.Object = Object()
val data2: Any = data1
val data3: Object = data2 as Object

val data4: Unit = Unit

fun myFun(): Nothing {
    throw Exception()
}

fun myFun2(): Nothing {
    while (true) {
    }
}

val data5: Nothing? = null
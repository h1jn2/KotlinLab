package ch5.section3_reflection

import kotlin.reflect.KFunction

fun myFun(no: Int, name: String): Boolean {
    return true
}

fun reflectionFun(argFun: KFunction<*>){
    print("${argFun.name}")
    //매개변수 정보
    val parameters = argFun.parameters
    print("(")
    for(parameter in parameters){
        print("${parameter.name}: ${parameter.type}")
        if(parameter.index < parameters.size - 1)
            print(",")
    }
    print("): ")
    println("${argFun.returnType}")
}

fun main() {
    reflectionFun(::myFun)
}
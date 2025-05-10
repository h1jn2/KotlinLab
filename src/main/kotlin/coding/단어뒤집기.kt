package coding

import java.util.*

fun main() {
    val n = readln().toInt()
    val list = mutableListOf<String>()

    repeat(n) {
        list.add(reverse(readln()))
    }

    list.forEach { println(it) }
}

fun reverse(str: String): String {
    val output = StringBuilder()
    for (word in str.split(" ")) {
        val stack = Stack<Char>()
        for (ch in word) {
            stack.push(ch)
        }
        repeat(stack.size) {
            output.append(stack.pop())
        }
        output.append(" ")
    }
    return output.toString()
}
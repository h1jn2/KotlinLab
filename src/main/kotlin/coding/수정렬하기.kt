package coding

fun main() {
    val cnt = readln().toInt()
    val list = mutableListOf<Int>()

    repeat(cnt) {
        list.add(readln().toInt())
    }
    list.sort()

    list.forEach {
        println(it)
    }
}
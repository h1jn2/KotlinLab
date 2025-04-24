package ch2.section5_collection

class Quiz1 {
    fun myFun(arr: Array<Int>, num: Int): Array<Int> {
        val list = MutableList(0, {0})
        for (i in arr.indices) {
            if (arr[i] > num) list.add(arr[i])
        }
        for (num in list) print("${num} ")

        return list.toTypedArray()
    }
}

fun main() {
    val q = Quiz1()
    q.myFun(arrayOf(1, 5, 10, 15, 20, 25, 30), 15)
}
package ch2.section4_control

import java.text.SimpleDateFormat
import java.util.Calendar

class Quiz2 {
    fun saySeason(dateStr: String): String{
        val cal = Calendar.getInstance()
        val df = SimpleDateFormat("yyyy-MM-dd")
        val date = df.parse(dateStr)
        cal.time = date

        val month = cal.get(Calendar.MONTH) + 1
        return when (month) {
            12, 1, 2 -> "겨울"
            3, 4, 5 -> "봄"
            6, 7, 8 -> "여름"
            9, 10, 11 -> "가을"
            else -> "?"
        }
    }
}

fun main() {
    val q = Quiz2()
    println(q.saySeason("2025-04-30"))
}
package ch2.section4_control

class Quiz1 {
    fun calcBonus(salary: Int, bonusRate: Double): String =
        if (salary <= 0 || bonusRate <= 0) "잘못된 데이터"
        else "지급받을 보너스: ${(salary * bonusRate).toInt()}원"

}

fun main() {
    val q = Quiz1()
    println(q.calcBonus(10000, 0.25))
}
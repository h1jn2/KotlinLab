package ch2.section1_file_package

import ch2.section1_file_package.two.twoData
import ch2.section1_file_package.two.twoFun
import java.util.Date
import java.sql.Date as ADate

fun main() {
    println(oneData)
    oneFun()
    println(twoData)
    twoFun()

    val date = Date()
    val date2 = ADate(System.currentTimeMillis())
}
package ch3.section2_property

fun main() {
    class User1 {
        var data1: String? = null
        val data2: Int? = null
    }

    class User2 {
        var data1: String
        val data2: Int

        init {
            data1 = "kim"
            data2 = 10
        }
    }

    class User3 {
        var data1: String
        val data2: Int

        constructor() {
            data1 = "kim"
            data2 = 10
        }
    }

    class User4 {
        lateinit var data1: String
//        lateinit var data2: Int   // error
//        lateinit var data3: String?   // error
//        lateinit val data4: String    // error
    }

}
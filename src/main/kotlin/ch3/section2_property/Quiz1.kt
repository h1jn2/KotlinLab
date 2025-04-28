package ch3.section2_property

class User {
    var firstName: String? = null
    var lastName: String? = null
    var age: Int = 0
        set(value) {
            if (value >= 0) field = value
            else throw IllegalArgumentException("나이는 음수가 될 수 없습니다")
        }
    var password: String? = null
        set(value) {
            if (value?.length ?: 0 < 8) throw IllegalArgumentException("8자 이상의 패스워드 필요")
            else field = value
        }

    val isAdult: Boolean
        get() = age >= 18
    val fullName: String
        get() = "$firstName $lastName"

//    fun isAdult(): Boolean = age >= 18
//    fun getFullName(): String = "$firstName $lastName"
}

fun main() {
    try {
        val user = User()
        user.age = 10
        user.firstName = "길동"
        user.lastName = "홍"

        println(user.isAdult)
        println(user.fullName)
    } catch (e: Exception) {
        e.printStackTrace()
    }
}
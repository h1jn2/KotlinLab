package ch2.section7_nullsafety

class Address {
    var state: String = ""
    var city: String = ""
}
class User {
    var name: String? = null
    var address: Address? = null
}
class Quiz1 {
    fun printUserInfo (user: User?) {
        user?.run {
            user.address!!.run {
                println("${user.name} : ${user.address?.state} : ${user.address?.city}")
            }
        } ?: run {
            println("유저 정보가 없습니다.")
        }
    }
}

fun main() {
    val obj = Quiz1()
    obj.printUserInfo(null)

    val user = User()
    user.name = "홍길동"

    val address = Address()
    address.city = "성남시"
    address.state = "경기도"
    user.address = address
    obj.printUserInfo(user)
}
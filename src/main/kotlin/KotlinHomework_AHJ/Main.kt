package KotlinHomework_AHJ

fun main() {
    val user = User(
        name = "홍길동",
        phone = "010-1234-5678",
        membershipLevel = MembershipLevel.GOLD
    )
    val product = Product("스마트폰", 850000.0)
    val order = Order(
        user = user,
        product = product,
        paymentMethod = PaymentMethod.CREATE_CARD,
        status = OrderStatus.PAID
    )
    order.printOrderDetails()
}
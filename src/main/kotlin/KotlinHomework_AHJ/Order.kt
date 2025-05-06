package KotlinHomework_AHJ

class Order(val user: User, val product: Product, val paymentMethod: PaymentMethod, val status: OrderStatus) {
    fun calculateSubtotal(): Double {
        val discountRate = product.price * user.membershipLevel.discountRate
        val fee = paymentMethod.calculateFee(product.price - discountRate)
        return product.price - discountRate + fee
    }

    fun printOrderDetails() {
        println("고객정보:")
        println("  이름: ${user.name} (${user.membershipLevel.getDescription()} 회원 (${user.getDiscountRate().toInt()}% 할인)), 연락처: ${user.phone}")
        println("주문상품:")
        println("  상품명: ${product.name}, 단가: ${product.price}")
        println("결제정보:")
        println("  결제방법: ${paymentMethod.getDescription()} 결제 - 수수료 ${paymentMethod.processingFee}")
        println("  결제상태: ${status.getDescription()}")
        println("  결제금액: ${calculateSubtotal()}")
    }
}
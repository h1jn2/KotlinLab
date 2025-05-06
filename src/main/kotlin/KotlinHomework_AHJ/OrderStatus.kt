package KotlinHomework_AHJ

enum class OrderStatus() {
    PENDING, PAID, CANCELLED;

    fun getDescription(): String {
        return when(this) {
            PENDING -> "결제 대기 중"
            PAID -> "결제 완료"
            CANCELLED -> "주문 취소"
        }
    }
}
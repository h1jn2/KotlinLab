package KotlinHomework_AHJ

enum class PaymentMethod (val processingFee: Double){
    CREATE_CARD(0.02), BANK_TRANSFER(0.01), POINT(0.0);

    fun calculateFee(amount: Double): Double = amount * processingFee
    fun getDescription(): String {
        return when(this) {
            CREATE_CARD -> "신용카드"
            BANK_TRANSFER -> "계좌이체"
            POINT -> "포인트"
        }
    }
}
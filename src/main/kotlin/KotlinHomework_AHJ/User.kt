package KotlinHomework_AHJ

enum class MembershipLevel (val discountRate: Double){
    REGULAR(0.0), SILVER(0.05), GOLD(0.1), VIP(0.2);

    fun getDescription(): String {
        return when(this) {
            REGULAR -> "일반"
            SILVER -> "실버"
            GOLD -> "골드"
            VIP -> "VIP"
        }
    }
}


class User(val name: String, val phone: String, val membershipLevel: MembershipLevel) {
    fun getDiscountRate(): Double {
        return when(membershipLevel) {
            MembershipLevel.REGULAR -> MembershipLevel.REGULAR.discountRate * 100
            MembershipLevel.SILVER -> MembershipLevel.SILVER.discountRate* 100
            MembershipLevel.GOLD -> MembershipLevel.GOLD.discountRate * 100
            MembershipLevel.VIP -> MembershipLevel.VIP.discountRate * 100
        }
    }
}



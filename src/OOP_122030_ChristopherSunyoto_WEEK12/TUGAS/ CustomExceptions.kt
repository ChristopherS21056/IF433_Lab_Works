package oop_122030_ChristopherSunyoto_WEEK12.TUGAS

// Custom exception dengan membawa data tambahan
class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")
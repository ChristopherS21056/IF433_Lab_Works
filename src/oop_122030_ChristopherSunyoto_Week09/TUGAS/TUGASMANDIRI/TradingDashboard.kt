package oop_122030_ChristopherSunyoto_Week09.TUGAS.TUGASMANDIRI

fun main() {
    val tradeHistory = listOf(
        TradeLog("BTCUSDT", "LONG", 10, 25.5, "CLOSED"), // Profit, CLOSED
        TradeLog("ETHUSDT", "SHORT", 20, -15.0, "CLOSED"), // Loss, CLOSED
        TradeLog("BTCUSDT", "LONG", 50, 120.5, "OPEN"),    // Profit, OPEN
        TradeLog("SOLUSDT", "SHORT", 5, -8.2, "OPEN"),     // Loss, OPEN
        TradeLog("ETHUSDT", "LONG", 10, 12.0, "CLOSED"),   // Profit, CLOSED
        TradeLog("BTCUSDT", "SHORT", 25, -5.5, "CLOSED")   // Loss, CLOSED
    )

    val closedTrades = tradeHistory.filter { it.status == "CLOSED" }

    val winningTrades = closedTrades.filter { it.roe > 0 }
}
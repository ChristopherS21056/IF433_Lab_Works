package oop_122030_ChristopherSunyoto_week07_TUGAS.Mandiri

fun processEvent(event: BattleState) {
    when (event) {
        is BattleState.MonsterEncounter -> {
            println("Waspada! ${event.monsterName} muncul dari semak-semak!")
        }
        is BattleState.LootDropped -> {
            val item = event.item
            println("Harta Karun! Anda mendapatkan ${item.name} [Rarity: ${item.rarity}]")
        }
        is BattleState.GameOver -> {
            println("Permainan Berakhir: ${event.reason}")
        }
        BattleState.SafeZone -> {
            println("Anda memasuki Zona Aman. Tidak ada musuh di sini.")
        }
    }
}
package oop_122030_ChristopherSunyoto_week07.oop_122030_ChristopherSunyoto_week07_TUGAS.Mandiri

fun main() {
    println("--- Memulai Simulasi RPG ---")

    GameManager.startGame()
    GameManager.startGame()

    println("\n--- Simulasi Factory & Enum ---")
    println("Drop chance item LEGENDARY adalah: ${ItemRarity.LEGENDARY.dropChance}%")
    val playerWeapon = Weapon.forgeStarterSword()
    println("Pemain mendapatkan senjata: ${playerWeapon.item.name}")
    println("Detail -> Damage: ${playerWeapon.item.damage}, Rarity: ${playerWeapon.item.rarity}, Durability: ${playerWeapon.durability}")

    println("\n--- Simulasi Perjalanan Pemain ---")
    val upgradedSword = playerWeapon.item.copy(
        name = "Pedang Kayu Legendaris",
        damage = 25
    )
    processEvent(BattleState.SafeZone)
    processEvent(BattleState.MonsterEncounter("Goblin Nakal"))
    processEvent(BattleState.LootDropped(upgradedSword))
    processEvent(BattleState.GameOver("Terkena jebakan racun"))
}
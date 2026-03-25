package oop_122030_ChristopherSunyoto_week07_TUGAS.Mandiri

fun main() {
    println("--- Memulai Simulasi RPG ---")

    GameManager.startGame()
    GameManager.startGame()

    println("\n--- Simulasi Factory & Enum ---")
    println("Drop chance item LEGENDARY adalah: ${ItemRarity.LEGENDARY.dropChance}%")
    val playerWeapon = Weapon.forgeStarterSword()
    println("Pemain mendapatkan senjata: ${playerWeapon.item.name}")
    println("Detail -> Damage: ${playerWeapon.item.damage}, Rarity: ${playerWeapon.item.rarity}, Durability: ${playerWeapon.durability}")
}
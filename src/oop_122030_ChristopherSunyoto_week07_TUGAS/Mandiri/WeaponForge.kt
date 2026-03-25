package oop_122030_ChristopherSunyoto_week07_TUGAS.Mandiri

class Weapon private constructor(val item: GameItem, val durability: Int) {

    companion object {
        fun forgeStarterSword(): Weapon {
            val starterItem = GameItem("Pedang Kayu Lapuk", 5, ItemRarity.COMMON)
            return Weapon(starterItem, 50)
        }

        fun forgeEpicSword(): Weapon {
            val epicItem = GameItem("Excalibur", 100, ItemRarity.EPIC)
            return Weapon(epicItem, 200)
        }
    }
}
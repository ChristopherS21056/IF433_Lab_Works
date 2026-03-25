package oop_122030_ChristopherSunyoto_week07_TUGAS.Mandiri

sealed class BattleState {
    data class MonsterEncounter(val monsterName: String) : BattleState()
    data class LootDropped(val item: GameItem) : BattleState()
    data class GameOver(val reason: String) : BattleState()
    object SafeZone : BattleState()
}
package oop_122030_ChristopherSunyoto_WEEK12.TUGAS

sealed class FeederException(msg: String): Exception(msg)

class FoodEmptyException(requested: Int, available: Int):
    FeederException("Kibble tidak cukup! Diminta $requested gr, sisa $available gr")

class DispenserJamException():
    FeederException("Wadah dispenser tersangkut/macet!")
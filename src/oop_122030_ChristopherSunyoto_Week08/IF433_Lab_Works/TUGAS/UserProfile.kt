package oop_122030_ChristopherSunyoto_Week08.TUGAS

// name adalah Non-Null (wajib), email dan phone adalah Nullable (opsional)
class UserProfile(
    val name: String,
    val email: String?,
    val phone: String? = null // default argument null

)
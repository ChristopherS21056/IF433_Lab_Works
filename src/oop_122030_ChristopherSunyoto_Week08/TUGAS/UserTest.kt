package oop_122030_ChristopherSunyoto_Week08.TUGAS

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\n=== RUNNING UNIT TEST ===")
    val testUser = DatabaseMock.findUser(1)
    // Di unit testing, jika user null, kita harap testnya gagal (crash). Maka penggunaan !! sangat lazim di file testing.
    val initial = testUser!!.name.substring(0, 1)
    check(initial == "T") { "Test Failed! Initial is wrong." }
    println("Test Passed: Initial is T")
}
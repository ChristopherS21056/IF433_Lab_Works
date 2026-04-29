package oop_122030_ChristopherSunyoto_Week10.TUGAS

class WalletRepository<T : Any> { // Menggunakan constraint <T : Any>
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun findByName(query: String): List<T> {
        return items.filter { it.toString().contains(query, ignoreCase = true) }
    }
}


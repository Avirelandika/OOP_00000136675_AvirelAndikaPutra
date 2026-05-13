class WalletRepository<T> {
    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    // Langkah 4: Filter dengan Constraints (Mencari berdasarkan nama jika T adalah Coin)
    fun findByName(name: String): T? where T : Any {
        return items.find {
            if (it is Coin) it.name == name else false
        }
    }
} //
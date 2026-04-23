package oop_00000136675_avirel.andika.putra.week08

class ApiParser {
    fun parseProduct(rawJson: Map<String, Any?>): Product? {
        // 1. Ekstrak id dan name (Wajib ada)
        val id = requireNotNull(rawJson["id"] as? String) { "API Invalid: Missing ID" }
        val name = requireNotNull(rawJson["name"] as? String) { "API Invalid: Missing Name" }

        // 2. Ekstrak type untuk menentukan class tujuan
        val type = rawJson["type"] as? String

        return when (type) {
            "ELECTRONIC" -> {
                // Ekstrak warranty, jika bukan Int atau null, default ke 12
                val warranty = rawJson["warranty"] as? Int ?: 12
                Electronic(id, name, warranty)
            }
            "CLOTHING" -> {
                // Ekstrak size, jika bukan String atau null, default ke "All Size"
                val size = rawJson["size"] as? String ?: "All Size"
                Clothing(id, name, size)
            }
            else -> null // Jika tipe tidak dikenal atau null
        }
    }

    fun checkout(product: Product) {
        // Smart casting otomatis melalui 'when' pada sealed class
        val id = when (product) {
            is Electronic -> product.id
            is Clothing -> product.id
        }

        // Menggunakan !! karena kita yakin Java service ini akan mereturn string (interop)
        val transactionId = JavaPaymentService.processPayment(id)
        println("Checkout Berhasil: ${transactionId!!}")
    }
}
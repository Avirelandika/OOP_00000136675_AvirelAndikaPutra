package oop_00000136675_avirel.andika.putra.week08

fun main() {
    // Data dummy sesuai instruksi modul
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"), // ID hilang, akan kena requireNotNull
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD") // Tipe tidak dikenal
    )

    val parser = ApiParser()

    println("=== E-COMMERCE API PIPELINE ===")

    for (raw in rawApiData) {
        try {
            // Coba parsing data
            val product = parser.parseProduct(raw)

            // Jika sukses dan bukan null, lanjut ke checkout
            product?.let {
                parser.checkout(it)
            } ?: println("Skipping: Tipe produk '${raw["type"]}' tidak didukung.")

        } catch (e: IllegalArgumentException) {
            // Menangkap error dari requireNotNull
            println("Log Peringatan: Data korup ditemukan! -> ${e.message}")
        }
    }
}//
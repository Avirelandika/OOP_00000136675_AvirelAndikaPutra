package oop_00000136675_AvirelAndikaPutra.week01

fun main() {
    val gameTitle = "Cyber Adventure"
    val price = 750000
    val userNote: String? = null

    val discount = calculateDiscount(price)
    val finalPrice = price - discount

    printReceipt(
        title = gameTitle,
        originalPrice = price,
        discount = discount,
        finalPrice = finalPrice,
        note = userNote
    )
}

fun calculateDiscount(price: Int): Int =
    if (price > 500_000) (price * 20) / 100
    else (price * 10) / 100

fun printReceipt(
    title: String,
    originalPrice: Int,
    discount: Int,
    finalPrice: Int,
    note: String?
) {
    println("=== STRUK PEMBELIAN ===")
    println("Game        : $title")
    println("Harga Asli  : Rp $originalPrice")
    println("Diskon      : Rp $discount")
    println("Harga Akhir : Rp $finalPrice")
    println("Catatan     : ${note ?: "Tidak ada catatan"}")
}

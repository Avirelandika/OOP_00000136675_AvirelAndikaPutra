package oop_00000136675_AvirelAndikaPutra.week05

fun main() {
    // --- KODE DARI GUIDED LAB (CHECKPOINT 4) ---
    val dosen1 = Dosen(nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")
    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== AKTIVITAS PEGAWAI ===")
    for (pegawai in daftarPegawai) {
        pegawai.bekerja()
        // ... (kode when/smart cast lainnya)
    }

    // --- KODE TUGAS MANDIRI 1 (CHECKPOINT 6) ---
    println("\n=== TUGAS MANDIRI 1: OVERLOADING ===")
    val helper = MathHelper()
    println("Luas Persegi: ${helper.hitungLuas(5)}")

    // --- KODE TUGAS MANDIRI 2 (CHECKPOINT 10 & 11) ---
    println("\n=== TUGAS MANDIRI 2: PEMBAYARAN ===")

    val eWallet = EWallet("UserEWallet", 50000.0)
    val cc = CreditCard("UserCC", 100000.0)

    // List bertipe PaymentMethod
    val payments: List<PaymentMethod> = listOf(eWallet, cc)

    for (payment in payments) {
        payment.processPayment(75000.0)

        // Checkpoint 11: Smart Casting Challenge
        if (payment is EWallet) {
            println("Terdeteksi EWallet, melakukan TopUp...")
            payment.topUp(50000.0)
            payment.processPayment(75000.0) // Transaksi seharusnya berhasil sekaran
        }
    }
}
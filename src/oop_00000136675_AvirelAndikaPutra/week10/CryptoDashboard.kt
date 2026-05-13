fun main() {
    // 5. Inisialisasi
    val coinRepo = WalletRepository<Coin>()

    // 6. Mengisi Data Dompet
    coinRepo.add(Coin("BTC", 0.5))
    coinRepo.add(Coin("ETH", 10.2))
    coinRepo.add(Coin("USDT", 1000.0))

    // 7. Simulasi Response Jaringan
    val response = ApiResponse("200 OK", coinRepo.getAll())

    // 8. Menampilkan Data
    println("Status: ${response.status}")
    response.data.forEach {
        println("Coin: ${it.name}, Balance: ${it.balance}")
    }

    // 9. Menambahkan Transaksi
    val txRepo = WalletRepository<Transaction>()
    txRepo.add(Transaction("TX001", 0.1))
    txRepo.add(Transaction("TX002", 50.0))
}
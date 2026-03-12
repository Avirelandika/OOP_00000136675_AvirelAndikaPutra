class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {
    var usedAmount: Double = 0.0
    override fun processPayment(amount: Double) {
        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("CreditCard: Transaksi sukses, total penggunaan $usedAmount")
        } else {
            println("CreditCard: Transaksi ditolak")
        }
    }
}
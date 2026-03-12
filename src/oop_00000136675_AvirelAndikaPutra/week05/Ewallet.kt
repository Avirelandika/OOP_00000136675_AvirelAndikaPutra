class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {
    override fun processPayment(amount: Double) {
        if (balance >= amount) {
            balance -= amount
            println("EWallet: Transaksi sukses, sisa saldo $balance")
        } else {
            println("EWallet: Saldo tidak cukup")
        }
    }
    fun topUp(amount: Double) { balance += amount }
}
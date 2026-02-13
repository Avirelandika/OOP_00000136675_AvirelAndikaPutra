package oop_00000136675_AvirelAndikaPutra

import java.until.Scanner

fun main() { new*
 val  scanner = Scanner(source=System. in)
println("--- APLIKASI PMB UMN ---")

println("Masukan Nama: ")
 val name = scanner.nextLine()

println("Masukan NIM (Wajib 5 Karakter): ")
val nim = scanner.next()

scanner.nextLine()

if (nim.length != 5) {
    println("EROR: Pendaftaran dibatalkan. NIM harus 5 karakter!")
} else {
    print("Pilih jalur (1. Reguler, 2. Umum): ")
    val type = scanner.nextInt()
    scanner.nextLine()

    if (type == 1) {
        print("Masukan Jurusan: ")
        val major = scanner.nextLine()
        val s1 = Student(name, nim, major)
        println("Terdaftar di: ${s1.major} dengan GPA awal ${s1.gpa}")
    } else if (type == 2) {
        val s2 = Student(name, nim)
        println("Terdaftar di: ${s2.major} dengan GPA awal ${s2.gpa}")
    } else {
        println("Pilihan ngawur, pendaftaran batal!")
    }

    println("\n--- TUGAS MANDIRI 1: LIBRARY SYSTEM ---")

    print("Masukkan Judul Buku: ")
    val bookTitle = scanner.nextLine()

    print("Masukkan Nama Peminjam: ")
    val borrower = scanner.nextLine()

    print("Masukkan Lama Pinjam (hari): ")
    var duration = scanner.nextInt()
    scanner.nextLine()

    if (duration < 0) {
        duration = 1
    }

    val loanObj = Loan(bookTitle, borrower, duration)

    println("Detail Peminjaman: ${loanObj.borrower} meminjam '${loanObj.bookTitle}' selama ${loanObj.loanDuration} hari.")
    println("Total Denda: Rp ${loanObj.calculateFine()}")
}
constructor(name: String, nim: String) : this(name, nim, major= "Non-Matriculated") {
    println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
}
    println("\n--- TUGAS MANDIRI 2: MINI RPG ---")
    print("Masukkan Nama Hero: ")
    val heroName = scanner.nextLine()
    print("Masukkan Stat Damage: ")
    val heroDamage = scanner.nextInt()

    val player = Hero(heroName, heroDamage)
    var enemyHp = 100

    println("Pertarungan dimulai! Musuh muncul (HP: $enemyHp)")

    while (player.isAlive() && enemyHp > 0) {
        println("\nMenu: 1. Serang, 2. Kabur")
        val action = scanner.nextInt()

        if (action == 1) {
            player.attack("Musuh")
            enemyHp -= player.baseDamage
            println("HP Musuh tersisa: $enemyHp")

            if (enemyHp > 0) {
                val enemyDamage = (10..20).random()
                player.takeDamage(enemyDamage)
                println("Musuh menyerang balik! HP $heroName tersisa: ${player.hp}")
            }
        } else {
            println("Kamu kabur dari pertarungan!")
            break
        }
    }

// Pengumuman pemenang
    if (enemyHp <= 0) {
        println("\nSelamat! $heroName menang!")
    } else if (!player.isAlive()) {
        println("\nKalah! $heroName telah gugur.")
    }
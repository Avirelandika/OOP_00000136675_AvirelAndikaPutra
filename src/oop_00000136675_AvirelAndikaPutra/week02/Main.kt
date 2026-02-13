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
    println("Masukan Jurusan: ")
    val major = scanner.nextLine()

    val s1 = Student(name, nim, major)
    println("Status: Pendaftaran Selesai.")
}
}
constructor(name: String, nim: String) : this(name, nim, major= "Non-Matriculated") {
    println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
}
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
}
constructor(name: String, nim: String) : this(name, nim, major= "Non-Matriculated") {
    println("LOG: Menggunakan constructor jalur umum (Tanpa Jurusan).")
}
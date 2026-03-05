package oop_00000136675_AvirelAndikaPutra.week04

class Developer(name: String, baseSalary: Int, val programmingLanguage: String) : Employee(name, baseSalary) {
    override fun work() {
        println("$name sedang ngoding menggunakan $programmingLanguage.")
    }
    // calculateBonus tidak di-override (sesuai instruksi)
}
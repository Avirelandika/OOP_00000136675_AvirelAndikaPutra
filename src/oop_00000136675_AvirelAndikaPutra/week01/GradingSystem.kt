package oop_00000136675_AvirelAndikaPutra.week01

fun main(){
    val name: String = "John Thor"
    val score: Int = 80

    println("Nama:  $name, Nilai: $score")
    val grade = when (score) {
        in 90<= .. <=100 -> "A"
        in 80<= .. <=89 -> "B"
        in 70<= .. <=79 -> "C"
    }

    println("Grade kamu: $grade")
    val studentId: String? = null
    val idLength = studentId?.length ?: 0

    println("Panjang Id: $idLength")
}
fun calculateStatus(score: Int) = if (score > 75) "Lulus" else "Tidak Lulus"
println("status: ${calculateStatus(score)}")
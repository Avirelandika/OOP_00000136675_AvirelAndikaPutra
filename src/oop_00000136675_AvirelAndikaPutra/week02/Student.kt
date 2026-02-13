package oop_00000136675_AvirelAndikaPutra

class Student ( 1 Usage new*
    val name: String,
    val nim: String,
    var gpa: Double = 0.0,
    var major: String
)
 init {
     if (nim.length != 5) {

     println("WARNING: Objek tercipta dengan NIM ($nim) yang tidak valid!")
     println("Data mahasiswa $name mungkin akan bermasalah di sistem.")
     } else {
         println("LOG: Objek student $name berhasil dialokasikan di Memory.")
     }
 }
}

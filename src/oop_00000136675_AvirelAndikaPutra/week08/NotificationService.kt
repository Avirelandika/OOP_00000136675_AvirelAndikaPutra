package oop_00000136675_avirel.andika.putra.week08

class NotificationService {
    fun sendEmail(emailAddress: String) {
        println("Mengirim email ke: $emailAddress")
    }

    fun processUser(user: UserProfile) {
        if (user.email != null) {
            // Smart Cast bekerja di sini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}
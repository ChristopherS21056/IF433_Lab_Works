package oop_122030_ChristopherSunyoto_Week08.TUGAS

class NotificationService {
    fun sendEmail(emailAddres: String) {
        println("Mengirim email ke : $emailAddres")
    }

    fun processUser(user: UserProfile) {
        // sendEmail(user.email) // INI AKAN ERROR KARENA TYPE MISSMATCH

        if (user.email != null) {
            // SUCCESS via smart cast: compiler tahu 'user.email' pasti tidak null di blok ini
            sendEmail(user.email)
        } else {
            println("User ${user.name} tidak memiliki email.")
        }
    }
}
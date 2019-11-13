package infrastructure.logger

class LeleoLogs(private val externalLogger: ExternalLogger = ExternalLoggerImpl()) {
    fun log(severity: LogSeverity?, message: String) {
        val finalMessage =
            if (severity != null) {
                "Oops i did it again, $message, $severity"
            }
            else {
                "Oops i did it again, $message"
            }
        externalLogger.log(finalMessage)
    }
}


//Consider this is not here

interface ExternalLogger{
    fun log(message: String)
}

class ExternalLoggerImpl : ExternalLogger{
    override fun log(message: String){
        println("Registered log, message and severity: $message")
    }
}

enum class LogSeverity {
    DEBUENAS,
    EITA,
    CALALIO
}
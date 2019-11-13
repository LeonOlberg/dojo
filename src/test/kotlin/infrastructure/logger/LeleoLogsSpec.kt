package infrastructure.logger

import com.nhaarman.mockitokotlin2.spy
import com.nhaarman.mockitokotlin2.verify
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class LeleoLogsSpec : Spek({
    describe("when login"){
        describe("when severity is present"){
            it("logs the message and the severity"){
                val externalLogger = spy<ExternalLogger>()
                val severity = LogSeverity.DEBUENAS
                val message = "Hit me baby one more time!"
                val finalLogMessage = "Oops i did it again, $message, $severity"

                LeleoLogs(externalLogger = externalLogger).log(severity, message)

                verify(externalLogger).log(finalLogMessage)
            }
        }

        describe("when severity it is not present"){
            it("logs the message without the severity"){
                val externalLogger = spy<ExternalLogger>()
                val severity = null
                val message = "Hit me baby one more time!"
                val finalLogMessage = "Oops i did it again, $message"

                LeleoLogs(externalLogger = externalLogger).log(severity, message)

                verify(externalLogger).log(finalLogMessage)
            }
        }
    }
})
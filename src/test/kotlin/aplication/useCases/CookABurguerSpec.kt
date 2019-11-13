import aplication.useCases.CookABurguer

import com.nhaarman.mockitokotlin2.spy
import com.nhaarman.mockitokotlin2.verify
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class CookABurguerSpec : Spek({
    describe("when cooking a burger") {
        describe("when requesting to chef to cook"){
            it("sends all ingredients to chef"){

            }
        }

        describe("when requesting to waiter to prepare the plate"){
            it("sends all ready ingredients to waiter"){

            }
        }

        describe("when login the ready burger with soda"){
            it("sends a message and severity to log"){

            }
        }
    }
})
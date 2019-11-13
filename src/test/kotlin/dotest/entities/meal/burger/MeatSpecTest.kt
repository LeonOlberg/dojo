import domain.entities.meal.burger.Meat

import com.winterbe.expekt.expect
import domain.entities.meal.burger.GrillCook
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe
import kotlin.random.Random

class MeatSpecTest : Spek({
    describe("when asking if meat is ready") {
        describe("and the meat is not ready") {
            it("should return false") {
                val meat = Meat(ready = false)

                val subject = meat.isReady()

                expect(subject).to.be.`false`
            }
        }
        describe("and the meat is ready") {
            it("should return true") {
                val meat = Meat(ready = true)

                val subject = meat.isReady()

                expect(subject).to.be.`true`
            }
        }
    }

    describe("when asking for doneness") {
        describe("and cook time is lower than 61") {
            it("should return extra rare") {
                val meat = Meat()
                val randomNumber = Random.nextLong(60)

                val subject = meat.grillCookTimer(randomNumber)

                expect(subject).to.be.equal(GrillCook.EXTRA_RARE)
            }
        }

        describe("and cook time is between 61 and 120") {
            it("should return rare") {
                val meat = Meat()
                val randomNumber = Random.nextLong(61, 119)

                val subject = meat.grillCookTimer(randomNumber)

                expect(subject).to.be.equal(GrillCook.RARE)
            }
        }
    }
})
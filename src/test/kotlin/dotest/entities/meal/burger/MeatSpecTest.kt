import domain.entities.meal.burger.Meat

import com.winterbe.expekt.expect
import domain.entities.meal.burger.GrillCook
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

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
})
import domain.entities.meal.burger.Meat

import com.winterbe.expekt.expect
import domain.entities.meal.burger.GrillCook
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class MeatSpecTest : Spek({
    describe("when asking if meat is ready") {
        describe("and the meat is raw") {
            it("should return false") {
                val meat = Meat(ready = false)

                val subject = meat.isReady()

                expect(subject).to.be.`false`
            }
        }
    }
})
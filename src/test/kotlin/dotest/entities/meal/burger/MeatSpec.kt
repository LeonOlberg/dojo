import domain.entities.meal.burger.Meat

import com.winterbe.expekt.expect
import domain.entities.meal.burger.GrillCook
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class MeatSpec : Spek({
    describe("when cooking") {
        describe("when meat is ready"){
            it("meat is cooked") {
                val meat = Meat(ready = true)

                val subject = meat.isReady()

                expect(subject).equal(true)
            }
        }

        describe("when meat is not ready"){
            it("meat is not cooked") {
                val meat = Meat()

                val subject = meat.isReady()

                expect(subject).equal(false)
            }
        }

        describe("when checking grilling"){
            it("is extra rare if time less than 61 seconds"){
                val meat = Meat()

                val subject = meat.grillCookTimer(time = 60)

                expect(subject).to.be.equal(GrillCook.EXTRA_RARE)
            }

            it("is rare if time higher than 60 seconds or less than 121 seconds"){
                val meat = Meat()

                val lessTimeSubject = meat.grillCookTimer(time = 61)
                val higherTimeSubject = meat.grillCookTimer(time = 120)

                expect(lessTimeSubject).to.be.equal(GrillCook.RARE)
                expect(higherTimeSubject).to.be.equal(GrillCook.RARE)
            }

            it("is medium if time higher than 120 seconds or less than 241 seconds"){
                val meat = Meat()

                val lessTimeSubject = meat.grillCookTimer(time = 121)
                val higherTimeSubject = meat.grillCookTimer(time = 240)

                expect(lessTimeSubject).to.be.equal(GrillCook.MEDIUM)
                expect(higherTimeSubject).to.be.equal(GrillCook.MEDIUM)
            }

            it("is medium if time higher than 240 seconds or less than 361 seconds"){
                val meat = Meat()

                val lessTimeSubject = meat.grillCookTimer(time = 241)
                val higherTimeSubject = meat.grillCookTimer(time = 360)

                expect(lessTimeSubject).to.be.equal(GrillCook.MEDIUM_WELL)
                expect(higherTimeSubject).to.be.equal(GrillCook.MEDIUM_WELL)
            }

            it("is extra rare if time less than 61 seconds"){
                val meat = Meat()

                val subject = meat.grillCookTimer(time = 361)

                expect(subject).to.be.equal(GrillCook.WELL_DONE)
            }
        }
    }
})
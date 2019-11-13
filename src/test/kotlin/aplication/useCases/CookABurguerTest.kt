package aplication.useCases

import com.nhaarman.mockitokotlin2.mock
import com.nhaarman.mockitokotlin2.spy
import com.nhaarman.mockitokotlin2.verify
import domain.entities.Chef
import domain.entities.Waiter
import domain.entities.meal.burger.Ingredients
import infrastructure.logger.LeleoLogs
import org.spekframework.spek2.Spek
import org.spekframework.spek2.style.specification.describe

class CookABurguerTest : Spek({
    describe("when cooking a burguer") {
        it ("the chef should be cooking") {
            val ingredientsMock = mock<List<Ingredients>>()
            val waiterMock = mock<Waiter>()
            val leleoLogsMock = mock<LeleoLogs>()
            val chef = spy<Chef>()

            val cookABurguer =
                CookABurguer(
                    ingredientsMock,
                    chef,
                    waiterMock,
                    leleoLogsMock
                )

            verify(chef).cook(ingredientsMock)
        }
    }
})
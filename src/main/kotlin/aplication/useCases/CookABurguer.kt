package aplication.useCases

import domain.entities.Chef
import domain.entities.Waiter
import domain.entities.meal.burger.Ingredients
import infrastructure.logger.LeleoLogs

class CookABurguer(
    private val ingredients : List<Ingredients>,
    private val chef: Chef,
    private val waiter: Waiter,
    private val leleoLogs: LeleoLogs) {

    fun perform(): List<Any>{

        return  emptyList()
    }
}
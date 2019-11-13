package aplication.useCases

import domain.entities.Chef
import domain.entities.Waiter
import infrastructure.logger.LeleoLogs

class CookABurguer(
    private val ingredients : List<Any>,
    private val chef: Chef,
    private val waiter: Waiter,
    private val leleoLogs: LeleoLogs) {

    fun perform(): List<Any>{

        return  emptyList()
    }
}
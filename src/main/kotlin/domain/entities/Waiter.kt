package domain.entities

import domain.entities.meal.burger.Ingredients

class Waiter {
    fun prepareBurger(burger: List<Ingredients>): List<Any> {
        return addPlate(burger)
    }
    private fun addPlate(burger: List<Ingredients>): List<Any> = listOf(burger, "plate")
}
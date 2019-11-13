package domain.entities.meal.burger

abstract class Ingredients(private var ready : Boolean = false) {
    abstract fun isReady():Boolean
}
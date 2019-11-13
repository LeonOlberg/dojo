package domain.entities.meal.burger

class Bacon(private var ready : Boolean = false): Ingredients(ready) {
    override fun isReady(): Boolean {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    fun isDelicious(): Boolean = true
}
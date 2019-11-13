package domain.entities.meal.burger

class Meat(private var ready : Boolean = false) : Ingredients(ready) {
    fun grillCookTimer(time: Long): GrillCook =
        when {
            time < 61 -> GrillCook.EXTRA_RARE
            time in 61..120 -> GrillCook.RARE
            time in 121..240 -> GrillCook.MEDIUM
            time in 241..360 -> GrillCook.MEDIUM_WELL
            time > 360 -> GrillCook.WELL_DONE
            else -> GrillCook.EXTRA_RARE
        }

    override fun isReady():Boolean{
        return ready
    }
}

enum class GrillCook{
    EXTRA_RARE,
    RARE,
    MEDIUM,
    MEDIUM_WELL,
    WELL_DONE
}
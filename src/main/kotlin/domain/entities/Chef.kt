package domain.entities

import domain.entities.meal.burger.Ingredients

class Chef {
    fun cook(ingredients: List<Ingredients>): List<Ingredients> {
        ingredients.map { ingredient ->
            ingredient
        }

        return emptyList()
    }
}
package recipe1

object StudentDatabase extends Database {

  object FrozenFood extends Food("FrozenFood")

  object HeatItUp extends Recipe(
    "heat it up",
    List(FrozenFood),
    "Microwave the 'food' for 10 minutes"
  )

  override def allFoods: List[Food] = List(FrozenFood)

  override def allRecipes: List[Recipe] = List(HeatItUp)

  override def allCategories: List[StudentDatabase.FoodCategory] = List(FoodCategory("edible", List(FrozenFood)))
}

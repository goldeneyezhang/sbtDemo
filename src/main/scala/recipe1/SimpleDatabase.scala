package recipe1

object SimpleDatabase extends Database with SimpleFoods with SimpleRecipes {
  //def allFoods = List(Apple, Orange, Cream, Sugar)

  //def foodNamed(name: String): Option[Food] =
  //allFoods.find(_.name == name)

  //def allRecipes: List[Recipe] = List(FruitSalad)

  //case class FoodCategory(name: String, foods: List[Food])

  private var categories = List(FoodCategory("fruits", List(Apple, Orange))
    , FoodCategory("misc", List(Cream, Sugar))
  )

  //def allCategories = categories
}

object SimpleBrowser {
  def recipesUsing(food: Food) =
    SimpleDatabase.allRecipes.filter(recipe => recipe.ingredients.contains(food))

  def displayCategory(category: SimpleDatabase.FoodCategory) = {
    println(category)
  }
}

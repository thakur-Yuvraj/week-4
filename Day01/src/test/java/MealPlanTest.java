import org.example.mealplangenerator.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MealPlanTest {

    @Test
    void testMealCreation() {
        VegetarianMeal veg = new VegetarianMeal("Grilled Veggies with Rice");
        VeganMeal vegan = new VeganMeal("Tofu Stir-Fry");
        KetoMeal keto = new KetoMeal("Keto Chicken Salad");
        HighProteinMeal protein = new HighProteinMeal("Grilled Salmon");

        assertEquals("Grilled Veggies with Rice", veg.getMealName());
        assertEquals("Tofu Stir-Fry", vegan.getMealName());
        assertEquals("Keto Chicken Salad", keto.getMealName());
        assertEquals("Grilled Salmon", protein.getMealName());
    }

    @Test
    void testAddingMealsToMealPlan() {
        Meal<VeganMeal> veganMealPlan = new Meal<>();
        VeganMeal tofu = new VeganMeal("Tofu Stir-Fry");
        veganMealPlan.addMeal(tofu);

        assertEquals(1, veganMealPlan.getMeals().size());
        assertEquals("Tofu Stir-Fry", veganMealPlan.getMeals().get(0).getMealName());
    }

    @Test
    void testValidateAndGenerateMeal() {
        VeganMeal tofu = new VeganMeal("Tofu Stir-Fry");

        assertDoesNotThrow(() -> MealGenerator.validateAndGenerateMeal(tofu));

        IllegalArgumentException exception = assertThrows(
                IllegalArgumentException.class,
                () -> MealGenerator.validateAndGenerateMeal(null)
        );
        assertEquals("Invalid meal plan!", exception.getMessage());
    }
}

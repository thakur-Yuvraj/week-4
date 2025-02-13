package org.example.mealplangenerator;

public class MealGenerator {
    public static <T extends MealPlan> void validateAndGenerateMeal(T meal) {
        if (meal == null || meal.getMealName().isEmpty()) {
            throw new IllegalArgumentException("Invalid meal plan!");
        }
        System.out.println("Generated meal plan: " + meal.getMealName());
    }
}

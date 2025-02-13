package org.example.mealplangenerator;

public class Main {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegMeal = new Meal<>();
        vegMeal.addMeal(new VegetarianMeal("Grilled Veggies with Rice"));
        vegMeal.showMeals();

        MealGenerator.validateAndGenerateMeal(new VeganMeal("Tofu Stir-Fry"));
    }
}

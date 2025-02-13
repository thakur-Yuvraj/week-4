package org.example.mealplangenerator;

public class VeganMeal implements MealPlan {
    private String mealName;

    public VeganMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }
}

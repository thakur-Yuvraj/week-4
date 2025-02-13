package org.example.mealplangenerator;

public class HighProteinMeal implements MealPlan {
    private String mealName;

    public HighProteinMeal(String mealName) {
        this.mealName = mealName;
    }

    @Override
    public String getMealName() {
        return mealName;
    }
}


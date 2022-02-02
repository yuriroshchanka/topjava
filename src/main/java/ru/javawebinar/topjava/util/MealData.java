package ru.javawebinar.topjava.util;

import ru.javawebinar.topjava.model.MealTo;

import java.util.List;

public class MealData {
    private static MealData instance;
    private List<MealTo> mealsToList;

    private MealData() {
        mealsToList = MealsUtil.getMealsToList();
    }

    public static MealData getInstance() {
        if (instance == null) {
            instance = new MealData();
        }
        return instance;
    }

    public List<MealTo> getMealsToList() {
        return mealsToList;
    }
}
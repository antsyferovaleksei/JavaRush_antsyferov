package com.javarush.task.task27.task2712.kitchen;

public enum Dish {
    FISH(25),
    STEAK(30),
    SOUP(15),
    JUICE(5),
    WATER(3);

    private int duration;

    public int getDuration() {
        return duration;
    }

    Dish(int duration) {
        this.duration = duration;
    }

    public static String allDishesToString() {
        String result = "";
        for (int i = 0; i < Dish.values().length; i++) {
            if(i == Dish.values().length - 1){
                result += result + " " + Dish.values()[i];
            }else {
                result += result + " " + Dish.values()[i] + ",";
            }
        }
        return result.trim();
    }
}

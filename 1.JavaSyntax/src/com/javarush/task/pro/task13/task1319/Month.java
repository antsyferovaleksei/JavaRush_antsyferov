package com.javarush.task.pro.task13.task1319;

/* 
Месяцы в сезоне
*/

import java.util.Arrays;

public enum Month {
    JANUARY,
    FEBRUARY,
    MARCH,
    APRIL,
    MAY,
    JUNE,
    JULY,
    AUGUST,
    SEPTEMBER,
    OCTOBER,
    NOVEMBER,
    DECEMBER;

    public static Month[] getWinterMonths(){
        Month [] winter = new Month[3];
        winter[0] = Month.values()[11];
        winter[1] = Month.values()[0];
        winter[2] = Month.values()[1];
        return winter;
    }

    public static Month[] getSpringMonths(){
        Month [] array = Month.values();
        Month [] spring = new Month[3];
        spring = Arrays.copyOfRange(array, 2, 5);
        return spring;
    }

    public static Month[] getSummerMonths(){
        Month [] array = Month.values();
        Month [] summer = new Month[3];
        summer = Arrays.copyOfRange(array, 5, 8);
        return summer;
    }

    public static Month[] getAutumnMonths(){
        Month [] array = Month.values();
        Month [] autumn = new Month[3];
        autumn = Arrays.copyOfRange(array, 8, 11);
        return autumn;
    }
}

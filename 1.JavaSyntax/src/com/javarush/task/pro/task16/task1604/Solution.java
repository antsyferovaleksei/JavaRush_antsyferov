package com.javarush.task.pro.task16.task1604;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/* 
День недели рождения твоего
*/

public class Solution {

    static Calendar birthDate = new GregorianCalendar(1986, Calendar.SEPTEMBER, 30);
    //static Calendar birthDate = new GregorianCalendar(2022, Calendar.OCTOBER, 15);

    public static void main(String[] args) {
        System.out.println(getDayOfWeek(birthDate));
    }

    static String getDayOfWeek(Calendar calendar) {
        String result = "";
        int day = calendar.get(Calendar.DAY_OF_WEEK);
        switch (day) {
            case 1:
                return "воскресенье";
            case 2:
                return "понедельник";
            case 3:
                return "вторник";
            case 4:
                return "среда";
            case 5:
                return "четверг";
            case 6:
                return "пятница";
            case 7:
                return "суббота";
        }
        return result;
    }
}

package com.javarush.task.pro.task13.task1309;

import java.util.HashMap;

/* 
Успеваемость студентов
*/

public class Solution {
    public static HashMap<String, Double> grades = new HashMap<>();

    public static void main(String[] args) {
        addStudents();
        System.out.println(grades);
    }

    public static void addStudents() {
        //напишите тут ваш код
        grades.put("имя фамилия1", 5.0D);
        grades.put("имя фамилия2", 4.0D);
        grades.put("имя фамилия3", 4.5D);
        grades.put("имя фамилия4", 4.5D);
        grades.put("имя фамилия5", 3.0D);
    }
}

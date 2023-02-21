package com.javarush.task.task22.task2202;

/* 
Найти подстроку
*/

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        System.out.println(getPartOfString("JavaRush - лучший сервис обучения Java."));
        System.out.println(getPartOfString("Aмиго и Диего лучшие друзья!"));
        System.out.println(getPartOfString("Aмиго и Диего"));
    }

    public static String getPartOfString(String string) {
        StringBuilder strB = new StringBuilder();
        try {
            List<String> listStr;
            listStr = Arrays.asList(string.split(" "));
            for (int i = 1; i < 5; i++) {
                strB.append(listStr.get(i));
                strB.append(" ");
            }

        } catch (Exception ex) {
            throw new TooShortStringException(ex);
        }
        return String.valueOf(strB).trim();
    }

    public static class TooShortStringException extends RuntimeException {
        public TooShortStringException(Throwable cause) {
            super(cause);
        }
    }
}

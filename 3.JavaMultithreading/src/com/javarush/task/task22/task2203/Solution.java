//package com.javarush.task.task22.task2203;
//
///*
//Между табуляциями
//*/
//
//public class Solution {
//    public static String getPartOfString(String string) throws TooShortStringException {
//        String res = "";
//        try {
//            res = string.substring(string.indexOf('\t') + 1,
//                    string.substring(string.indexOf('\t') + 1).indexOf('\t')).trim();
//        }catch (Exception e){
//            throw new TooShortStringException();
//        }
//        return res;
//    }
//
//    public static class TooShortStringException extends Exception {
//    }
//
//    public static void main(String[] args) throws TooShortStringException {
//        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
//    }
//}
package com.javarush.task.task22.task2203;

/*
Между табуляциями
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        System.out.println(getPartOfString("\tJavaRush - лучший сервис \tобучения Java\t."));
    }

    public static String getPartOfString(String string) throws TooShortStringException {
        if (string == null) {
            throw new TooShortStringException();
        }
        String[] splitWithTabs = string.split("\\t");

        if (splitWithTabs.length < 3) throw new TooShortStringException();

        return splitWithTabs[1];
    }

    public static class TooShortStringException extends Exception {
    }
}

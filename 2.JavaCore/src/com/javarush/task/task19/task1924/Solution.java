//package com.javarush.task.task19.task1924;
//
//import java.io.*;
//import java.util.*;
//import java.util.regex.Pattern;
//
///*
//Замена чисел
//*/
//
//public class Solution {
//    public static Map<Integer, String> map = new HashMap<Integer, String>();
//
//    static {
//        map.put(0, "ноль");
//        map.put(1, "один");
//        map.put(2, "два");
//        map.put(3, "три");
//        map.put(4, "четыре");
//        map.put(5, "пять");
//        map.put(6, "шесть");
//        map.put(7, "семь");
//        map.put(8, "восемь");
//        map.put(9, "девять");
//        map.put(10, "десять");
//        map.put(11, "одинадцать");
//        map.put(12, "двенадцать");
//    }
//
//    public static void main(String[] args) throws IOException {
//        String fileName1 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
//        String fileName2 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test2.txt";
////        String fileName1 = args[0];
////        String fileName2 = args[1];
//
//        List<String> allWords = new ArrayList<>();
//        List<String> resultWords = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName1))) {
//            while (br.ready()) {
//                String line = br.readLine();
//                allWords.addAll(Arrays.asList(line.split(" ")));
//                allWords.add("/n");
//            }
//        }
//
//        boolean isAdded = false;
//        for (String word : allWords) {
//            if (isDigit(word)) {
//                for (Map.Entry<Integer, String> entry : map.entrySet()) {
//                    if (entry.getKey() == Integer.valueOf(word)) {
//                        resultWords.add(entry.getValue());
//                        isAdded = true;
//                        break;
//                    }
//                }
//                if (!isAdded) {
//                    resultWords.add(word);
//                }
//            } else {
//                resultWords.add(word);
//            }
//            isAdded = false;
//        }
//
//        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName2))) {
//            for (String word : resultWords) {
//                if (word.equals("/n")) {
//                    br.newLine();
//                } else {
//                    br.write(word);
//                    br.write(" ");
//                }
//            }
//        }
//    }
//
//
//    private static boolean isDigit(String word) {
//        char[] chars = word.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            if (!Character.isDigit(chars[i])) {
//                return false;
//            }
//        }
//        return true;
//    }
//}
package com.javarush.task.task19.task1924;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

/*
Замена чисел
*/

public class Solution {
    public static Map<Integer, String> map = new HashMap<>();

    static {
        map.put(12, "двенадцать");
        map.put(11, "одиннадцать");
        map.put(10, "десять");
        map.put(9, "девять");
        map.put(8, "восемь");
        map.put(7, "семь");
        map.put(6, "шесть");
        map.put(5, "пять");
        map.put(4, "четыре");
        map.put(3, "три");
        map.put(2, "два");
        map.put(1, "один");
        map.put(0, "ноль");
    }

    public static void main(String[] args) {
        String fileName = null;

        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName = reader.readLine();
        } catch (IOException ignore) {
            /* NOP */
        }

        String fileLine;

        try (BufferedReader in = new BufferedReader(new FileReader(fileName))) {
            while ((fileLine = in.readLine()) != null) {
                for (Map.Entry<Integer, String> entry : map.entrySet()) {
                    fileLine = fileLine.replaceAll("\\b" + entry.getKey() + "\\b", entry.getValue());
                }
                System.out.println(fileLine);
            }
        } catch (IOException ignore) {
            /* NOP */
        }
    }
}

package com.javarush.task.task18.task1805;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Сортировка байт
*/
//"/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = reader.readLine();
//        FileInputStream fileInputStream = new FileInputStream(fileName);
//
//        int el;
//        Map<Integer, Integer> elements = new TreeMap<>();
//        int count = 0;
//        while ((el = fileInputStream.read()) != -1) {
//            elements.put(el, count++);
//        }
//
//        for(int i : elements.keySet()){
//            System.out.print(i + " ");
//        }
//
//        reader.close();
//        fileInputStream.close();
//    }
//}

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = bufferedReader.readLine();

        Set<Integer> bytes = new TreeSet<>();
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                bytes.add(fileInputStream.read());
            }
        }
        for (Integer aByte : bytes) {
            System.out.print(aByte + " ");
        }
    }
}

package com.javarush.task.task18.task1803;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.*;

/* 
Самые частые байты
*/

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
//        List<Integer> keys = new ArrayList<>(elements.keySet());
//        System.out.println(keys.get(keys.size()-1));
//        reader.close();
//        fileInputStream.close();
//    }
//}

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        int[] byteCountArray = new int[256];
        try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
            while (fileInputStream.available() > 0) {
                byteCountArray[fileInputStream.read()] += 1;
            }
        }
        int maxCount = 0;
        for (int byteCount : byteCountArray) {
            if (byteCount > maxCount) maxCount = byteCount;
        }
        ArrayList<Integer> resultList = new ArrayList<>();
        for (int i = 0; i < byteCountArray.length; i++) {
            if (byteCountArray[i] == maxCount) resultList.add(i);
        }
        for (Integer resultItem : resultList) System.out.print(resultItem + " ");
    }
}
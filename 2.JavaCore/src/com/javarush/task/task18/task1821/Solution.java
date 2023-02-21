//package com.javarush.task.task18.task1821;
//
//import java.io.*;
//import java.util.Map;
//import java.util.TreeMap;
//
///*
//Встречаемость символов
//*/
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        try (BufferedReader bufferedFileReader = new BufferedReader(new FileReader(args[0]))) {
//            Map<String, Integer> allElements = new TreeMap<>();
//            while (bufferedFileReader.ready()) {
//                String key = Character.toString(bufferedFileReader.read());
//                if(!allElements.containsKey(key)){
//                    allElements.put(key, 1);
//                }else {
//                    int value = allElements.get(key);
//                    allElements.put(key, value+1);
//                }
//            }
//            for(var el : allElements.entrySet()){
//                System.out.println(el.getKey() + " " + el.getValue());
//            }
//        }
//    }
//}
package com.javarush.task.task18.task1821;

import java.io.FileReader;
import java.io.IOException;

/*
Встречаемость символов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int[] aSCII = new int[128];
        try (FileReader reader = new FileReader(args[0])) {
            while (reader.ready()) {
                aSCII[reader.read()]++;
            }
        }
        for (int i = 0; i < aSCII.length; i++) {
            if (aSCII[i] != 0) {
                System.out.println((char) i + " " + aSCII[i]);
            }
        }
    }
}


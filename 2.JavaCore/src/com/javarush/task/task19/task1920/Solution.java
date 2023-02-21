package com.javarush.task.task19.task1920;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

/* 
Самый богатый
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //String fileName = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";

        TreeMap<String, Double> allElements = new TreeMap<>();
        Double biggestValue = 0.0;
        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while (br.ready()) {
                String line = br.readLine();
                String key = line.substring(0, line.indexOf(" ")).trim();
                Double value = Double.valueOf(line.substring(line.indexOf(" ")).trim());
                if (allElements.containsKey(key)) {
                    value += allElements.get(key);
                    allElements.put(key, value);
                } else {
                    allElements.put(key, value);
                }
                if(biggestValue.compareTo(value) == -1){
                    biggestValue = value;
                }
            }
        }

        for (Map.Entry<String, Double> entry : allElements.entrySet()) {
            if (entry.getValue().compareTo(biggestValue) == 0) {
                System.out.println(entry.getKey());
            }
        }
    }
}

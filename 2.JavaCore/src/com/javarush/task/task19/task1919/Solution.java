package com.javarush.task.task19.task1919;

import java.io.*;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;

/* 
Считаем зарплаты
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        //String fileName = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";

        Map<String, Double> allElements = new TreeMap<>();
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
            }
        }

        for (Map.Entry<String, Double> entry : allElements.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}

package com.javarush.task.task19.task1926;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Перевертыши
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        String fileName1 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
        String fileName1;
        try (BufferedReader consoleReader = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = consoleReader.readLine();
        }

        StringBuilder stringBuilder = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName1))) {
            while (br.ready()) {
                String line = new StringBuilder(br.readLine()).reverse().toString();
                stringBuilder.append(line);
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder.toString());
    }
}

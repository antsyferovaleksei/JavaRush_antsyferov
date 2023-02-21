package com.javarush.task.task19.task1910;

import java.io.*;
import java.util.ArrayList;

/*
Замена знаков
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        String fileName1, fileName2;
//        String fileName1 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
//        String fileName2 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test2.txt";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = br.readLine();
            fileName2 = br.readLine();
        }
        StringBuilder text = new StringBuilder();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName1))) {
            char currentChar;
            while (br.ready()) {
                currentChar = (char) br.read();
                text.append(currentChar);
            }
        }
        String result = text.toString().replaceAll("\\p{Punct}", "").replaceAll("\n", "");

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName2))) {
            bw.write(result);
        }
    }
}

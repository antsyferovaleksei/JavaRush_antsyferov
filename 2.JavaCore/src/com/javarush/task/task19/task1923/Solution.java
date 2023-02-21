package com.javarush.task.task19.task1923;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* 
Слова с цифрами
*/

public class Solution {
    public static void main(String[] args) throws IOException {
//        String fileName1 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
//        String fileName2 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test2.txt";
        String fileName1 = args[0];
        String fileName2 = args[1];

        List<String> initialString = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName1))) {
            while (br.ready()) {
                String line = br.readLine();
                initialString.addAll(Arrays.asList(line.split(" ")));
            }
        }

        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName2))) {
            for (String word : initialString) {
                if (checkDigits(word)) {
                    br.write(word);
                    br.write(" ");
                }
            }
        }
    }

    private static boolean checkDigits(String word) {
        char[] chars = word.toCharArray();
        for (char c : chars) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}

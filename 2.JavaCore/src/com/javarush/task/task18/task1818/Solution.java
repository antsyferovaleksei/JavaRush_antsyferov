package com.javarush.task.task18.task1818;

import java.io.*;

/* 
Два в одном
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();
        bufferedReader.close();
//        String fileName1 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
//        String fileName2 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test2.txt";
//        String fileName3 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";
        FileOutputStream outputStream1 = new FileOutputStream(fileName1, true);
        try (FileInputStream fileInputStream1 = new FileInputStream(fileName2);
             FileInputStream fileInputStream2 = new FileInputStream(fileName3)) {
            byte[] buffer1 = new byte[fileInputStream1.available()];
            byte[] buffer2 = new byte[fileInputStream2.available()];
            fileInputStream1.read(buffer1);
            outputStream1.write(buffer1);
            fileInputStream2.read(buffer2);
            outputStream1.write(buffer2);
            fileInputStream1.close();
            fileInputStream2.close();
        }
        outputStream1.close();
    }
}

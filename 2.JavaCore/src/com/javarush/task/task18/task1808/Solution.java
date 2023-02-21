package com.javarush.task.task18.task1808;

import java.io.*;

/* 
Разделение файла
*/
//"/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        String fileName3 = bufferedReader.readLine();
        bufferedReader.close();
//        String fileName1 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";
//        String fileName2 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
//        String fileName3 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test2.txt";
        FileOutputStream outputStream1 = new FileOutputStream(fileName2);
        FileOutputStream outputStream2 = new FileOutputStream(fileName3);
        try (FileInputStream fileInputStream1 = new FileInputStream(fileName1)) {
            if (fileInputStream1.available() > 0) {
                byte[] buffer = new byte[fileInputStream1.available()];
                int firstPartCount = buffer.length % 2 == 0 ? buffer.length / 2 : buffer.length / 2 + 1;
                fileInputStream1.read(buffer);
                outputStream1.write(buffer, 0, firstPartCount);
                outputStream2.write(buffer, firstPartCount, buffer.length / 2);
                fileInputStream1.close();
            }
        }
        outputStream1.close();
        outputStream2.close();
    }
}

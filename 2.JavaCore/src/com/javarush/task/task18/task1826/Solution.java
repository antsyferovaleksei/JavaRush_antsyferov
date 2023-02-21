package com.javarush.task.task18.task1826;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/* 
Шифровка
*/
/*-e "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt"
 "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt"
*/
public class Solution {
    public static void main(String[] args) throws IOException {
        FileInputStream inputStream = new FileInputStream(args[1]);
        FileOutputStream outputStream = new FileOutputStream(args[2]);
        switch (args[0]) {
            case "-e": {
                while (inputStream.available() > 0) {
                    int count = inputStream.read() + 1;
                    outputStream.write(count);
                }
                break;
            }
            case "-d": {
                while (inputStream.available() > 0) {
                    int count = inputStream.read() - 1;
                    outputStream.write(count);
                }
                break;
            }
        }
        inputStream.close();
        outputStream.close();
    }

}

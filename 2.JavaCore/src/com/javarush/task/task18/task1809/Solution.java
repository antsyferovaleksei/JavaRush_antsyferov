package com.javarush.task.task18.task1809;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* 
Реверс файла
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = bufferedReader.readLine();
        String fileName2 = bufferedReader.readLine();
        bufferedReader.close();
//        String fileName1 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";
//        String fileName2 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
        FileOutputStream outputStream = new FileOutputStream(fileName2);
        try (FileInputStream fileInputStream = new FileInputStream(fileName1)) {
            if (fileInputStream.available() > 0) {
                byte[] buffer = new byte[fileInputStream.available()];
                int count = fileInputStream.read(buffer);
                byte[] newBuffer = new byte[buffer.length];
                for(int i = buffer.length - 1; i>=0; i--){
                    newBuffer[buffer.length - i - 1] = buffer[i];
                }
                outputStream.write(newBuffer, 0, count);
                fileInputStream.close();
            }
        }
        outputStream.close();
    }
}

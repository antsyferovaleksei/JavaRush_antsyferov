package com.javarush.task.task18.task1810;

import java.io.*;

/* 
DownloadException
*/

public class Solution {
    public static void main(String[] args) throws DownloadException, IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fileInputStream;
        while(true){
            try {
                String fileName = bufferedReader.readLine();
                //String fileName = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";
                fileInputStream = new FileInputStream(fileName);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
            byte[] buffer = new byte[fileInputStream.available()];
            if(buffer.length < 1000){
                bufferedReader.close();
                fileInputStream.close();
                throw new DownloadException();
            }
        }
    }

    public static class DownloadException extends Exception {

    }
}

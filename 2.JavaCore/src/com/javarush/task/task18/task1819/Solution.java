//package com.javarush.task.task18.task1819;
//
//import java.io.*;
//
///*
//Объединение файлов
//*/
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName1 = bufferedReader.readLine();
//        String fileName2 = bufferedReader.readLine();
////        String fileName1 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
////        String fileName2 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test2.txt";
//        FileOutputStream outputStream1 = new FileOutputStream(fileName1, true);
//        try (FileInputStream fileInputStream1 = new FileInputStream(fileName1);
//             FileInputStream fileInputStream2 = new FileInputStream(fileName2)) {
//            byte[] buffer1 = new byte[fileInputStream1.available()];
//            byte[] buffer2 = new byte[fileInputStream2.available()];
//            fileInputStream1.read(buffer1);
//            fileInputStream2.read(buffer2);
//            new FileOutputStream(fileName1).close();
//            outputStream1.write(buffer2);
//            outputStream1.write(buffer1);
//            fileInputStream1.close();
//            fileInputStream2.close();
//        }
//        outputStream1.close();
//    }
//}


package com.javarush.task.task18.task1819;

import java.io.*;

/*
Объединение файлов
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();

        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try (FileInputStream fileInputStream1 = new FileInputStream(fileName1);
             FileInputStream fileInputStream2 = new FileInputStream(fileName2)) {

            while (fileInputStream2.available() > 0) {
                byteArrayOutputStream.write(fileInputStream2.read());
            }
            while (fileInputStream1.available() > 0) {
                byteArrayOutputStream.write(fileInputStream1.read());
            }
        }
        try (FileOutputStream fileOutputStream = new FileOutputStream(fileName1)) {
            byteArrayOutputStream.writeTo(fileOutputStream);
        }
    }
}

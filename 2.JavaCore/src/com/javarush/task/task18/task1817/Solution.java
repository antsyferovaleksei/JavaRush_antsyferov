//package com.javarush.task.task18.task1817;
//
//import java.io.FileNotFoundException;
//import java.io.FileReader;
//import java.io.IOException;
//import java.text.DecimalFormat;
//
///*
//Пробелы
//*/
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//       // String fileName = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";
//        DecimalFormat df = new DecimalFormat("0.00");
//        try (FileReader fileReader = new FileReader(args[0])) {
//            double spaceCount = 0, anotherCount = 0;
//            while (fileReader.ready()) {
//                char readChar = (char) fileReader.read();
//                int compareOneTwo = Character.compare(readChar, ' ');
//                anotherCount++;
//                if (compareOneTwo == 0) {
//                    spaceCount++;
//                }
//            }
//            double res = spaceCount / anotherCount * 100;
//            System.out.println(df.format(res));
//        }
//    }
//}
package com.javarush.task.task18.task1817;

import java.io.FileReader;
import java.io.IOException;

/*
Пробелы
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        int total = 0;
        int spaces = 0;
        try (FileReader fileReader = new FileReader(args[0])) {
            while (fileReader.ready()) {
                int readedChar = fileReader.read();
                total++;
                if (readedChar == (int) ' ') spaces++;
            }
        }
        if (total != 0) {
            double result = (double) spaces / total * 100;
            System.out.printf("%.2f", result);
        }
    }
}


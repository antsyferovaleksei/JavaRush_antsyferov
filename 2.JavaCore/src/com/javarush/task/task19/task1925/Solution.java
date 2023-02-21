//package com.javarush.task.task19.task1925;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
///*
//Длинные слова
//*/
//
//public class Solution {
//    public static void main(String[] args) throws IOException {
//        String fileName1 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
//        String fileName2 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test2.txt";
////        String fileName1 = args[0];
////        String fileName2 = args[1];
//
//        List<String> initialString = new ArrayList<>();
//        try (BufferedReader br = new BufferedReader(new FileReader(fileName1))) {
//            while (br.ready()) {
//                String line = br.readLine();
//                initialString.addAll(Arrays.asList(line.split(" ")));
//            }
//        }
//
//        try (BufferedWriter br = new BufferedWriter(new FileWriter(fileName2))) {
//            for (int i = 0; i < initialString.size(); i++) {
//                if(initialString.get(i).length() > 6) {
//                    br.write(initialString.get(i));
//                    if (i != initialString.size() - 1) {
//                        br.write(",");
//                    }
//                }
//            }
//        }
//    }
//}
//
package com.javarush.task.task19.task1925;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
Длинные слова
*/

public class Solution {
    public static void main(String[] args) {
        String fileName1 = args[0];
        String fileName2 = args[1];
        String input;

        ArrayList<String> fileContent = new ArrayList<String>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName1))) {
            while ((input = fileReader.readLine()) != null)
                fileContent.add(input);
        } catch (IOException ignore) {
            /* NOP */
        }

        StringBuffer sbLine = new StringBuffer();
        for (String line : fileContent) {
            String[] splitedLine = line.split(" ");
            for (String word : splitedLine) {
                if (word.length() > 6)

                    sbLine.append(word).append(" ");
            }
        }

        String resultLine = sbLine.toString().trim().replaceAll(" ", ",");
        try (FileWriter fileWriter = new FileWriter(fileName2)) {
            fileWriter.write(resultLine);
        } catch (IOException ignore) {
            /* NOP */
        }
    }
}

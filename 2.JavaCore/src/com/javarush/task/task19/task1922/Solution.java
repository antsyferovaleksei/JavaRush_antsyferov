//package com.javarush.task.task19.task1922;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.List;
//
///*
//Ищем нужные строки
//*/
//
//public class Solution {
//    public static List<String> words = new ArrayList<String>();
//    public static List<String> initialString = new ArrayList<>();
//
//    static {
//        words.add("файл");
//        words.add("вид");
//        words.add("В");
//    }
//
//    public static void main(String[] args) throws IOException {
//      //  String fileName = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
//
//        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
//            while (br.ready()) {
//                String line = br.readLine();
//                initialString = Arrays.asList(line.split(" "));
//                words.retainAll(initialString);
//                if(words.size() == 2){
//                    System.out.println(words);
//                }
//            }
//        }
//    }
//}
package com.javarush.task.task19.task1922;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Ищем нужные строки
*/

public class Solution {
    public static List<String> words = new ArrayList<String>();

    static {
        words.add("файл");
        words.add("вид");
        words.add("В");
    }

    public static void main(String[] args) {
        String file1 = null;
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))) {
            file1 = reader.readLine();

        } catch (IOException ignore) {
            /* NOP */
        }

        try (BufferedReader in = new BufferedReader(new FileReader(file1))) {
            while (in.ready()) {
                String readedString = in.readLine();
                String[] splitedReadedString = readedString.split(" ");

                int wordCount = 0;
                for (String s : splitedReadedString) {
                    if (words.contains(s)) {
                        wordCount++;
                    }
                }

                if (wordCount == 2)
                    System.out.println(readedString);
            }
        } catch (IOException ignore) {
            /* NOP */
        }
    }
}

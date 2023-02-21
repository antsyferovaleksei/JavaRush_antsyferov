//package com.javarush.task.task17.task1721;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Scanner;
//
///*
//Транзакционность
//*/
//
//public class Solution {
//    public static List<String> allLines = new ArrayList<String>();
//    public static List<String> forRemoveLines = new ArrayList<String>();
//
//    public static String firstFileName;
//    public static String secondFileName;
//
//    static {
//        Scanner in = new Scanner(System.in);
//        firstFileName = in.nextLine();
//        secondFileName = in.nextLine();
//        //firstFileName = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";
//        //secondFileName = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test4.txt";
//    }
//
//    public static void main(String[] args) {
//        Solution solution = new Solution();
//        try {
//            solution.joinData();
//        } catch (CorruptedDataException e) {
//            throw new RuntimeException(e);
//        }
//    }
//
//    public void joinData() throws CorruptedDataException {
//        List<String> allLines = getFileContent(firstFileName);
//        List<String> forRemoveLines = getFileContent(secondFileName);
//        int counter = 0;
//        for(String removeLine : forRemoveLines){
//            for (String allLine : allLines){
//                try {try
//                    if (allLine.equals(removeLine)) {
//                        allLines.set(allLines.indexOf(removeLine), null);
//                        counter++;
//                    }
//                }catch (NullPointerException e){}
//            }
//        }
//        if (counter != allLines.size()){
//            allLines.removeAll(allLines);
//            throw new CorruptedDataException();
//        } else {
//            allLines.removeAll(allLines);
//        }
//    }
//
//    public List<String> getFileContent(String fileName) {
//        BufferedReader br = null;
//        List<String> everything = new ArrayList<>();
//
//        try {
//            br = new BufferedReader(new FileReader(fileName));
//            //StringBuilder sb = new StringBuilder();
//            String line = br.readLine();
//
//            while (line != null) {
//                everything.add(line);
//                line = br.readLine();
//            }
//        } catch (FileNotFoundException e) {
//            throw new RuntimeException(e);
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        } finally {
//            try {
//                br.close();
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        return everything;
//    }
//}
package com.javarush.task.task17.task1721;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Транзакционность
*/

public class Solution {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = null;
        String fileName2 = null;
        try {
            fileName1 = reader.readLine();
            fileName2 = reader.readLine();
            reader.close();
            BufferedReader fReader1 = new BufferedReader(new FileReader(fileName1));
            String input;
            while ((input = fReader1.readLine()) != null)
                allLines.add(input);
            fReader1.close();
            BufferedReader fReader2 = new BufferedReader(new FileReader(fileName2));
            while ((input = fReader2.readLine()) != null)
                forRemoveLines.add(input);
            fReader2.close();
            new Solution().joinData();
        } catch (Exception ignore) {
        }

    }

    public void joinData() throws CorruptedDataException {
        if (allLines.containsAll(forRemoveLines))
            allLines.removeAll(forRemoveLines);
        else {
            allLines.clear();
            throw new CorruptedDataException();
        }

    }
}

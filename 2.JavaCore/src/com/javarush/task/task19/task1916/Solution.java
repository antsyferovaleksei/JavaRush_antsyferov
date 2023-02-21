package com.javarush.task.task19.task1916;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/* 
Отслеживаем изменения
*/

public class Solution {
    public static List<LineItem> lines = new ArrayList<LineItem>();
    public static List<String> file1Lines = new ArrayList<>();
    public static List<String> file2Lines = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        String fileName1, fileName2;
//        String fileName1 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
//        String fileName2 = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test2.txt";
        try (BufferedReader br = new BufferedReader(new InputStreamReader(System.in))) {
            fileName1 = br.readLine();
            fileName2 = br.readLine();
        }
        file1Lines = readFile(fileName1);
        file2Lines = readFile(fileName2);
//        for (int i = 0; i < line1.size(); i++) {
//            for (int j = 0; j < line2.size(); j++) {
//                if(line1.get(i).equals(line2.get(j))){
//                    lines.add(new LineItem(Type.SAME, line1.get(i)));
//                }
//                if(!line1.get(i).equals(line2.get(j))){
//                    lines.add(new LineItem(Type.REMOVED, line1.get(i)));
//                }
//                if(!line2.get(i).equals(line1.get(j))){
//                    lines.add(new LineItem(Type.REMOVED, line1.get(i)));
//                }
//            }
//        }
        int file1Line = 0;
        int file2Line = 0;

        while ((file1Line < file1Lines.size()) && (file2Line < file2Lines.size())) {
            if (file1Lines.get(file1Line).equals(file2Lines.get(file2Line))) {
                lines.add(new LineItem(Type.SAME, file1Lines.get(file1Line)));
                file1Line++;
                file2Line++;
            } else if ((file2Line + 1 < file2Lines.size()) &&
                    file1Lines.get(file1Line).equals(file2Lines.get(file2Line + 1))) {
                lines.add(new LineItem(Type.ADDED, file2Lines.get(file2Line)));
                file2Line++;
            } else if ((file1Line + 1 < file1Lines.size()) &&
                    file1Lines.get(file1Line + 1).equals(file2Lines.get(file2Line))) {
                lines.add(new LineItem(Type.REMOVED, file1Lines.get(file1Line)));
                file1Line++;
            }
        }

        while (file1Line < (file1Lines.size())) {
            lines.add(new LineItem(Type.REMOVED, file1Lines.get(file1Line)));
            file1Line++;
        }
        while (file2Line < (file2Lines.size())) {
            lines.add(new LineItem(Type.ADDED, file2Lines.get(file2Line)));
            file2Line++;
        }
    }

    private static List<String> readFile(String fileName) throws IOException {
        List<String> line = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(fileName))) {
            String currentLine;
            while (br.ready()) {
                currentLine = br.readLine();
                line.add(currentLine);
            }
        }
        return line;
    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}

//package com.javarush.task.task19.task1927;
//
//import java.io.ByteArrayOutputStream;
//import java.io.PrintStream;
//import java.util.ArrayList;
//import java.util.List;
//
///*
//Контекстная реклама
//*/
//
//public class Solution {
//    public static TestString testString = new TestString();
//
//    public static void main(String[] args) {
//        PrintStream consoleStream = System.out;
//        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
//        PrintStream printStream = new PrintStream(outputStream);
//        System.setOut(printStream);
//        testString.printSomething();
//
//        List<String> allResultLines = new ArrayList<>();
//        List<String> allInitLines = List.of(outputStream.toString().split("\\n"));
//        int counter = 0;
//        for (int i = 0; i < allInitLines.size(); i++) {
//            if (i % 2 == 0 && i != 0) {
//                    allResultLines.add(i + counter, "JavaRush - курсы Java онлайн");
//                    counter++;
//            }
//            allResultLines.add(i+ counter, allInitLines.get(i));
//        }
//
//        System.setOut(consoleStream);
//        for (String str: allResultLines) {
//            System.out.println(str);
//        }
//    }
//
//    public static class TestString {
//        public void printSomething() {
//            System.out.println("first");
//            System.out.println("second");
//            System.out.println("third");
//            System.out.println("fourth");
//            System.out.println("fifth");
//        }
//    }
//}
package com.javarush.task.task19.task1927;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

/*
Контекстная реклама
*/

public class Solution {
    public static TestString testString = new TestString();

    public static void main(String[] args) {
        PrintStream defaultPrintStream = System.out;
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();

        System.setOut(new PrintStream(byteArrayOutputStream));

        testString.printSomething();

        System.setOut(defaultPrintStream);

        String[] byteArray = byteArrayOutputStream.toString().split("\\n");
        for (int i = 0; i < byteArray.length; i++) {
            System.out.println(byteArray[i]);
            if (i % 2 != 0)
                System.out.println("JavaRush - курсы Java онлайн");
        }
    }

    public static class TestString {
        public void printSomething() {
            System.out.println("first");
            System.out.println("second");
            System.out.println("third");
            System.out.println("fourth");
            System.out.println("fifth");
        }
    }
}


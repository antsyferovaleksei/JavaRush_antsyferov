package com.javarush.task.task19.task1904;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/* 
И еще один адаптер
*/

public class Solution {

    public static void main(String[] args) throws IOException {
//        String filename = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";
//        File text = new File(filename);
//        Scanner scnr = new Scanner(text);
//        PersonScannerAdapter personScannerAdapter = new PersonScannerAdapter(scnr);
//        personScannerAdapter.read();
    }

    public static class PersonScannerAdapter implements PersonScanner {

        private Scanner fileScanner;

        public PersonScannerAdapter(Scanner scanner) {
            this.fileScanner = scanner;
        }

        @Override
        public Person read() throws IOException {
        //    while (fileScanner.hasNextLine()) {
                String line = fileScanner.nextLine();
                try {
                   return parseLine(line);
                } catch (ParseException e) {
                    throw new RuntimeException(e);
                }
          //  }
        }

        private Person parseLine(String line) throws ParseException {
            //Иванов Иван Иванович 31 12 1950
            String separator = " ";
            String tempString;
            String year = line.substring(line.lastIndexOf(separator)).trim(); //1950
            tempString = line.substring(0, line.lastIndexOf(separator));//Иванов Иван Иванович 31 12
            String month = tempString.substring(tempString.lastIndexOf(separator)).trim(); //12
            tempString = tempString.substring(0, tempString.lastIndexOf(separator));//Иванов Иван Иванович 31
            String day = tempString.substring(tempString.lastIndexOf(separator)).trim(); //31
            tempString = tempString.substring(0, tempString.lastIndexOf(separator));//Иванов Иван Иванович
            String middleName = tempString.substring(tempString.lastIndexOf(separator)).trim(); //Иванович
            tempString = tempString.substring(0, tempString.lastIndexOf(separator));//Иванов Иван
            String firstName = tempString.substring(tempString.lastIndexOf(separator)).trim(); //Иван
            String lastName = tempString.substring(0, tempString.lastIndexOf(separator)).trim();//Иванов
            String sDate1 = day + "/" + month + "/" + year;
            Date birthDate = new SimpleDateFormat("dd/MM/yyyy").parse(sDate1);
            return new Person(firstName, middleName, lastName, birthDate);

        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}

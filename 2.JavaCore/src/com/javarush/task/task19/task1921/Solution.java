package com.javarush.task.task19.task1921;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/* 
Хуан Хуанович
*/

public class Solution {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException, ParseException {
        //String fileName = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(args[0]))) {
            while (br.ready()) {
                String line = br.readLine();
                String separator = " ";
                String tempString;
                //Иванов Иван Иванович 31 12 1987
                String year = line.substring(line.lastIndexOf(separator)).trim(); //1987
                tempString = line.substring(0, line.lastIndexOf(separator));//Иванов Иван Иванович 31 12
                String month = tempString.substring(tempString.lastIndexOf(separator)); // 12
                tempString = tempString.substring(0, tempString.lastIndexOf(separator));//Иванов Иван Иванович 31
                String day = tempString.substring(tempString.lastIndexOf(separator)); // 31
                String name =  tempString.substring(0, tempString.lastIndexOf(separator));//Иванов Иван Иванович
                Date date = new SimpleDateFormat("dd/MM/yyyy").parse(day + "/" + month + "/" + year);
                PEOPLE.add(new Person(name, date));
            }
        }
    }
}

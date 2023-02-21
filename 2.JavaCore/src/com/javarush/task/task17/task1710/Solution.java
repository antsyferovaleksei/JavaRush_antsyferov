package com.javarush.task.task17.task1710;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD
*/

public class Solution {
    public static List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //напишите тут ваш код
        if (args[0].equals("-c")) {
            Person newPerson = null;
            DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            String dateAsString = args[3];
            Date date;
            try {
                date = sourceFormat.parse(dateAsString);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            if (args[2].equals("м")) {
                newPerson = Person.createMale(args[1], date);
            } else if (args[2].equals("ж")) {
                newPerson = Person.createFemale(args[1], date);
            } else {
                System.out.println("Wrong sex");
            }
            allPeople.add(newPerson);
            System.out.println(allPeople.indexOf(newPerson));
        } else if (args[0].equals("-r")) {
            int id = Integer.parseInt(args[1]);
            String name = "";
            String sex = "";
            String bd = "";
            if (id <= allPeople.size()) {
                name = allPeople.get(id).getName();
                if(String.valueOf(allPeople.get(id).getSex()).equals("MALE")){
                    sex = "м";
                } else {
                    sex = "ж";
                }
                DateFormat dateFormat = new SimpleDateFormat("dd-MMM-yyyy", Locale.ENGLISH);
                bd = dateFormat.format(allPeople.get(id).getBirthDate());
            } else {
                System.out.println("Wrong id");
            }
            System.out.println(name + " " + sex + " " + bd);
        }else if (args[0].equals("-u")) {
            int id = Integer.parseInt(args[1]);
            Person updatePerson = allPeople.get(id);
            DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);
            String dateAsString = args[4];
            Date date;
            try {
                date = sourceFormat.parse(dateAsString);
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            updatePerson.setSex(getSex(args[3]));
            updatePerson.setName(args[2]);
            updatePerson.setBirthDate(date);
            allPeople.set(id, updatePerson);
        }  else if (args[0].equals("-d")) {
            int id = Integer.parseInt(args[1]);
            Person nullPerson = Person.createMale(null, null);
            nullPerson.setSex(null);
            allPeople.set(id, nullPerson);
        }
    }

    private static Sex getSex(String sexParam) {
        return sexParam.equals("м") ? Sex.MALE : Sex.FEMALE;
    }
}

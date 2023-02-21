package com.javarush.task.task17.task1711;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* 
CRUD 2
*/

public class Solution {
    public static volatile List<Person> allPeople = new ArrayList<Person>();

    static {
        allPeople.add(Person.createMale("Иванов Иван", new Date()));  //сегодня родился    id=0
        allPeople.add(Person.createMale("Петров Петр", new Date()));  //сегодня родился    id=1
    }

    public static void main(String[] args) {
        //start here - начни тут
        DateFormat sourceFormat = new SimpleDateFormat("dd/MM/yyyy", Locale.ENGLISH);

        switch (args[0]){
            case "-c": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 3) {
                        Person newPerson = null;
                        String dateAsString = args[i + 2];
                        Date date;
                        try {
                            date = sourceFormat.parse(dateAsString);
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
                        }
                        if (args[i + 1].equals("м")) {
                            newPerson = Person.createMale(args[i], date);
                        } else if (args[i + 1].equals("ж")) {
                            newPerson = Person.createFemale(args[i], date);
                        } else {
                            System.out.println("Wrong sex");
                        }
                        allPeople.add(newPerson);
                        System.out.println(allPeople.indexOf(newPerson));
                    }
                    break;
                }
            }
            case "-u": {
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i += 4) {
                        int id = Integer.parseInt(args[i]);
                        Person updatePerson = allPeople.get(id);
                        String dateAsString = args[i + 3];
                        Date date;
                        try {
                            date = sourceFormat.parse(dateAsString);
                        } catch (ParseException e) {
                            throw new RuntimeException(e);
                        }
                        updatePerson.setSex(getSex(args[i + 2]));
                        updatePerson.setName(args[i + 1]);
                        updatePerson.setBirthDate(date);
                        allPeople.set(id, updatePerson);
                    }
                    break;
                }
            }
            case "-d":{
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        Person nullPerson = Person.createMale(null, null);
                        nullPerson.setSex(null);
                        allPeople.set(id, nullPerson);
                    }
                    break;
                }
            }
            case "-i":{
                synchronized (allPeople) {
                    for (int i = 1; i < args.length; i++) {
                        int id = Integer.parseInt(args[i]);
                        String name = "";
                        String sex = "";
                        String bd = "";
                        if (id <= allPeople.size()) {
                            name = allPeople.get(id).getName();
                            if (String.valueOf(allPeople.get(id).getSex()).equals("MALE")) {
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
                    }
                    break;
                }
            }
        }
    }
    private static Sex getSex(String sexParam) {
        return sexParam.equals("м") ? Sex.MALE : Sex.FEMALE;
    }
}

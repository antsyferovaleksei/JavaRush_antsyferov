package com.javarush.task.task14.task1411;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* 
User, Loser, Coder and Proger
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Person person = null;
        String key = null;

        //тут цикл по чтению ключей, пункт 1
//        while (((key = reader.readLine()).equals("user" ) || (key = reader.readLine()).equals("loser") ||
//                (key = reader.readLine()).equals("proger") || (key = reader.readLine()).equals("coder"))) {
        while (true) {
        //создаем объект, пункт 2
            key = reader.readLine();
            //System.out.println("key " + key);
            if (key.equals("user")) {
                person = new Person.User();
                key = null;
            } else if (key.equals("loser")) {
                person = new Person.Loser();
                key = null;
            } else if (key.equals("proger")) {
                person = new Person.Proger();
                key = null;
            } else if (key.equals("coder")) {
                person = new Person.Coder();
                key = null;
            } else {
                break;
            }

            doWork(person); //вызываем doWork
        }
    }

    public static void doWork(Person person) {
        // пункт 3
        if (person instanceof Person.User) {
            ((Person.User) person).live();
        } else if (person instanceof Person.Loser) {
            ((Person.Loser) person).doNothing();
        } else if (person instanceof Person.Coder) {
            ((Person.Coder) person).writeCode();
        } else if (person instanceof Person.Proger) {
            ((Person.Proger) person).enjoy();
        }
    }
}

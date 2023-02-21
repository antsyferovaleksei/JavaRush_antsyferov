package com.javarush.task.pro.task14.task1415;

import java.util.LinkedList;
import java.util.List;

/* 
Стек в домашних условиях
*/

public class MyStack {

    private final List<String> storage = new LinkedList<>();

    public void push(String s) {
        //напишите тут ваш код
        storage.add(0, s);
    }

    public String pop() {
        //напишите тут ваш код
        if (storage.size() > 0) {
            String firstElement = storage.get(0);
            storage.remove(0);
            return firstElement;
        }
        return null;
    }

    public String peek() {
        //напишите тут ваш код
        if (storage.size() > 0) {
            return storage.get(0);
        }
        return null;
    }

    public boolean empty() {
        //напишите тут ваш код
        if (storage.size() > 0) {
            return false;
        }
        return true;
    }

    public int search(String s) {
        //напишите тут ваш код
        boolean isPresent = storage.contains(s);
        if(isPresent) {
            return storage.indexOf(s);
        }
        return -1;
    }
}

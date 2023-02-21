package com.javarush.task.pro.task18.task1819;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

/* 
Как быть, если в списке есть элемент null
*/

public class Solution {

    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        Collections.addAll(strings, "first", "second", null, "fourth", "fifth");

        printList(strings);
    }

    public static void printList(List<String> list) {
        String text = "Этот элемент равен null";
        //напишите тут ваш код
            Optional<String> str = Optional.ofNullable(list.get(0));
            System.out.println(str.orElse(text));
        Optional<String> str1 = Optional.ofNullable(list.get(1));
        System.out.println(str1.orElse(text));
        Optional<String> str2 = Optional.ofNullable(list.get(2));
        System.out.println(str2.orElse(text));
        Optional<String> str3 = Optional.ofNullable(list.get(3));
        System.out.println(str3.orElse(text));
    }
}

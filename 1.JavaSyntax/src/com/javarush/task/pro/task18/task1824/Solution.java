package com.javarush.task.pro.task18.task1824;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.stream.Collectors.toMap;

/* 
Из потока данных — в map
*/

public class Solution {

    public static void main(String[] args) {
        var stringStream = Stream.of("JavaRush", "CodeGym", "Amigo", "Elly", "Kim", "Risha");

        getMap(stringStream).forEach((s, i) -> System.out.println(s + " - " + i));
    }

//    public static Map<String, Integer> getMap(Stream<String> stringStream) {
//        //напишите тут ваш код
//        System.out.println(stringStream.findFirst().get());
//        System.out.println(stringStream.findFirst().get().length());
//        return null;
//        //return stringStream.collect(Collectors.toMap(stringStream.findFirst().get(), stringStream.findFirst().get().length()));
//    }

    public static Map<String, Integer> getMap(Stream<String> stringStream) {
        return stringStream.collect(toMap(string -> string, String::length));
    }
}

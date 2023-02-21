package com.javarush.task.task22.task2210;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

/* 
StringTokenizer
*/

public class Solution {
    public static void main(String[] args) {
        String[] arr = getTokens("level22.lesson13.task01", ".");
        System.out.println(arr);
    }

    public static String[] getTokens(String query, String delimiter) {
//        String d = "\\" + delimiter;
//        return query.split(d);
        List<String> list = new ArrayList<>();
        StringTokenizer tokenizer =
                new StringTokenizer(query, delimiter);
        while (tokenizer.hasMoreTokens()) {
            String token = tokenizer.nextToken();
            list.add(token);
        }
        return list.toArray(new String[list.size()]);
    }
}

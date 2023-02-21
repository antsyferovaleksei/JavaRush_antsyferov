package com.javarush.task.task15.task1514;

import java.util.HashMap;
import java.util.Map;

/* 
Статики-1
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();
    static
    {
        labels.put(1d, "test1");
        labels.put(2d, "test2");
        labels.put(3d, "test3");
        labels.put(4d, "test4");
        labels.put(5d, "test5");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}

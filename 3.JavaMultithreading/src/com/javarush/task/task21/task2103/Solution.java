package com.javarush.task.task21.task2103;

/* 
Все гениальное - просто!
*/

public class Solution {
    public static boolean calculate(boolean a, boolean b, boolean c, boolean d) {
//        System.out.println((a && b && c && !d));
//        System.out.println((!a && c));
//        System.out.println((!b && c));
//        System.out.println(c && d);
//        System.out.println("=====");
        return c;
       // return (a && b && c && !d) || (!a && c) || (!b && c) || (c && d);
    }

    public static void main(String[] args) {

//        System.out.println(calculate(true, true, true, true));
//        System.out.println(calculate(false, false, false, false));
//        System.out.println(calculate(true, false, true, false));
//        System.out.println(calculate(false, true, false, true));
    }
}

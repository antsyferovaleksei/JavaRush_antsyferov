package com.javarush.task.pro.task17.task1708;

/* 
Минимальное и максимальное
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinMaxUtil {
    //напишите тут ваш код
//    public static int max(int x) {
//        return x;
//    }
//
//    public static int max(int x, int y) {
//        List<Integer> list = new ArrayList<>() {{
//            add(x);
//            add(y);
//        }};
//        return Collections.max(list);
//    }
//
//    public static int max(int x, int y, int z) {
//        List<Integer> list = new ArrayList<>() {{
//            add(x);
//            add(y);
//            add(z);
//        }};
//        return Collections.max(list);
//    }
//
//    public static int max(int x, int y, int z, int k) {
//        List<Integer> list = new ArrayList<>() {{
//            add(x);
//            add(y);
//            add(z);
//            add(k);
//        }};
//        return Collections.max(list);
//    }
//
//    public static int min(int x) {
//        return x;
//    }
//
//    public static int min(int x, int y) {
//        List<Integer> list = new ArrayList<>() {{
//            add(x);
//            add(y);
//        }};
//        return Collections.min(list);
//    }
//
//    public static int min(int x, int y, int z) {
//        List<Integer> list = new ArrayList<>() {{
//            add(x);
//            add(y);
//            add(z);
//        }};
//        return Collections.min(list);
//    }
//
//    public static int min(int x, int y, int z, int k) {
//        List<Integer> list = new ArrayList<>() {{
//            add(x);
//            add(y);
//            add(z);
//            add(k);
//        }};
//        return Collections.min(list);
//    }
    public static int min(int a, int b) {
        return Math.min(a, b);
    }

    public static int min(int a, int b, int c) {
        return min(c, min(a, b));
    }

    public static int min(int a, int b, int c, int d) {
        return min(d, min(a, b, c));
    }

    public static int min(int a, int b, int c, int d, int e) {
        return min(e, min(a, b, c, d));
    }

    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    public static int max(int a, int b, int c) {
        return max(c, max(a, b));
    }

    public static int max(int a, int b, int c, int d) {
        return max(d, max(a, b, c));
    }

    public static int max(int a, int b, int c, int d, int e) {
        return max(e, max(a, b, c, d));
    }
}

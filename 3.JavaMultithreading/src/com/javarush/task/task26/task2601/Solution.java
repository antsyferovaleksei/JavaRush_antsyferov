//package com.javarush.task.task26.task2601;
//
//import java.util.*;
//
///*
//Почитать в инете про медиану выборки
//*/
//
//public class Solution {
//
//    public static void main(String[] args) {
//        Integer[] array = new Integer[]{13, 8, 15, 5, 17};
//        Integer[] arrayRes = sort(array);
//        for (int i = 0; i < arrayRes.length; i++) {
//            System.out.println(arrayRes[i]);
//        }
//    }
//
//    public static Integer[] sort(Integer[] array) {
//        //implement logic here
//        Integer sum = 0;
//        for (int i = 0; i < array.length; i++) {
//            sum += array[i];
//        }
//
//        Integer mediana = Integer.MAX_VALUE;
//        for (int i = 0; i < array.length; i++) {
//            if (Math.abs(mediana - sum / array.length) > Math.abs(array[i] - sum / array.length)) {
//                mediana = array[i];
//            }
//        }
//
//        Map<Integer, Integer> tempMap = new TreeMap<>();
//        tempMap.put(0, mediana);
//        for (int i = 0; i < array.length; i++) {
//            if (array[i] != mediana) {
//                tempMap.put(Math.abs(mediana - array[i]), array[i]);
//            }
//        }
//
//        List<Integer> tempList = new ArrayList<>();
//        for (Integer val : tempMap.values()) {
//            tempList.add(val);
//        }
//
//        return tempList.toArray(new Integer[]{});
//    }
//}
package com.javarush.task.task26.task2601;

import java.util.Arrays;
import java.util.Comparator;

/*
Почитать в инете про медиану выборки
*/

public class Solution {

    public static void main(String[] args) {

    }

    public static Integer[] sort(Integer[] array) {
        final double mediana = getMediana(array);

        Arrays.sort(array, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                double v1 = o1.intValue() - mediana;
                double v2 = o2.intValue() - mediana;
                return (int) ((v1 * v1 - v2 * v2) * 100);
            }
        });

        return array;
    }

    private static double getMediana(Integer[] array) {
        Arrays.sort(array);
        double res;
        int length = array.length;

        if (length % 2 == 1) {
            res = array[length / 2];
        } else {
            res = (array[length / 2 - 1] + array[length / 2]) / 2.;
        }
        return res;
    }
}

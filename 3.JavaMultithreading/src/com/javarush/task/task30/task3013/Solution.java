package com.javarush.task.task30.task3013;

/* 
Битовые операции
*/


import java.util.HashMap;
import java.util.Map;

public class Solution extends Test implements A, B {
    public Solution(int x) {
        super(x);
    }

    public Solution(){
        super(0);
    }

    // @Override
    public void method0() {
        A.super.method1();
    }


    @Override
    public void method1() {
        System.out.println("method 1");
    }

    public void method2() {
        B.super.method1();
    }

    public void method3(){
        System.out.println("method 3");
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        solution.method0();
        solution.method1();
        solution.method2();
        A.method2();
        B.method2();
        solution.test();
        A a = new Solution(1);
        //a.method3();
        Test t = new Solution(2);
        //t.method3();

        Test t1 = new Test(3) {
            @Override
            public void method1() {
                System.out.println("method 1 t1");
            }
        };
        t1.method1();

        final StringBuilder str = new StringBuilder("test");
        final int i = 10;
        System.out.println(i);
        System.out.println(str);
        str.append(" new data");
        //i += 1;
        System.out.println(str);

        Map<StringBuilder, Integer> map = new HashMap<>();
        StringBuilder strB = new StringBuilder("test");
        StringBuilder strB1 = new StringBuilder("test1");
        map.put(strB, 10);
        map.put(strB1, 11);
        System.out.println("initial");
        for (Map.Entry<StringBuilder,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        strB.append("1");
        System.out.println("result");
        for (Map.Entry<StringBuilder,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
        System.out.println(map.get(new StringBuilder("test1")));
        System.out.println(map.get(strB));
        System.out.println(map.get(strB1));

        map.put(strB, 12);
        System.out.println("result2");
        for (Map.Entry<StringBuilder,Integer> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }


    //  public static void main(String[] args) {
//        Solution solution = new Solution();
//        int number = Integer.MAX_VALUE - 133;
//        System.out.println(Integer.toString(number, 2));                        //          1111111111111111111111101111010
//
//        String result = Integer.toString(solution.resetLowerBits(number), 2);
//        System.out.println(result);                                             //expected: 1000000000000000000000000000000
        // }


//    public int resetLowerBits(int number) {
//        number = number | (number >> 1);
//        number = number | (number >> 2);
//        number = number | (number >> 4);
//        number = number | (number >> 8);
//        number = number | (number >> 16);
//        return (number & ~(number >> 1));
//    }
}

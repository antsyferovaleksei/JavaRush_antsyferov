package com.javarush.task.pro.task11.task1109;

/* 
Объекты внутренних и вложенных классов
*/

public class Solution {
    public static void main(String[] args) {
        Outer.Inner in = new Outer().new Inner();
        Outer.Nested ne = new Outer.Nested();
    }
}

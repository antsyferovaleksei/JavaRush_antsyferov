package com.javarush.task.task14.task1421;

/* 
Singleton
*/

public class Solution {
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        if (s1 == s2){
            System.out.println("true");
        }
    }
}

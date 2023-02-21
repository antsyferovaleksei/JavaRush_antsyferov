package com.javarush.task.pro.task13.task1319;

public class Test {
    public static void main (String[] args){
        for (Month month : Month.getAutumnMonths()){
            System.out.println(month.toString());
        }

        for (Month month : Month.getWinterMonths()){
            System.out.println(month.toString());
        }

        for (Month month : Month.getSpringMonths()){
            System.out.println(month.toString());
        }

        for (Month month : Month.getSummerMonths()){
            System.out.println(month.toString());
        }
    }
}

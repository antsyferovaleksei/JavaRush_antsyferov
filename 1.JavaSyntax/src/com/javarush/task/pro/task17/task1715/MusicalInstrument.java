package com.javarush.task.pro.task17.task1715;

public interface MusicalInstrument {
    void play();

    default void play1() {
        System.out.println("test play 1");
    }

    public static int test = 10;
    public int test2 = 2;

    static void play2(){
        System.out.println("test play2");
    }
}

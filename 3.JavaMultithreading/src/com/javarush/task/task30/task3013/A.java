package com.javarush.task.task30.task3013;

public interface A {
    default void method1() {
        System.out.println("A");
    }

    static void method2(){
        System.out.println("A static");
    }
}

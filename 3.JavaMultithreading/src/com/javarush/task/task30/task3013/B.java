package com.javarush.task.task30.task3013;

public interface B {
    default void method1() {
        System.out.println("B");
    }

    static void method2(){
        System.out.println("B static");
    }
}

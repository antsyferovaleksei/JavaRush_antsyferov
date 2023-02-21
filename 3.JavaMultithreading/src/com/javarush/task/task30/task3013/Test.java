package com.javarush.task.task30.task3013;

public abstract class Test {

    private int x;

    public Test(int x){
        this.x = x;
        System.out.println(this.x);
    }

    public abstract void method1();

    public void test(){
        System.out.println("test");
    }
}

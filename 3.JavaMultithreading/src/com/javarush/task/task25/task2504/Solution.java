package com.javarush.task.task25.task2504;

/* 
Switch для нитей
*/

import java.lang.Thread.State;

public class Solution {
    public static void processThreads(Thread... threads) {
        //implement this method - реализуйте этот метод
        for (int i = 0; i < threads.length; i++) {
            switch (threads[i].getState()) {
                case NEW: {
                    threads[i].start();
                    break;
                }
                case TERMINATED: {
                    System.out.println(threads[i].getPriority());
                    break;
                }
                case WAITING: {
                    threads[i].interrupt();
                    break;
                }
                case TIMED_WAITING: {
                    threads[i].interrupt();
                    break;
                }
                case BLOCKED: {
                    threads[i].interrupt();
                    break;
                }
                case RUNNABLE:{
                    threads[i].isInterrupted();
                    break;
                }

            }
        }
    }

    public static void main(String[] args) {
    }
}

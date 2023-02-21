package com.javarush.task.task13.task1315;

/* 
Том, Джерри и Спайк
*/

public class Solution {
    public static void main(String[] args) {

    }

    //может двигаться
    public interface Movable {
        void move();
    }

    //может быть съеден
    public interface Edible {
        void beEaten();

        static void test(){
            System.out.println("test");
        }

        default void test2(){
            System.out.println("test 2");
        }
    }

    //может кого-нибудь съесть
    public interface Eat {
        void eat();
    }

    class Dog implements Movable, Eat {

        @Override
        public void move() {

        }

        @Override
        public void eat() {

        }
    }

    class Mouse implements Movable, Edible{

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }
    }

    class Cat implements Movable, Eat, Edible{

        @Override
        public void move() {

        }

        @Override
        public void beEaten() {

        }

        @Override
        public void eat() {

        }
    }
}
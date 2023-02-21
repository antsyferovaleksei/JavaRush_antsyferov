package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

public class Hippodrome {
    private List<Horse> horses;

    public static Hippodrome game;

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public List<Horse> getHorses() {
        return this.horses;
    }

    public static void main(String[] args) throws InterruptedException {
        List<Horse> horses = new ArrayList<>();
        Horse horse1 = new Horse("Mansur", 3, 0);
        Horse horse2 = new Horse("Misha", 3, 0);
        Horse horse3 = new Horse("Eduard", 3, 0);
        horses.add(horse1);
        horses.add(horse2);
        horses.add(horse3);
        game = new Hippodrome(horses);
        game.run();
        game.printWinner();
    }

    public void run() throws InterruptedException {
        for (int i = 0; i < 80; i++) {
            move();
            print();
            Thread.sleep(300);
        }
    }

    public void move() {
        for (Horse horse : horses) {
            horse.move();
        }
    }

    public void print() {
        for (Horse horse : horses) {
            horse.print();
        }
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    private Horse getWinner() {
        double distance1 = 0;
        int horseId = 0;
        for (int i = 0; i < horses.size(); i++) {
            Double resDistance = horses.get(i).getDistance();
            if (resDistance.compareTo(distance1) > 0) {
                distance1 = resDistance;
                horseId = i;
            }
        }
        return horses.get(horseId);
    }

    public void printWinner() {
        System.out.println("Winner is " + getWinner().getName() + "!");
    }
}

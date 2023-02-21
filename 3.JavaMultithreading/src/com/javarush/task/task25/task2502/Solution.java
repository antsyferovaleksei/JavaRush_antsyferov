package com.javarush.task.task25.task2502;

import java.util.*;

/* 
Машину на СТО не повезем!
*/

public class Solution {
    public static enum Wheel {
        FRONT_LEFT,
        FRONT_RIGHT,
        BACK_LEFT,
        BACK_RIGHT
    }

    public static class Car {
        protected List<Wheel> wheels;

        public Car() throws Exception {
            //init wheels here
            wheels = new ArrayList<>();
            String[] arr = loadWheelNamesFromDB();
            for (int i = 0; i < arr.length; i++) {
                if (arr[i].equals(String.valueOf(Wheel.valueOf(arr[i])))) {
                    wheels.add(Wheel.valueOf(arr[i]));
                }
            }

            List<Wheel> wheelsCopy = new ArrayList<>(wheels);
            int counter = 0;
            for (Wheel wheel : Wheel.values()) {
                for (Wheel w : wheels) {
                    if (wheel.equals(w)) {
                        wheelsCopy.remove(w);
                        counter++;
                        break;
                    }
                }
            }
            if (wheelsCopy.size() > 0 || counter < 4) {
                throw new Exception();
            }
        }

        protected String[] loadWheelNamesFromDB() {
            //this method returns mock data
            return new String[]{"FRONT_LEFT", "FRONT_RIGHT", "BACK_LEFT", "BACK_RIGHT"};
        }
    }

    public static void main(String[] args) throws Exception {
        Car c = new Car();
    }
}

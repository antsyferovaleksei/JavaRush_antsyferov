package com.javarush.task.task13.task1317;

/* 
The weather is fine
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(new Today(WeatherType.CLOUDY));
        System.out.println(new Today(WeatherType.FOGGY));
        System.out.println(new Today(WeatherType.FREEZING));
    }

    static class Today implements Weather {
        private String type;

        Today(String type) {
            this.type = type;
        }

        @Override
        public String toString() {
            return String.format("Today it will be %s", this.getWeatherType());
        }

        @Override
        public String getWeatherType() {
//            if(type.equals(WeatherType.CLOUDY)){
//                return WeatherType.CLOUDY;
//            } else if (type.equals(WeatherType.FOGGY)) {
//                return  WeatherType.FOGGY;
//            } else if (type.equals(WeatherType.FREEZING)) {
//                return WeatherType.FREEZING;
//            }
            return this.type;
        }
    }
}

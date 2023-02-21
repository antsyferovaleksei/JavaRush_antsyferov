package com.javarush.task.task19.task1903;

import java.util.HashMap;
import java.util.Map;

/* 
Адаптация нескольких интерфейсов
*/

public class Solution {
    public static Map<String, String> countries = new HashMap<String, String>();

    static {
        countries.put("UA", "Ukraine");
        countries.put("RU", "Russia");
        countries.put("CA", "Canada");
    }

    public static void main(String[] args) {

    }

    public static class IncomeDataAdapter implements Customer, Contact {

        private IncomeData data;

        public IncomeDataAdapter(IncomeData data) {
            this.data = data;
        }

        @Override
        public String getCompanyName() {
            return data.getCompany();
        }

        @Override
        public String getCountryName() {
            String result = "";
            for (Map.Entry<String, String> entry : countries.entrySet()) {
                if (entry.getKey().equals(data.getCountryCode())) {
                    result = entry.getValue();
                }
            }
            return result;
        }

        @Override
        public String getName() {
            return data.getContactLastName() + ", " + data.getContactFirstName();
        }

        @Override
        public String getPhoneNumber() {
            String phone;
            String code = String.valueOf(data.getCountryPhoneCode());
            int numberL = String.valueOf(data.getPhoneNumber()).length();
            String number = "";
            if (numberL < 10) {
                for (int i = 0; i < 10 - numberL; i++) {
                    number += "0";
                }
            }
            number += data.getPhoneNumber();
            phone = "+" + code + "(" + number.substring(0, 3) + ")" + number.substring(3, 6) + "-"
                    + number.substring(6, 8) + "-" + number.substring(8);
            return phone;
        }
//        @Override
//        public String getPhoneNumber() {
//            String res = String.format("+%d(%2$s)%3$s-%4$s-%5$s", data.getCountryPhoneCode(),
//                    String.format("%010d", data.getPhoneNumber()).substring(0, 3),
//                    String.format("%010d", data.getPhoneNumber()).substring(3, 6),
//                    String.format("%010d", data.getPhoneNumber()).substring(6, 8),
//                    String.format("%010d", data.getPhoneNumber()).substring(8));
//
//            return res;
//        }
    }


    public interface IncomeData {
        String getCountryCode();        //For example: UA

        String getCompany();            //For example: JavaRush Ltd.

        String getContactFirstName();   //For example: Ivan

        String getContactLastName();    //For example: Ivanov

        int getCountryPhoneCode();      //For example: 38

        int getPhoneNumber();           //For example1: 501234567, For example2: 71112233
    }

    public interface Customer {
        String getCompanyName();        //For example: JavaRush Ltd.

        String getCountryName();        //For example: Ukraine
    }

    public interface Contact {
        String getName();               //For example: Ivanov, Ivan

        String getPhoneNumber();        //For example1: +38(050)123-45-67, For example2: +38(007)111-22-33
    }
}
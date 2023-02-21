//package com.javarush.task.task22.task2208;
//
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.TreeMap;
//
///*
//Формируем WHERE
//*/
//
//public class Solution {
//    public static void main(String[] args) {
//        Map<String, String> params = new LinkedHashMap<>();
//        params.put("name", "Ivanov");
//        params.put("country", "Ukraine");
//        params.put("city", "Kiev");
//        params.put("age", null);
//        System.out.println(getQuery(params));
//    }
//
//    public static String getQuery(Map<String, String> params) {
//        StringBuilder str = new StringBuilder();
//        int counter = 0;
//        for (Map.Entry<String, String> param: params.entrySet()) {
//            if(param.getValue() != null){
//                counter++;
//                str.append(param.getKey() + " = '" + param.getValue() + "'");
//                if(counter < params.size()) {
//                    str.append(" and ");
//                }
//            }
//            counter++;
//        }
//        return String.valueOf(str).trim();
//    }
//}
package com.javarush.task.task22.task2208;

import java.util.LinkedHashMap;
import java.util.Map;

/*
Формируем WHERE
*/

public class Solution {
    public static void main(String[] args) {
        Map<String, String> paramsMap = new LinkedHashMap<>();
        paramsMap.put("name", "Ivanov");
        paramsMap.put("country", "Ukraine");
        paramsMap.put("city", "Kiev");
        paramsMap.put("age", null);

        System.out.println(getQuery(paramsMap));
    }

    public static String getQuery(Map<String, String> params) {
        StringBuilder queryBuilder = new StringBuilder();
        for (String s : params.keySet()) {
            String value = params.get(s);
            if (value == null) {
                continue;
            }
            if (queryBuilder.toString().length() != 0) {
                queryBuilder.append(" and ");
            }
            queryBuilder.append(s + " = '" + value + "'");
        }
        return queryBuilder.toString();
    }
}


package com.javarush.task.task18.task1802;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* 
Минимальный байт
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();
        FileInputStream fileInputStream = new FileInputStream(fileName);
       // System.out.println(fileName);

        int el;
        int min = Integer.MAX_VALUE;

        while((el=fileInputStream.read())!= -1){
            //System.out.println(el);
            if(min>el){
                min = el;
            }
        }
        System.out.println(min);
        reader.close();
        fileInputStream.close();
    }
}

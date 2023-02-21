package com.javarush.task.task14.task1420;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Scanner;

/* 
НОД
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int res = 0;
        if (Math.abs(n1) > Math.abs(n2)) {
            res = nod(Math.abs(n1), Math.abs(n2));
        } else if (Math.abs(n1) < Math.abs(n2)) {
            res = nod(Math.abs(n2), Math.abs(n1));
        }
        System.out.println(res);

    }

    public static int nod(int x, int y) {
        if (y == 0) {
            return x;
        }
        System.out.println(x + " x");
        System.out.println(y + " y");
        return nod(y, x % y);
    }
}

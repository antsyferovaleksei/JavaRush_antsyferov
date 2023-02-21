package com.javarush.task.task18.task1822;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static class Product {
        int id;
        String name;
        String price;
        String quantity;

        public Product(int id, String name, String price, String quantity) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.quantity = quantity;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Product> products = new ArrayList<>();
       // String fileName = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test1.txt";
        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }

        for (Product prod : products) {
            if (Integer.parseInt(args[0]) == prod.id) {
                System.out.println(prod.id + " " + prod.name + " " + prod.price + " " + prod.quantity);
            }
        }
    }

    public static Product getProduct(String string) {
        String separator = " ";
        String id = string.substring(0, string.indexOf(separator)).trim();
        String quantity = string.substring(string.lastIndexOf(separator), string.length()).trim();
        String temp = string.substring(id.length(), string.length() - quantity.length()).trim();
        String price = temp.substring(temp.lastIndexOf(separator), temp.length()).trim();
        String name = temp.substring(0, temp.length() - price.length()).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}

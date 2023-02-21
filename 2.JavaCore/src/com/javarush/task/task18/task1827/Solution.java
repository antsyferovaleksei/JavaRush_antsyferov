//package com.javarush.task.task18.task1827;
//
//import java.io.*;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.List;
//
///*
//Прайсы
//*/
////"/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";
//public class Solution {
//    public static void main(String[] args) throws Exception {
//        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
//        String fileName = bufferedReader.readLine();
//        boolean newLine = true;
//        //String fileName = "/Users/aleksei/IdeaProjects/JavaRush/JavaRushTasks/2.JavaCore/src/com/javarush/task/task16/task1630/test3.txt";
//        switch (args[0]) {
//            case "": {
//                break;
//            }
//            case "-c": {
//                BufferedReader bufferedReader1 = new BufferedReader(new FileReader(fileName));
//                StringBuilder productName = new StringBuilder();
//                StringBuilder price = new StringBuilder();
//                StringBuilder quantity = new StringBuilder();
//                StringBuilder id = new StringBuilder();
//                String generalString = "";
//                for (int i = 1; i <= args.length - 3; i++) {
//                    productName.append(args[i]).append(" ");
//                }
//                int idI = getId(bufferedReader1);
//                if(idI == -1){
//                    newLine = false;
//                    id.append(1);
//                }else {
//                    id.append(idI + 1);
//                }
//                id = stringValidator(id, 8);
//                productName = stringValidator(productName, 30);
//                price.append(args[args.length - 2]);
//                price = stringValidator(price, 8);
//                quantity.append(args[args.length - 1]);
//                quantity = stringValidator(quantity, 4);
//                generalString = generalString.concat(id.toString()).concat(productName.toString()).
//                        concat(price.toString()).concat(quantity.toString());
//                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(fileName, true));
//                if(newLine) {
//                    bufferedWriter.newLine();
//                }
//                bufferedWriter.write(generalString);
//                bufferedWriter.flush();
//                bufferedReader1.close();
//                bufferedWriter.close();
//                break;
//            }
//        }
//        bufferedReader.close();
//    }
//
//    public static int getId(BufferedReader br) {
//        String sCurrentLine;
//        List<Integer> arr = new ArrayList<>();
//        int id;
//        while (true) {
//            try {
//                if (!((sCurrentLine = br.readLine()) != null)) break;
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//            arr.add(Integer.parseInt(sCurrentLine.substring(0, 8).trim()));
//        }
//        Collections.sort(arr);
//        try {
//            id = arr.get(arr.size() - 1);
//        } catch (Exception e) {
//            id = -1;
//        }
//        return id;
//    }
//
//    public static StringBuilder stringValidator(StringBuilder str, int length) {
//        int currentPrNameLength = str.length();
//        if (currentPrNameLength > length) {
//            str.substring(0, length - 1);
//        } else if (currentPrNameLength < length) {
//            for (int i = 0; i < length - currentPrNameLength; i++) {
//                str.append(" ");
//            }
//        }
//        return str;
//    }
//}
package com.javarush.task.task18.task1827;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Прайсы
*/

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

        @Override
        public String toString() {
            return String.format("%-8d%-30s%-8s%-4s", id, name, price, quantity);
        }
    }

    public static void main(String[] args) throws Exception {
        if (args.length == 0) {
            return;
        }

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName = reader.readLine();

        List<Product> products = new ArrayList<>();

        try (BufferedReader fileReader = new BufferedReader(new FileReader(fileName))) {
            while (fileReader.ready()) {
                Product product = getProduct(fileReader.readLine());
                products.add(product);
            }
        }

        switch (args[0]) {
            case "-c":
                int id = 0;
                for (Product product : products) {
                    if (product.id > id) id = product.id;
                }
                String name = "";
                for (int i = 1; i < args.length - 2; i++) {
                    name += args[i] + " ";
                }
                if (name.length() > 30) {
                    name = name.substring(0, 30);
                }
                String price = args[args.length - 2];
                if (price.length() > 8) {
                    price = price.substring(0, 8);
                }
                String quantity = args[args.length - 1];
                if (quantity.length() > 4) {
                    quantity = quantity.substring(0, 4);
                }
                Product product = new Product(++id, name.trim(), price, quantity);
                try (FileWriter fileWriter = new FileWriter(fileName, true)) {
                    fileWriter.write("\n");
                    fileWriter.write(product.toString());
                }
        }
    }

    public static Product getProduct(String string) {
        String id = string.substring(0, 8).trim();
        String name = string.substring(8, 38).trim();
        String price = string.substring(38, 46).trim();
        String quantity = string.substring(46, 50).trim();
        return new Product(Integer.parseInt(id), name, price, quantity);
    }
}

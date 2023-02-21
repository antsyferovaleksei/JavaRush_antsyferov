package com.javarush.task.task30.test;

import com.javarush.task.task12.task1231.Solution;

import java.lang.constant.Constable;
import java.math.BigInteger;
import java.util.*;
import java.util.stream.Collectors;

public class Test2 {
//    public static void main(String[] args) {
//        Test2 test = new Test2();
        //       int[][] array = {{1, 2, 3, 4, 5}, {6, 7, 8, 9, 10}, {11, 12, 13, 14, 15}, {16, 17, 18, 19, 20}, {21, 22, 23, 24, 25}};
//        Arrays.stream(snail(array)).forEach(System.out::println);
//        System.out.println(productFib(6));
//        System.out.println(test.cockroachSpeed(1.08));
//        System.out.println(feast("brown bear", "bear claw"));
//        System.out.println(test.find(new int[]{4, 5, 6, 7, 8, 9, 11}));
//        System.out.println(stray(new int[]{17, 17, 3, 17, 17, 17, 17}));
//        System.out.println(checkForFactor(6, 2));
//        System.out.println(orderWeight("2000 10003 1234000 44444444 9999 11 11 22 123"));
        //2000 103 123 4444 99
        //  System.out.println(test.solution(1596));
        //MMMXLV
        // System.out.println(rangeExtraction(new int[]{-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20, 34, 35}));
        //System.out.println(rangeExtraction(new int[]{-6,-3,-2,-1,0,1,3,4,5,7,8,9,10,11,14,15,17,18,19,20}));
        //-6,-3-1,3-5,7-11,14,15,17-20
        // System.out.println(zeros(30));
        // System.out.println(scramble("rkqodlw", "world"));
        // System.out.println(stripComments("apples, pears # and bananas\ngrapes\nbananas !apples", new String[]{"#", "!"}));
//        System.out.println(expressionsMatter(1, 1, 1));
//        powersOfTwo(4);
//        System.out.println(greedy(new int[]{5, 5, 5, 4, 5}));

//        System.out.println(greet("dutch"));
//        System.out.println(humanYearsCatYearsDogYears(10));
        //       singlePermutations("abcde").stream().forEach(System.out::println);
        // System.out.println(singlePermutations("abc").stream().count());
//        System.out.println(strCount("Hello", 'l'));
//        System.out.println(howMuchILoveYou(66));
//        System.out.println(camelCase("ab  c"));
//        System.out.println(dontGiveMeFive(4, 17));
//        System.out.println(isAnagram("foefet", "toffee"));
//        System.out.println(test.factorial(5));
//        BigInteger val = new BigInteger("5");
//        System.out.println(perimeter(val));
//        System.out.println(twoSort(new String[]{"bitcoin", "take", "over", "the", "world", "maybe", "who", "knows", "perhaps"}));
        //       System.out.println(sumStrings("99", "1"));
//        System.out.println(print(5));
//        System.out.println(sumIntervals(new int[][]{{1, 4}, {7, 10}, {3, 5}}));
//        System.out.println(minValue(new int[]{4, 7, 5, 7}));
//        System.out.println(meeting("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn"));
//        System.out.println(encryptThis("A wise old owl lived in an oak"));
//        //65 119esi 111dl 111lw 108dvei 105n 97n 111ka
//        multiplicationTable(2);
//        String[] s1 = new String[]{"hoqq", "bbllkw", "oox", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
//        String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};
//        System.out.println(mxdiflg(s1, s2)); // 13
//        System.out.println(parse("iiisdoso"));
//        spiralize(8);
//        flattenAndSort(new int[][]{{}, {1}});
//    }


    public static int toBinary(int n) {
        return Integer.parseInt(Integer.toBinaryString(n));
    }
    public static int[] flattenAndSort(int[][] array) {
        if (array.length == 0) {
            return new int[0];
        }
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                    list.add(array[i][j]);
            }
        }
        Collections.sort(list);
        int[] res = new int[list.size()];
        for (int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static int[][] spiralize(int size) {
        int[][] array = new int[size][size];
        if (array.length == 1 && array[0].length == 0) {
            return new int[0][0];
        }
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                array[i][j] = 0;
            }
        }
        int row = 0;
        int col = -1;
        int move = 1;
        int max = array.length;
        int k = 0;
        int length = (array.length % 2) == 0 ? array.length / 2 - 1 : array.length / 2;
        for (int i = 0; i <= length; i++) {
            int temp = i;
            for (int j = 0; j < max; j++) {
                col = col + move;
                if ((col - 1) >= 0 && array[row][col - 1] == 1 && move == -1) {
                    col = col + 1;
                    break;
                } else if ((col + 1) < size && array[row][col + 1] == 1 && move == 1) {
                    col = col - 1;
                    break;
                }
                array[row][col] = 1;
            }
            max--;
            for (int j = 0; j < max; j++) {
                row = row + move;
                if ((row - 1) >= 0 && array[row - 1][col] == 1 && move == -1) {
                    row = row + 1;
                    break;
                } else if ((row + 1) < size && array[row + 1][col] == 1 && move == 1) {
                    row = row - 1;
                    break;
                }
                array[row][col] = 1;
            }
            move = move * -1;
        }
        return array;
    }

    public static int[] parse(String data) {
        String[] arr = data.split("");
        int value = 0;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            switch (arr[i]) {
                case "i": {
                    value++;
                    break;
                }
                case "d": {
                    value--;
                    break;
                }
                case "s": {
                    value *= value;
                    break;
                }
                case "o": {
                    list.add(value);
                    break;
                }
            }
        }
        int[] res = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            res[i] = list.get(i);
        }
        return res;
    }

    public static String getDay(int n) {
        switch (n) {
            case 1:
                return "Sunday";
            case 2:
                return "Monday";
            case 3:
                return "Tuesday";
            case 4:
                return "Wednesday";
            case 5:
                return "Thursday";
            case 6:
                return "Friday";
            case 7:
                return "Saturday";
        }
        return "Wrong, please enter a number between 1 and 7";
    }

    public static String replace(final String s) {
        return s.replaceAll("i", "!");
    }

    public static int mxdiflg(String[] a1, String[] a2) {
        int a1L = 0, a2L = 0;
        for (int i = 0; i < a1.length; i++) {
            a1L += a1[i].length();
        }
        for (int i = 0; i < a2.length; i++) {
            a2L += a2[i].length();
        }
        return a1L - a2L;
    }

    //1 2 3
    //2 4 6
    //3 6 9
    public static int[][] multiplicationTable(int n) {
        if (n == 1) {
            return new int[][]{{1}};
        }
        int[][] res = new int[n][n];
        int k = 0;
        for (int i = 0; i < n; i++) {
            res[k][i] = k != 0 ? (i + 1) * (k + 1) : i + 1;
            if (i == n - 1) {
                i = 0;
                k++;
                if (k == n) {
                    break;
                }
                res[k][i] = k != 0 ? (i + 1) * (k + 1) : i + 1;
            }
        }
        return res;
    }

    public static String reverseLetter(final String str) {
        char[] arr = str.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isAlphabetic(arr[i])) {
                list.add(String.valueOf(arr[i]));
            }
        }
        Collections.reverse(list);
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }
        return stringBuilder.toString();
    }

    //104olle 119drlo
    public static String encryptThis(String text) {
        System.out.println("test: " + text);
        if (text.length() == 0) {
            return text;
        }
        String[] arr = text.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append((int) arr[i].charAt(0));
            if (arr[i].length() > 1) {
                stringBuilder.append(arr[i].charAt(arr[i].length() - 1));
                String[] letters = arr[i].split("");
                for (int j = 2; j < letters.length - 1; j++) {
                    stringBuilder.append(letters[j]);
                }
                if (arr[i].length() > 2) {
                    stringBuilder.append(arr[i].charAt(1));
                }
            }
            stringBuilder.append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static String bumps(final String road) {
        String[] arr = road.split("");
        return Arrays.stream(arr).filter(x -> x.equals("n")).count() >= 15 ? "Car Dead" : "Woohoo!";
    }

    public static String multiTable(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            stringBuilder.append(i + " * " + num + " = " + (i * num));
            if (i != 10) {
                stringBuilder.append(System.getProperty("line.separator"));
            }
        }
        return stringBuilder.toString();
    }

    //testing("Alexis:Wahl;John:Bell;Victoria:Schwarz;Abba:Dorny;Grace:Meta;Ann:Arno;Madison:STAN;Alex:Cornwell;Lewis:Kern;Megan:Stan;Alex:Korn",
    //"(ARNO, ANN)(BELL, JOHN)(CORNWELL, ALEX)(DORNY, ABBA)(KERN, LEWIS)(KORN, ALEX)(META, GRACE)(SCHWARZ, VICTORIA)(STAN, MADISON)(STAN, MEGAN)(WAHL, ALEXIS)");
    public static String meeting(String s) {
        String[] arrNames = s.split(";");
        String secondName = "", firstName = "";
        for (int i = 0; i < arrNames.length; i++) {
            secondName = arrNames[i].substring(arrNames[i].indexOf(":") + 1).toUpperCase();
            firstName = arrNames[i].substring(0, arrNames[i].indexOf(":")).toUpperCase();
            arrNames[i] = "(" + secondName + ", " + firstName + ")";
        }
        Arrays.sort(arrNames);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arrNames.length; i++) {
            stringBuilder.append(arrNames[i]);
        }
        return stringBuilder.toString();
    }

    public static boolean smallEnough(int[] a, int limit) {
        for (int i = 0; i < a.length; i++) {
            if (!(a[i] <= limit)) {
                return false;
            }
        }
        return true;
    }

    public static <T> Constable printArray(T[] array) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            stringBuilder.append(array[i]);
            if (i != array.length - 1) {
                stringBuilder.append(",");
            }
        }
        return stringBuilder.toString();
    }

    public static int[] take(int[] arr, int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = arr[i];
        }
        return res;
    }

    public static int minValue(int[] values) {
        List list = Arrays.stream(Arrays.stream(values).distinct().toArray()).boxed().toList();
        List<Integer> listM = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            listM.add((Integer) list.get(i));
        }
        Collections.sort(listM);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < listM.size(); i++) {
            stringBuilder.append(listM.get(i));
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static int binToDecimal(String inp) {
        return Integer.parseInt(inp, 2);
    }

    //.replaceFirst("^0+(?!$)", "");
    public static int noBoringZeros(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append(n).reverse();
        String res = stringBuilder.toString().replaceFirst("^0+(?!$)", "");
        StringBuilder stringBuilder2 = new StringBuilder();
        stringBuilder2.append(res).reverse();
        return Integer.valueOf(stringBuilder2.toString());
    }

    public String sayHello(String[] name, String city, String state) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < name.length; i++) {
            stringBuilder.append(name[i]);
            if (i != name.length - 1) {
                stringBuilder.append(" ");
            }
        }
        return "Hello, " + stringBuilder.toString() + "! Welcome to " + city + ", " + state + "!";
    }

    public static boolean alphanumeric(String s) {
        if (s.equals("") || s.contains(" ") || s.contains("_")) {
            return false;
        }
        return s.replaceAll("^[a-zA-Z0-9]+$", "").equals("");
    }

    public static int sumIntervals(int[][] intervals) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < intervals.length; i++) {
            for (int j = intervals[i][0]; j < intervals[i][1]; j++) {
                map.put(j, 1);
            }
        }
        return map.size();
    }

    public static String print(int n) {
        // TODO your code here
        if (n == 1) {
            return "*" + System.getProperty("line.separator");
        }
        if (n % 2 == 0 || n < 1) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        int spaceCount = 0;
        int markCount = 1;
        do {
            spaceCount = (n - markCount) / 2;
            stringBuilder.append(String.join("", Collections.nCopies(spaceCount, " ")) +
                    String.join("", Collections.nCopies(markCount, "*")));
            stringBuilder.append(System.getProperty("line.separator"));
            markCount += 2;
        } while (markCount != n + 2);
        markCount -= 4;
        do {
            spaceCount = (n - markCount) / 2;
            stringBuilder.append(String.join("", Collections.nCopies(spaceCount, " ")) +
                    String.join("", Collections.nCopies(markCount, "*")));
            markCount -= 2;
            stringBuilder.append(System.getProperty("line.separator"));
        } while (markCount > 0);
        return stringBuilder.toString();
    }

    public static int[] divisibleBy(int[] numbers, int divider) {
        List<Integer> resList = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % divider == 0) {
                resList.add(numbers[i]);
            }
        }
        int[] resArr = new int[resList.size()];
        for (int i = 0; i < resList.size(); i++) {
            resArr[i] = resList.get(i);
        }
        return resArr;
    }

    //2417660874832544787398502003314
//02417660874832544787398502003314
    public static String sumStrings(String a, String b) {
        if (a.length() == 0) {
            return b.replaceFirst("^0+(?!$)", "");
        } else if (b.length() == 0) {
            return a.replaceFirst("^0+(?!$)", "");
        }
        String[] aArr = a.split("");
        String[] bArr = b.split("");
        int res = 0, remain = 0, length = 0;
        int iA = aArr.length - 1;
        int iB = bArr.length - 1;
        if (aArr.length > bArr.length) {
            length = aArr.length;
        } else {
            length = bArr.length;
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = length - 1; i >= 0; i--) {
            if (iA >= 0 && iB >= 0) {
                int sumOfNumbers = Integer.parseInt(aArr[iA]) + Integer.parseInt(bArr[iB]) + remain;
                if (sumOfNumbers < 10) {
                    remain = 0;
                    res = sumOfNumbers;
                } else {
                    res = sumOfNumbers - 10;
                    remain = 1;
                }
            }
            if (iA < 0 && iB >= 0) {
                if (remain == 1) {
                    int sumOfNumbers = Integer.parseInt(bArr[i]) + remain;

                    if (sumOfNumbers < 10) {
                        remain = 0;
                        res = sumOfNumbers;
                    } else {
                        res = sumOfNumbers - 10;
                        remain = 1;
                    }
                } else {
                    res = Integer.parseInt(bArr[i]);
                }
            } else if (iA >= 0 && iB < 0) {
                if (remain == 1) {
                    res = Integer.parseInt(aArr[i]) + remain;
                    remain = 0;
                } else {
                    res = Integer.parseInt(aArr[i]);
                }
            }
            if (String.valueOf(res).equals("10") && i == 0) {
                stringBuilder.append("01");
            } else {
                stringBuilder.append(res);
            }
            iA--;
            iB--;
        }
        if (remain == 1) {
            stringBuilder.append(remain);
        }
        stringBuilder.reverse();
        return stringBuilder.toString().replaceFirst("^0+(?!$)", "");
    }

    public static String twoSort(String[] s) {
        List<String> sList = new ArrayList<>();
        for (int i = 0; i < s.length; i++) {
            sList.add(s[i]);
        }
        Collections.sort(sList);
        String[] arr = sList.get(0).split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]);
            if (i < arr.length - 1) {
                stringBuilder.append("***");
            }
        }
        return stringBuilder.toString().replaceFirst("^0+(?!$)", "");
    }

    public static int nthPower(int[] array, int n) {
        if (n >= array.length) {
            return -1;
        }
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= array[n];
        }
        return res;
    }

    //0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89,
    public static BigInteger perimeter(BigInteger n) {
        List<BigInteger> list = new ArrayList<>();
        BigInteger result = BigInteger.ONE;
        int nVal = n.intValue();
        for (BigInteger i = BigInteger.valueOf(0); i.compareTo(n) <= 0; i = i.add(BigInteger.ONE)) {
            if (i.compareTo(BigInteger.valueOf(2)) < 0) {
                list.add(result);
            } else {
                int tempI = i.intValue();
                result = list.get(tempI - 2).add(list.get(tempI - 1));
                list.add(result);
            }
        }

        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < list.size(); i++) {
            sum = sum.add(list.get(i));
        }
        return sum.multiply(BigInteger.valueOf(4));
    }

    public int factorial(int n) {
        if (n <= 2) {
            return n;
        }
        return n * factorial(n - 1);
    }

    public static boolean isAnagram(String test, String original) {
        if (test.length() != original.length()) {
            return false;
        }
        List<String> listTest = List.of(test.toLowerCase().split(""));
        List<String> listOriginal = List.of(original.toLowerCase().split(""));
        for (int i = 0; i < listTest.size(); i++) {
            for (int j = 0; j < listOriginal.size(); j++) {
                if (listTest.get(i).equals(listOriginal.get(j))) {
                    test = test.toLowerCase().replace(listTest.get(i), "");
                }
            }
        }
        return test.length() == 0;
    }

    public static int dontGiveMeFive(int start, int end) {
        List<String> list = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (!String.valueOf(i).contains("5")) {
                list.add(String.valueOf(i));
            }
        }
        return list.size();
    }

    public static String camelCase(String str) {
        if (str.length() == 0) {
            return "";
        }
        String[] arr = str.trim().split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (!arr[i].equals("")) {
                stringBuilder.append(String.valueOf(arr[i].charAt(0)).toUpperCase());
                stringBuilder.append(arr[i].substring(1));
            }
        }
        return stringBuilder.toString();
    }

    public static String howMuchILoveYou(int nb_petals) {
        List<String> list = new ArrayList<>();
        list.add("I love you");
        list.add("a little");
        list.add("a lot");
        list.add("passionately");
        list.add("madly");
        list.add("not at all");
        int val = nb_petals - (6 * (nb_petals / 6)) - 1;
        return val < 0 ? list.get(6 + val) : list.get(val);
    }

    public static int strCount(String str, char letter) {
        return (int) Arrays.stream(str.toLowerCase().split("")).filter(x -> x.equals(String.valueOf(letter))).count();
    }

    private static void printArr(String[] arr) {
        Arrays.stream(arr).forEach(System.out::print);
    }

    //abcd bacd bcad bcda cbda cdba
    public static List<String> singlePermutations(String s) {
        String[] arr = s.split("");
        List<String[]> list = new ArrayList<>();
        int pos = 0;
        int k = 0;
        int count = 1;
        int cycle = 0;
        for (int i = 1; i <= arr.length; i++) {
            count *= i;
        }
        System.out.println("count " + count);
        if (s.length() > 1) {
            for (int i = 0; i < count; i++) {
                cycle++;
                if (cycle == arr.length) {
                    k++;
                    if (k == arr.length - 1) {
                        k = 1;
                    }
                    String temp = arr[k];
                    arr[k] = arr[k - 1];
                    arr[k - 1] = temp;
                    cycle = 0;
                }

                String[] tempStr = new String[arr.length];
                for (int j = 0; j < arr.length; j++) {
                    if (pos < arr.length) {
                        tempStr[pos++] = arr[j];
                    } else {
                        pos = 0;
                        tempStr[pos++] = arr[j];
                    }
                }
                pos--;
                list.add(tempStr);
            }
        }
        List<String> resList = new ArrayList<>();
        StringBuilder resVal = null;
        if (s.length() == 1) {
            list.add(arr);
        }
        for (String[] val : list) {
            resVal = new StringBuilder();
            for (int i = 0; i < val.length; i++) {
                resVal.append(val[i]);
            }
            resList.add(resVal.toString());
        }
        return resList.stream().distinct().toList();
    }


    public static String correct(String string) {
        return string.replaceAll("5", "S").replaceAll("O", "0").replaceAll("1", "S");
    }

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
        int catY = 0, dogY = 0;
        for (int i = 1; i <= humanYears; i++) {
            if (i == 1) {
                catY += 15;
                dogY += 15;
            } else if (i == 2) {
                catY += 9;
                dogY += 9;
            } else {
                catY += 4;
                dogY += 5;
            }
        }
        return new int[]{humanYears, catY, dogY};
    }

    public static int oddCount(int n) {

        return n % 2 == 0 ? n / 2 : n / 2 - 1;
    }

    public static int arithmetic(int a, int b, String operator) {
        switch (operator) {
            case "add": {
                return a + b;
            }
            case "subtract": {
                return a - b;
            }
            case "multiply": {
                return a * b;
            }
            case "divide": {
                return a / b;
            }
        }
        return -1;
    }

    public static String greet(String language) {
        return Languges.valueOf(language).getGreet();
    }

    public static int greedy(int[] dice) {
        for (int i = 0; i < dice.length; i++) {
            System.out.println(dice[i] + ", ");
        }
        int totalScore = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < dice.length; i++) {
            if (map.get(dice[i]) == null) {
                map.put(dice[i], 1);
            } else {
                map.put(dice[i], map.get(dice[i]) + 1);
            }
        }
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getKey() == 1) {
                if (entry.getValue() >= 3) {
                    totalScore += 1000;
                }
                totalScore += entry.getValue() >= 3 ? (entry.getValue() - 3) * 100 : entry.getValue() * 100;
            } else if (entry.getKey() == 6) {
                if (entry.getValue() >= 3) {
                    totalScore += 600;
                }
            } else if (entry.getKey() == 5) {
                if (entry.getValue() >= 3) {
                    totalScore += 500;
                }
                totalScore += entry.getValue() >= 3 ? (entry.getValue() - 3) * 50 : entry.getValue() * 50;
            } else if (entry.getKey() == 4) {
                if (entry.getValue() >= 3) {
                    totalScore += 400;
                }
            } else if (entry.getKey() == 3) {
                if (entry.getValue() >= 3) {
                    totalScore += 300;
                }
            } else if (entry.getKey() == 2) {
                if (entry.getValue() >= 3) {
                    totalScore += 200;
                }
            }
        }
        return totalScore;
    }

    public static long[] powersOfTwo(int n) {
        System.out.println("n: " + n);
        long[] arr = new long[n + 1];
        long k = 1;
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                arr[i] = k;
            } else {
                arr[i] = k * 2;
                k = k * 2;
            }
        }
        return arr;
    }

    public static int expressionsMatter(int a, int b, int c) {
        List<Integer> res = new ArrayList<>();
        res.add(a * (b + c));
        res.add(a * b * c);
        res.add(a + b * c);
        res.add((a + b) * c);
        res.add(a + b + c);
        return res.stream().max(Integer::compareTo).get();
    }

    public static String toAlternativeString(String string) {
        char[] arr = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int a = 0; a < arr.length; a++) {
            if (Character.isUpperCase(arr[a])) {
                stringBuilder.append(String.valueOf(arr[a]).toLowerCase());
            } else {
                stringBuilder.append(String.valueOf(arr[a]).toUpperCase());
            }
        }
        return stringBuilder.toString();
    }

    //var result = solution("apples, pears # and bananas\ngrapes\nbananas !apples", ["#", "!"])
    //// result should == "apples, pears\ngrapes\nbananas"
    public static String stripComments(String text, String[] commentSymbols) {
        System.out.println("text: " + text);
        for (int i = 0; i < commentSymbols.length; i++) {
            System.out.println("commentSymbols " + i + ": " + commentSymbols[i]);
        }
        String[] arr = text.split(System.lineSeparator());
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        String temp = "";
        boolean isAdded = false;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < commentSymbols.length; j++) {
                if (arr[i].contains(commentSymbols[j])) {
                    temp = String.valueOf(stringBuilder.append(arr[i].substring(0, arr[i].indexOf(commentSymbols[j])))).replaceAll("\\s+$", "");
                    stringBuilder2.append(temp);
                    isAdded = true;
                } else if (!arr[i].contains(commentSymbols[j]) && !isAdded && j == commentSymbols.length - 1) {
                    stringBuilder2.append(arr[i].replaceAll("\\s+$", ""));
                    isAdded = true;
                }
            }
            isAdded = false;
            stringBuilder.delete(0, stringBuilder.length());
            if (i < arr.length - 1) {
                stringBuilder2.append(System.lineSeparator());
            }
        }
        return stringBuilder2.toString();
    }

    public static boolean scramble(String str1, String str2) {
        Map<String, Integer> str1Map = new TreeMap<>();
        Map<String, Integer> str2Map = new TreeMap<>();
        char[] str1Arr = str1.toCharArray();
        char[] str2Arr = str2.toCharArray();
        for (int i = 0; i < str1.length(); i++) {
            if (str1Map.get(String.valueOf(str1Arr[i])) == null) {
                str1Map.put(String.valueOf(str1Arr[i]), 1);
            } else {
                str1Map.put(String.valueOf(str1Arr[i]), str1Map.get(String.valueOf(str1Arr[i])) + 1);
            }
        }
        for (int i = 0; i < str2.length(); i++) {
            if (str2Map.get(String.valueOf(str2Arr[i])) == null) {
                str2Map.put(String.valueOf(str2Arr[i]), 1);
            } else {
                str2Map.put(String.valueOf(str2Arr[i]), str2Map.get(String.valueOf(str2Arr[i])) + 1);
            }
        }
        for (Map.Entry<String, Integer> entry : str2Map.entrySet()) {
            String currKey = entry.getKey();
            Integer currKeyCount = entry.getValue();
            Integer origCount = str1Map.get(currKey);
            if (origCount == null) {
                return false;
            }
            if (origCount < currKeyCount) {
                return false;
            }
        }
        return true;
    }

    public static int zeros(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        String input = String.valueOf(result);
        int numZeroes = input.length() - input.replaceAll("0+$", "").length();
        return numZeroes;
    }

    public static String rangeExtraction(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        int k = 0;
        String startRangeValue = "";
        String endRangeValue = "";
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            if (i != arr[0]) {
                if (i == arr[k]) {
                    endRangeValue = "-" + arr[k] + ",";
                } else if (!endRangeValue.equals("")) {
                    if (startRangeValue.equals(String.valueOf(arr[k - 2]))) {
                        stringBuilder.append(startRangeValue).append(",");
                        stringBuilder.append(endRangeValue.substring(1));
                    } else {
                        stringBuilder.append(startRangeValue + endRangeValue);
                    }
                    endRangeValue = "";
                    startRangeValue = String.valueOf(arr[k]);
                    i = arr[k];
                } else if (endRangeValue.equals("")) {
                    stringBuilder.append(startRangeValue).append(",");
                    startRangeValue = String.valueOf(arr[k]);
                    i = arr[k];
                }
            } else {
                startRangeValue = String.valueOf(arr[0]);
            }
            k++;
        }
        if (!endRangeValue.equals("")) {
            if (startRangeValue.equals(String.valueOf(arr[k - 2]))) {
                stringBuilder.append(startRangeValue).append(",");
                stringBuilder.append(endRangeValue.substring(1));
            } else {
                stringBuilder.append(startRangeValue + endRangeValue);
            }
        } else {
            stringBuilder.append(startRangeValue).append(",");
        }
        String res = stringBuilder.toString().substring(0, stringBuilder.length() - 1);
        return res;
    }

    //    (new int[] {-10, -9, -8, -6, -3, -2, -1, 0, 1, 3, 4, 5, 7, 8, 9, 10, 11, 14, 15, 17, 18, 19, 20})
//      returns "-10--8,-6,-3-1,3-5,7-11,14,15,17-20"
    public static String rangeExtraction_old(int[] arr) {
        StringBuilder stringBuilder = new StringBuilder();
        int k = 0;
        boolean startRange = false;
        String startRangeValue = "";
        String endRangeValue = "";
        for (int i = arr[0]; i <= arr[arr.length - 1]; i++) {
            if (i == arr[k] && !startRange) {
                startRangeValue = String.valueOf(arr[k]);
                startRange = true;
            } else if (i == arr[k] && startRange) {
                endRangeValue = "-" + arr[k] + ",";
            } else if (i != arr[k]) {
                stringBuilder.append(startRangeValue + endRangeValue);
                endRangeValue = "";
                startRangeValue = "";
                if (endRangeValue.equals("")) {
                    stringBuilder.append(arr[k]);
                    stringBuilder.append(",");
                }
                startRange = false;
                i = arr[k];
            }
            k++;
        }
        String res = stringBuilder.toString().substring(0, stringBuilder.length() - 2);
        return res;
    }


    public String solution(int n) {
        System.out.println(n);
        Map<String, Integer> map = new HashMap<>();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int val4 = 0, val5 = 0, val2 = 0, val3 = 0;
        StringBuilder stringBuilder = new StringBuilder();
        int val1 = n / map.get("M");
        for (int i = 0; i < val1; i++) {
            stringBuilder.append("M");
        }
        int temp = (n - val1 * 1000);
        if (temp >= 900) {
            stringBuilder.append("CM");
            val2 = 1;
            val3 = 4;
        } else {
            val2 = temp / map.get("D");
            for (int i = 0; i < val2; i++) {
                stringBuilder.append("D");
            }
            val3 = (n - val1 * 1000 - val2 * 500) / map.get("C");
            if (val3 == 4) {
                stringBuilder.append("CD");
            } else {
                for (int i = 0; i < val3; i++) {
                    stringBuilder.append("C");
                }
            }
        }
        temp = (n - val1 * 1000 - val2 * 500 - val3 * 100);
        if (temp >= 90) {
            stringBuilder.append("XC");
            val4 = 1;
            val5 = 4;
        } else {
            val4 = temp / map.get("L");
            for (int i = 0; i < val4; i++) {
                stringBuilder.append("L");
            }
            val5 = (n - val1 * 1000 - val2 * 500 - val3 * 100 - val4 * 50) / map.get("X");
            if (val5 == 4) {
                stringBuilder.append("XL");
            } else {
                for (int i = 0; i < val5; i++) {
                    stringBuilder.append("X");
                }
            }
        }
        temp = (n - val1 * 1000 - val2 * 500 - val3 * 100 - val4 * 50 - val5 * 10);
        if (temp == 9) {
            stringBuilder.append("IX");
        } else {
            int val6 = temp / map.get("V");
            for (int i = 0; i < val6; i++) {
                stringBuilder.append("V");
            }
            temp = (n - val1 * 1000 - val2 * 500 - val3 * 100 - val4 * 50 - val5 * 10 - val6 * 5);
            if (temp == 4) {
                stringBuilder.append("IV");
            } else {
                int val7 = temp / map.get("I");
                for (int i = 0; i < val7; i++) {
                    stringBuilder.append("I");
                }
            }
        }
        return stringBuilder.toString();
    }

    public static String orderWeight(String strng) {
        List<String> s = Arrays.asList(strng.split(" "));
        Collections.sort(s, new Comparator<String>() {
            public int compare(String o1, String o2) {
                int diff = getSum(o1) - getSum(o2);
                return diff == 0 ? o1.compareTo(o2) : diff < 0 ? -1 : 1;
            }
        });
        return String.join(" ", s);
    }

    private static int getSum(String s) {
        int sum = 0;
        for (String d : s.split("")) {
            sum += Integer.parseInt(d);
        }
        return sum;
    }

    public static long breakChocolate(long n, long m) {
        System.out.println(n + " " + m);
        if (m > n) {
            return 0;
        }
        return n * m - 1;
    }

    public static boolean checkForFactor(int base, int factor) {

        return Long.valueOf(base) % Long.valueOf(factor) == 0;
    }

    static int stray(int[] numbers) {
        int[] unique = Arrays.stream(numbers).distinct().toArray();
        int counter = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (unique[0] == numbers[i]) {
                counter++;
            }
            if (counter == 2) {
                break;
            }
        }
        return counter == 2 ? unique[1] : unique[0];
    }

    public static int TwiceAsOld(int dadYears, int sonYears) {
        //TODO: Add code here
        System.out.println(dadYears + " " + sonYears);

        return (dadYears - sonYears * 2) >= 0 ? dadYears - sonYears * 2 : sonYears - (dadYears - sonYears);
    }

    static Integer find(final int[] array) {
        int t = 0;
        for (int i = array[0]; i < array[array.length - 1]; i++) {
            if (i != array[t]) {
                return array[t];
            }
            t++;
        }
        return null;
    }

    public static String switchItUp(int number) {
        switch (number) {
            case 0: {
                return "Zero";
            }
            case 1: {
                return "One";
            }
            case 2: {
                return "Two";
            }
            case 3: {
                return "Three";
            }
            case 4: {
                return "Four";
            }
            case 5: {
                return "Five";
            }
            case 6: {
                return "Six";
            }
            case 7: {
                return "Seven";
            }
            case 8: {
                return " Eight";
            }
            case 9: {
                return "Nine";
            }
        }
        return "-1";
    }

    public static boolean feast(String beast, String dish) {
        List<String> listB = new ArrayList<>();
        List<String> dishB = new ArrayList<>();
        listB = Arrays.asList(beast.split(" "));
        dishB = Arrays.asList(dish.split(" "));
        for (int i = 0; i < listB.size(); i++) {
            for (int j = 0; j < dishB.size(); j++) {
                if (listB.get(i).equals(dishB.get(j))) {
                    return false;
                }
            }
        }
        return true;
    }

    public static int[] monkeyCount(final int n) {
        int[] arr = new int[n];
        for (int i = 1; i <= n; i++) {
            arr[i - 1] = i;
        }
        return arr;
    }

    public int cockroachSpeed(double x) {
        return (int) (x * (Double.valueOf(1000) / Double.valueOf(3600)) * 100);
    }

    public static long[] productFib(long prod) {
        long lowFib = 0;
        long hiFib = 1;
        long[] ans = new long[3];
        while (lowFib * hiFib <= prod) {
            if (lowFib * hiFib == prod) {
                ans[0] = lowFib;
                ans[1] = hiFib;
                ans[2] = 1;
                return ans;
            }
            hiFib += lowFib;
            lowFib = hiFib - lowFib;
        }
        ans[0] = lowFib;
        ans[1] = hiFib;
        ans[2] = 0;
        return ans;
    }

    public static String doubleChar(String s) {
        char[] arr = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(arr[i]).append(arr[i]);
        }
        return stringBuilder.toString();
    }

    public static int arrayPlusArray(int[] arr1, int[] arr2) {
        // arr1 + arr2 is not working...
        return Arrays.stream(arr1).sum() + Arrays.stream(arr2).sum();
    }

    public static int[] snail(int[][] array) {
        if (array.length == 1 && array[0].length == 0) {
            return new int[0];
        }

        int row = 0;
        int col = -1;
        int move = 1;
        int max = array.length;
        int k = 0;
        int[] res = new int[array.length * array.length];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < max; j++) {
                col = col + move;
                res[k++] = array[row][col];
            }
            max--;
            for (int j = 0; j < max; j++) {
                row = row + move;
                res[k++] = array[row][col];
            }
            move = move * -1;
        }
        return res;
    }
}

enum Languges {
    english("Welcome"), IP_ADDRESS_REQUIRED("Welcome"), IP_ADDRESS_NOT_FOUND("Welcome"), IP_ADDRESS_INVALID("Welcome"), czech("Vitejte"), danish("Velkomst"), dutch("Welkom"), estonian("Tere tulemast"), finnish("Tervetuloa"), flemish("Welgekomen"), french("Bienvenue"), german("Willkommen"), irish("Failte"), italian("Benvenuto"), latvian("Gaidits"), lithuanian("Laukiamas"), polish("Witamy"), spanish("Bienvenido"), swedish("Valkommen"), welsh("Croeso");
    private final String lang;

    private Languges(String lang) {
        this.lang = lang;
    }

    public String getGreet() {
        return lang;

    }
}

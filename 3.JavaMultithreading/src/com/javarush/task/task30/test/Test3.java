package com.javarush.task.task30.test;

import java.util.*;
import java.util.function.IntPredicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Test3 {
    public static void main(String[] args) {
        Test3 test = new Test3();
//        System.out.println(sumOfDifferences(new int[]{-3, -2, -1}));
//        System.out.println(chooseBestSum(163, 3, Arrays.asList(50, 55, 57, 58, 60)));
        // [50,55,57],[50,55,58],[50,55,60],
        // [50,57,58],[50,57,60],
        // [50,58,60],
        // [55,57,58],[55,57,60],
        // [55,58,60],
        // [57,58,60]
        // String[] moves = new String[]{"up", "left", "right", "left", "left"};
//        String[] moves = new String[]{"down", "down", "down", "down"};
//        String[] solution = new String[]{"Ryu", "Vega", "Ryu", "Vega", "Balrog"};
//        String[][] fighters = new String[][]{
//                new String[]{"Ryu", "E.Honda", "Blanka", "Guile", "Balrog", "Vega"},
//                new String[]{"Ken", "Chun Li", "Zangief", "Dhalsim", "Sagat", "M.Bison"},
//        };
//        System.out.println(streetFighterSelection(fighters, new int[]{0, 0}, moves));
//        pipeFix(new int[]{1, 5, 7, 9});
//        showSequence(0);
////        declareWinner(new Fighter("Jerry", 30, 3), new Fighter("Harald", 20, 5), "Jerry");
//        int[] array = new int[]{1, 2};
//        System.out.println(isSortedAndHow(array));
//        solve(new String[]{"abcdefghijklmnopqrstuvwxyzsssac","ABc","xyzD"});
//        System.out.println(test.adjacentElementsProduct(new int[]{9, 5, 10, 2, 24, -1, -48}));
//        System.out.println(solve("fizzbuzzy"));
//        rowWeights(new int[]{100, 51, 50, 100});
//        seven(2998582);
//        System.out.println(remove("Hi!!!", 1));
        System.out.println(test.xbonacci(new double[]{1, 2, 3}, 10));
//        System.out.println(sumMul(2, 9));
//        System.out.println(autoMorphic(25));
//        System.out.println(roundToNext5(-1));
//        //1537810
//        incrementer(new int[]{9, 8});
//        System.out.println(minSum(new int[]{5, 4, 2, 3}));
//        capitalize("abcdef");
//        maxTriSum(new int[]{3, 2, 6, 8, 2, 3});
//        System.out.println(longestPalindrome("aaa"));
//        cycle(24);
        stdout();
    }

    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().reduce((x, y) -> x + y).get();

    }
    
    public static void table(int n){
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 1; i <= 10; i++) {
            stringBuilder.append( n + " x " + i + " = " + n*i);
            if(i != 10){
                stringBuilder.append("\n");
            }
        }
        System.out.println(stringBuilder.toString());
    }

    public static void stdout() {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        Double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }

    public static void cycle(int n) {
        if (n % 2 != 0) {
            System.out.println("Weird");
        } else if (n >= 2 && n <= 5) {
            System.out.println("Not Weird");
        } else if (n >= 6 && n <= 20) {
            System.out.println("Weird");
        } else if (n > 20) {
            System.out.println("Not Weird");
        }
    }


    public static String sortMyString(String s) {
        String[] arr = s.split("");
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 == 0) {
                stringBuilder1.append(arr[i - 1]);
            } else {
                stringBuilder2.append(arr[i - 1]);
            }
        }
        return stringBuilder2.toString() + " " + stringBuilder1.toString();
    }

    public static String spacify(String str) {
        String[] arr = str.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            stringBuilder.append(arr[i]);
            if (i != str.length() - 1) {
                stringBuilder.append(" ");
            }
        }
        return stringBuilder.toString();
    }

    public static double fuelPrice(int litres, double pricePerLitre) {
        double discount = 0;
        if (litres < 2) discount = 0;
        else if (litres < 4) discount = 0.05;
        else if (litres < 6) discount = 0.10;
        else if (litres < 8) discount = 0.15;
        else if (litres < 10) discount = 0.20;
        else discount = 0.25;
        return +(litres * (pricePerLitre - discount));
    }

    public static int longestPalindrome(final String s) {
        if (s.length() == 0) {
            return 0;
        } else if (s.length() == 1) {
            return 1;
        }
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                String reversed = new StringBuilder(substring).reverse().toString();
                if (substring.equals(reversed)) {
                    int subStringLength = substring.length();
                    if (count < subStringLength) {
                        count = subStringLength;
                    }
                }
            }
        }
        return count;
    }

    public static int predictAge(int age1, int age2, int age3, int age4, int age5, int age6, int age7, int age8) {
        return Math.abs(age1 * age1 + age2 * age2 + age3 * age3 + age4 * age4 + age5 * age5 + age6 * age6 + age7 * age7 + age8 * age8) / 2;
    }

    public static int maxTriSum(int[] numbers) {
        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < numbers.length; i++) {
            set.add(numbers[i]);
        }
        return (int) set.toArray()[set.size() - 1] +
                (int) set.toArray()[set.size() - 2] + (int) set.toArray()[set.size() - 3];
    }

    public static String[] capitalize(String s) {
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        char[] arr = s.toCharArray();
        for (int i = 1; i <= arr.length; i++) {
            if (i % 2 == 0) {
                stringBuilder1.append(Character.toLowerCase(arr[i - 1]));
                stringBuilder2.append(Character.toUpperCase(arr[i - 1]));
            } else {
                stringBuilder1.append(Character.toUpperCase(arr[i - 1]));
                stringBuilder2.append(Character.toLowerCase(arr[i - 1]));
            }
        }
        return new String[]{stringBuilder1.toString(), stringBuilder2.toString()};
    }

    public static String explode(String digits) {
        String[] arr = digits.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < Integer.valueOf(arr[i]); j++) {
                stringBuilder.append(arr[i]);
            }
        }
        return stringBuilder.toString();
    }

    static String alternateCase(final String string) {
        char[] arr = string.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                stringBuilder.append(Character.toLowerCase(arr[i]));
            } else {
                stringBuilder.append(Character.toUpperCase(arr[i]));
            }
        }
        return stringBuilder.toString();
    }

    public static int minSum(int[] passed) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < passed.length; i++) {
            for (int j = i + 1; j < passed.length; j++) {
                list.add(passed[i] * passed[j]);
            }
        }
        Collections.sort(list);
        return list.get(0) + list.get(1);
    }

    public static int[] incrementer(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            int val = numbers[i] + i + 1;
            if (val >= 10) {
                val %= 10;
            }
            numbers[i] = val;
        }
        return numbers;
    }

    public static long factorial(int n) {
        long fact = 1;
        for (int i = 2; i <= n; i++) {
            fact = fact * i;
        }
        return fact;
    }

    public static int roundToNext5(int number) {
        int val = 0;
        if (number % 5 != 0) {
            if (number > 0) {
                val = 5;
            }
        }
        return 5 * Math.round(number / 5) + val;
    }

    public static String autoMorphic(int number) {
        int square = number * number;
        int length = String.valueOf(number).length();
        String val = String.valueOf(square).substring(String.valueOf(square).length() - length);
        int res = Integer.valueOf(val);
        return number == res ? "Automorphic" : "Not!!";
    }

    //2 + 4 + 6 + 8 = 20
    public static long sumMul(int n, int m) {
        if (n <= 0 || m <= 0) {
            throw new IllegalArgumentException();
        }
        int sum = 0;
        int val = 0;
        do {
            val += n;
            sum += val;
        } while (m > val);
        return sum - val;
    }

    public static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("\\D+", ""));
    }

    public static String position(char alphabet) {
        String alphabetS = "abcdefghijklmnopqrstuvwxyz";
        return "Position of alphabet: " + alphabetS.indexOf(alphabet);
    }


    public static int maxDiff(int[] lst) {
        int max = Arrays.stream(lst).max().getAsInt();
        int min = Arrays.stream(lst).min().getAsInt();
        return max - min;
    }

    public static int[] getSize(int w, int h, int d) {
        return new int[]{2 * (w * d + w * h + d * h), w * h * d};
    }

    public static int findAverage(int[] nums) {

        return (int) Arrays.stream(nums).average().getAsDouble();
    }

    //0,1,1,2,3,5,8,13,21,34}, variabonacci.xbonacci(new double []{0,1},10));
    public double[] xbonacci(double[] signature, int n) {
        double[] arr = new double[n];
        double sum = Arrays.stream(signature).sum();
        for (int i = 0; i < arr.length; i++) {
            if (i < signature.length) {
                arr[i] = signature[i];
            } else {
                if (i != signature.length) {
                    sum += arr[i - 1];
                }
                arr[i] = sum;
                sum -= arr[i - signature.length];
            }
        }
        return arr;
    }

    public static int largestPairSum(int[] numbers) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < numbers.length; i++) {
            list.add(numbers[i]);
        }
        Collections.sort(list);
        return list.get(list.size() - 1) + list.get(list.size() - 2);
    }

    public static boolean tidyNumber(int number) {
        String[] arr = String.valueOf(number).split("");
        for (int i = 1; i < arr.length; i++) {
            if (Integer.valueOf(arr[i - 1]) > Integer.valueOf(arr[i])) {
                return false;
            }
        }
        return true;
    }

    public static long sumCubes(long n) {
        long sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += (long) i * i * i;
        }
        return sum;
    }

    public static String remove(String s, int n) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] str = s.split("");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("!")) {
                if (n > 0) {
                } else {
                    stringBuilder.append(str[i]);
                }
                n--;
            } else {
                stringBuilder.append(str[i]);
            }
        }
        return stringBuilder.toString();
    }

    //2 - m = 1603 -> 160 - (2 x 3) -> 154 -> 15 - 8 = 7 and 7 is divisible by 7.
    public static long[] seven(long m) {
        long resVal = m;
        long counter = 0;
        String value = "";
        do {
            counter++;
            value = String.valueOf(resVal);
            long temp = Long.parseLong(value.substring(0, value.length() - 1));
            long temp2 = 2L * Long.parseLong(value.substring(value.length() - 1));
            resVal = Long.parseLong(value.substring(0, value.length() - 1))
                    - 2L * Long.parseLong(value.substring(value.length() - 1));
            if (resVal <= 0) {
                resVal = Long.parseLong(value);
                counter--;
                break;
            }
        } while (resVal % 7 == 0 && String.valueOf(resVal).length() > 1);
        return new long[]{resVal, counter};
    }

    public static int[] rowWeights(final int[] weights) {
        int first = 0;
        int second = 0;
        for (int i = 0; i < weights.length; i++) {
            if (i % 2 != 0) {
                second += weights[i];
            } else {
                first += weights[i];
            }
        }
        return new int[]{first, second};
    }

    public static int solve(final String s) {
        System.out.println(s);
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String consonant = "bcdfghjklmnpqrstvwxzy";
        List<Integer> list = new ArrayList<>();
        String[] arr = s.split("");
        int sum = 0;
        boolean isConsonant = false;
        for (int i = 0; i < arr.length; i++) {
            if (i + 1 < arr.length && consonant.contains(arr[i]) && !consonant.contains(arr[i + 1])) {
                sum += 1 + alphabet.indexOf(arr[i]);
                list.add(sum);
                sum = 0;
            } else if (i + 1 < arr.length && consonant.contains(arr[i]) && consonant.contains(arr[i + 1])) {
                sum += 1 + alphabet.indexOf(arr[i]);
            } else if (!(i + 1 < arr.length) && consonant.contains(arr[i])) {
                sum += 1 + alphabet.indexOf(arr[i]);
                list.add(sum);
                sum = 0;
            }
        }
        return list.stream().max(Integer::compareTo).get();
    }

    public static final String generateShape(int n) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stringBuilder.append("+");
            }
            if (i != n - 1) {
                stringBuilder.append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public static int cubeOdd(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int number = arr[i] * arr[i] * arr[i];
            if (number % 2 != 0) {
                sum += number;
            }
        }
        return sum;
    }

    public static int hexToDec(final String hexString) {

        return Integer.parseInt(hexString, 16);
    }

    public static String solve1(final String str) {
        char[] arr = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.isUpperCase(arr[i])) {
                counter++;
            }
        }
        return counter > arr.length - counter ? str.toUpperCase() : str.toLowerCase();
    }

    public static boolean xor(boolean a, boolean b) {
        //your code here:
        return a ^ b;
    }

    public String sortGiftCode(String code) {
        //String alphabet = "abcdefghijklmnopqrstuvwxyz";
        String[] arr = code.split("");
        List<String> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }
        return stringBuilder.toString();
        //return alphabet.substring(alphabet.indexOf(list.get(0)), alphabet.indexOf(list.get(0)) + list.size());
    }

    public int adjacentElementsProduct(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < array.length - 1; i++) {
            int value = array[i] * array[i + 1];
            list.add(value);
        }
        return list.stream().max(Integer::compare).get();
    }

    public static int[] solve(String[] arr) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int counter = 0;
        int[] res = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            char[] temp = arr[i].toLowerCase().toCharArray();
            for (int j = 0; j < temp.length; j++) {
                if (j < alphabet.length &&
                        Character.compare(temp[j], alphabet[j]) == 0) {
                    counter++;
                }
            }
            res[i] = counter;
            counter = 0;
        }
        return res;
    }

    public static String alphabetWar(String fight) {
        Map<String, Integer> left = new HashMap<>();
        left.put("w", 4);
        left.put("p", 3);
        left.put("b", 2);
        left.put("s", 1);
        Map<String, Integer> rigth = new HashMap<>();
        rigth.put("m", 4);
        rigth.put("q", 3);
        rigth.put("d", 2);
        rigth.put("z", 1);
        String[] arr = fight.split("");
        int rigthS = 0, leftS = 0;
        for (int i = 0; i < arr.length; i++) {
            if (rigth.keySet().contains(arr[i])) {
                rigthS += rigth.get(arr[i]);
            } else if (left.keySet().contains(arr[i])) {
                leftS += left.get(arr[i]);
            }
        }
        if (rigthS > leftS) {
            return "Right side wins!";
        } else if (leftS > rigthS) {
            return "Left side wins!";
        }
        return "Let's fight again!";
    }

    public static int findLongest(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++) {
            arr[i] = String.valueOf(numbers[i]);
        }
        String max = Arrays.stream(arr).collect(Collectors.maxBy(Comparator.comparing(String::length))).get().toString();
        return Integer.valueOf(max);
    }

    public static String isSortedAndHow(int[] array) {
        List<Integer> original = new ArrayList<>();
        for (int i = 0; i < array.length; i++) {
            original.add(array[i]);
        }
        List<Integer> sorted = new ArrayList<>(original);
        Collections.sort(sorted);
        List<Integer> reverted = new ArrayList<>(sorted);
        Collections.reverse(reverted);
        boolean isAscending = true;
        boolean isDescending = true;
        for (int i = 0; i < original.size(); i++) {
            if (original.get(i) != sorted.get(i)) {
                isAscending = false;
            } else if (original.get(i) != reverted.get(i)) {
                isDescending = false;
            }
        }
        if (isAscending) {
            return "yes, ascending";
        } else if (isDescending) {
            return "yes, descending";
        }
        return "no";
    }

    public static String switcheroo(String x) {
        return x.replaceAll("a", "d").replaceAll("b", "a").replaceAll("d", "b");
    }

    public static class Fighter {
        public String name;
        public int health, damagePerAttack;

        public Fighter(String name, int health, int damagePerAttack) {
            this.name = name;
            this.health = health;
            this.damagePerAttack = damagePerAttack;
        }
    }

    public static String declareWinner(Fighter fighter1, Fighter fighter2, String firstAttacker) {
        System.out.println(firstAttacker);
        System.out.println(fighter2.health);
        System.out.println(fighter1.health);
        int f1H = fighter1.health;
        int f2H = fighter2.health;
        do {
            if (firstAttacker.equals(fighter1.name)) {
                f2H -= fighter1.damagePerAttack;
                f1H -= fighter2.damagePerAttack;
                if (f2H <= 0) {
                    return fighter1.name;
                } else if (f1H <= 0) {
                    return fighter2.name;
                }
            } else {
                f1H -= fighter2.damagePerAttack;
                f2H -= fighter1.damagePerAttack;
                if (f1H <= 0) {
                    return fighter2.name;
                } else if (f2H <= 0) {
                    return fighter1.name;
                }
            }
        } while (true);
    }

    public static String showSequence(int value) {
        if (value == 0) {
            return "0";
        }
        int sum = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i <= value; i++) {
            stringBuilder.append(i);
            sum += i;
            if (i == value) {
                stringBuilder.append(" = ").append(sum);
            } else {
                stringBuilder.append("+");
            }
        }
        return stringBuilder.toString();
    }

    public static int[] pipeFix(int[] numbers) {
        System.out.println(numbers[0]);
        System.out.println(numbers[numbers.length - 1]);

        int[] arr = new int[numbers[numbers.length - 1] - numbers[0] + 1];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = numbers[0]++;
        }
        return arr;
    }

    public static String[] streetFighterSelection(String[][] fighters, int[] position, String[] moves) {
        String[] res = new String[moves.length];
        for (int i = 0; i < moves.length; i++) {
            switch (moves[i]) {
                case "up": {
                    position[0] = position[0] + 1 >= fighters.length - 1 ? 0 : position[0] + 1;
                    res[i] = fighters[position[0]][position[1]];
                    break;
                }
                case "down": {
                    position[0] = position[0] == 0 ? 1 : fighters.length - 1;
                    res[i] = fighters[position[0]][position[1]];
                    break;
                }
                case "left": {
                    position[1] = position[1] - 1 >= 0 ? position[1] - 1 : fighters[0].length - 1;
                    res[i] = fighters[position[0]][position[1]];
                    break;
                }
                case "right": {
                    position[1] = position[1] + 1 <= fighters[0].length - 1 ? position[1] + 1 : 0;
                    res[i] = fighters[position[0]][position[1]];
                    break;
                }
            }
        }
        return res;
    }

    public static Integer chooseBestSum(int t, int k, List<Integer> ls) {
        if (ls == null || ls.size() == 0 || ls.size() < k) {
            return null;
        }
        List<Integer[]> listOfArr = new ArrayList<>();
        int nextItem = 0;
        int iter = 0;
        for (int i = 0; i <= (ls.size() - k) * 2 + 1; i++) {
            Integer[] arr = new Integer[k];
            for (int j = 0; j < arr.length; j++) {
                if (j == 0) {
                    arr[j] = ls.get(j);
                } else if (j > 0 && j != arr.length - 1) {
                    arr[j] = ls.get(j + nextItem);
                } else if (j == arr.length - 1) {
                    arr[j] = ls.get(j + iter + nextItem);
                    if (j + iter + nextItem == ls.size() - 1) {
                        nextItem++;
                        iter = -1;
                    }
                }
            }
            iter++;
            listOfArr.add(arr);
        }
        return null;
    }

    public boolean isDigit(String s) {
        if (s == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(s);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }


//            for (int i = 0; i <= ls.size() - k; i++) {
//        Integer[] arr = new Integer[k];
//        for (int j = 0; j < arr.length; j++) {
//            if (j != arr.length - 1) {
//                arr[j] = ls.get(j);
//            } else {
//                arr[j] = ls.get(j + i);
//            }
//        }
//        listOfArr.add(arr);

    public static String greet(String name) {
        String res = name.substring(0, 1).toUpperCase() + name.substring(1, name.length()).toLowerCase();
        return "Hello " + res + "!";
    }

    public static int sumOfDifferences(int[] arr) {
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            list.add(arr[i]);
        }
        Collections.sort(list);
        Collections.reverse(list);
        int sum = 0;
        for (int i = 0; i < list.size() - 1; i++) {
            sum += (Integer) list.get(i) - (Integer) list.get(i + 1);
        }
        return sum;
    }
}

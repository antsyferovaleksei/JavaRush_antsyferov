package com.javarush.task.task30.test;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

import static java.lang.String.valueOf;

public class Test {
   // public static void main(String[] args) {
 //       Test test = new Test();
//        System.out.println(even_or_odd(6));
//        System.out.println(solution("string"));
//        System.out.println(smash(new String[]{"Bilal", "Djaghout"}));
//        Object[] haystack1 = {"3", "123124234", null, "needle", "world", "hay", 2, "3", true, false};
//        System.out.println(findNeedle(haystack1));
//        System.out.println(test.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
//        System.out.println(abbrevName("patrick feeney"));
//        // System.out.println(countingSheep(3));
//        System.out.println(points(new String[]{"1:0", "2:0", "3:0", "4:0", "2:1", "3:1", "4:1", "3:2", "4:2", "4:3"}));
//        filterList(filterList(List.of(1, "a", "b", 0, 15))).stream().forEach(System.out::println);
//        System.out.println(makeComplement("ATTGC"));//TAACG
//        System.out.println(check(new Object[]{66, 101}, 66));
//        System.out.println("===========");
//        System.out.println(getXO("Xxxxertr34"));
//        System.out.println(isTriangle(1, 2, 3));
//        System.out.println(test.liters(11.8));
//        System.out.println(ConvertBinaryArrayToInt(new ArrayList<>(Arrays.asList(0, 0, 0, 1))));
//        System.out.println(highAndLow("8 3 -5 42 -1 0 0 -9 4 7 4 -4"));
//        System.out.println(digitize(3245));
//        System.out.println(fakeBin("45385593107843568"));
//        System.out.println(fakeBin("45385593107843568").equals("01011110001100111"));
//        Arrays.stream(split("abc def")).forEach(System.out::println);
//        System.out.println(zeroFuel(100, 50, 1));
//        System.out.println(century(1600));
//        System.out.println("=====================================");
//        Arrays.stream(arrayDiff(new int[]{1, 2, 2, 2, 3}, new int[]{2})).forEach(System.out::println);
//        System.out.println(getCount("o a kak ushakov lil vo kashu kakao"));
//        System.out.println(find_average(new int[]{1, 2, 3}));
//        System.out.println(duplicateCount("aabBcde"));
//        int[] a = new int[]{0, -14, 191, 161, 19, 144, 195, 1};
//        int[] b = new int[]{1, 0, 196, 36481, 25921, 361, 20736, 38025};
//        System.out.println(comp(a, b));
//        System.out.println(test.squareDigits(9119));
//        System.out.println(order("is2 Thi1s T4est 3a"));
//        Arrays.stream(sortArray(new int[]{5, 8, 6, 3, 4})).forEach(System.out::println);
//        System.out.println(findShort("bitcoin take over the world"));
//        System.out.println(solution("abc", "bc"));
//        System.out.println(test.toJadenCase(null));
//        //System.out.println(isIsogram("moose"));
//        //System.out.println(test.solution(10));
//        System.out.println("." + reverseWords("  ") + ".");
//        System.out.println(sortDesc(56732429));
//        System.out.println(sum11(null));
//        System.out.println(camelCase("camelCasing"));
//        //System.out.println(encode("^^^"));
//        //(()(()()(()()(
//        //)()())()(()()(
//        System.out.println(summation(2));
//        Arrays.stream(wave(" two words")).forEach(System.out::println);
//        System.out.println(expandedForm(2));
//        System.out.println(reverse(5));
//        System.out.println(pigIt("O tempora o mores !"));
//        twoSum(new int[]{1, 2, 3}, 4);
//        System.out.println(high("aa b"));
//        System.out.println(test.check("aThe quick brown fox jumps over the lazy dog"));
//        partlist(new String[]{"cdIw", "tzIy", "xDu", "rThG"});
//        //1, 2, 3, 4, 5
//        //[1, 2345] [12, 345] [123,45] [1234,5]
//        System.out.println(mostFrequentItemCount(new int[]{1, 2, 1, 3}));
//        System.out.println(TwiceAsOld(80, 53));
//        System.out.println(countBy(2, 5));
//        towerBuilder(3);
//        System.out.println(test.numberOfDivisors(3));
//        powersOfTwo(2);
//        System.out.println(solveSuperMarketQueue(new int[]{5, 1, 2, 2, 1, 7, 2, 5}, 6));
//        //System.out.println(solveSuperMarketQueue(new int[]{2, 1, 3}, 2));
//        System.out.println(findDifference(new int[]{2, 1, 3}, new int[]{2, 1, 3, 4}));
//        System.out.println(shortcut("D2oBZJQFHHobByQAPHAxAa"));
//        //D2BZJQFHHbByQAPHAxA
//        between(1, 4);
//        System.out.println(findIt(new int[]{5, 4, 3, 2, 1, 5, 4, 3, 2, 10, 10}));
//        System.out.println(digital_root(942));
//        System.out.println(getMiddle("qwert"));
//        System.out.println(isIsogram("moOse"));
//        System.out.println(countBits(1234));
//        System.out.println(accum("abcd"));
//        // System.out.println(encode("Prespecialized"));
//        //)()())()(()()(
//        //)()())()(()()(
//        System.out.println(encode("d^a"));
//        Boolean[] array1 = {true, null, true, false,
//                true, true, true, true,
//                true, false, true, false,
//                true, false, false, true,
//                true, true, true, true,
//                false, false, true, true};
//        System.out.println(test.countSheeps(array1));
//        System.out.println(test.GetSum(0, 1));
//        System.out.println(isValid(new char[]{'n', 's', 'n', 's', 'n', 's', 'n', 's', 'n', 's'}));
//        System.out.println(persistence(39));
//        System.out.println(toCamelCase("the_Stealth_Warrior"));
//        System.out.println(nbYear(1500, 5, 100, 5000));
//        System.out.println(longest("aretheyhere", "yestheyarehere"));//aehrsty
//        System.out.println(validatePin("0000"));
//        System.out.println(rowSumOddNumbers(2));
//        System.out.println(findNextSquare(4));
//        test.tribonacci(new double[]{1, 1, 1}, 10);
//        System.out.println(isNarcissistic(1634));
//        System.out.println(printerError("aaaaaaaaaaaaaaaabbbbbbbbbbbbbbbbbbmmmmmmmmmmmmmmmmmmmxyz"));
//        // System.out.println(digPow(695, 2));
//        System.out.println(digPow(3456789, 1));
//        System.out.println(solution1("abcdef"));
//        System.out.println(makeReadable(359999));
//        System.out.println(findUniq(new double[]{0.0, 1.0, 0.0}));
//        System.out.println(isLove(2, 2));
//        System.out.println(findEvenIndex(new int[]{1, 2, 3, -4}));
//        //System.out.println(findEvenIndex(new int []{1,100,50,-51,1,1}));
//        System.out.println(validParentheses("(())"));
//        System.out.println(rgb(-20, 275, 125));
//        System.out.println(decode("      ...---... -.-.--   - .... .   --.- ..- .. -.-. -.-   -... .-. --- .-- -.   ..-. --- -..-   .--- ..- -- .--. ...   --- ...- . .-.   - .... .   .-.. .- --.. -.--   -.. --- --. .-.-.-  "));
//        //                                         "SOS!               THE       QUICK                   BROWN                FOX             JUMPS OVER THE LAZY DOG."
//        System.out.println(isPrime(3));
//        System.out.println(grow(new int[]{1, 2, 3}));
//        System.out.println(test.dnaToRna("GCAT"));
//        System.out.println(findMissingLetter(new char[]{'O', 'Q', 'R', 'S'}));
//        Arrays.stream(deleteNth(new int[]{1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3)).forEach(System.out::print);
        //      System.out.println(findNb(1071225));
//        System.out.println(rentalCarCost(3));
//        System.out.println(bouncingBall(10, 0.6, 10));
//        Arrays.stream(dirReduc(new String[]{"EAST", "EAST", "WEST", "NORTH"})).forEach(System.out::println);
//        System.out.println(reverseWords1("Hellow world!"));
//        Arrays.stream(inArray(new String[]{"cod", "code", "wars", "ewar", "ar"}, new String[]{"lively", "alive", "harp", "sharp", "armstrong", "codewars"})).forEach(System.out::println);
//        System.out.println(getGrade(0, 50, 30));
//        System.out.println(longestConsec(new String[]{"zone", "abigail", "theta", "form", "libe", "zas", "theta", "abigail"}, 2));
//        //"abigailtheta"
//        System.out.println(sequence(new int[]{-2, 1, -3, 4, -1, 2, 1, -5, 4}));
        //      System.out.println(formatDuration(205851834));
//        System.out.println(incrementString("foobar099"));
   //}


    public static String incrementString(String str) {
        System.out.println("str: " + str);
        if (str.length() == 0) {
            return "1";
        }
        char[] arr = str.toCharArray();
        boolean digit = true;
        StringBuilder stringBuilder = new StringBuilder();
        if (!Character.isDigit(arr[arr.length - 1])) {
            return str + 1;
        }
        for (int i = arr.length - 1; i >= 0; i--) {
            if (Character.isDigit(arr[i]) && digit) {
                stringBuilder.append(arr[i]);
            } else {
                digit = false;
            }
        }
        char[] valArr = stringBuilder.reverse().toString().toCharArray();
        boolean isAdded = false;
        for (int i = valArr.length - 1; i >= 0; i--) {
            if (Integer.parseInt(String.valueOf(valArr[i])) + 1 == 10) {
                valArr[i] = '0';
            } else {
                isAdded = true;
                valArr[i] = String.valueOf(Integer.valueOf(String.valueOf(valArr[i])) + 1).charAt(0);
                break;
            }
        }
        if (isAdded) {
            if (str.length() > valArr.length) {
                return str.substring(0, str.length() - valArr.length) + new String(valArr);
            } else {
                return new String(valArr);
            }
        } else {
            if (str.length() > valArr.length) {
                return str.substring(0, str.length() - valArr.length) + "1" + new String(valArr);
            } else {
                return "1" + new String(valArr);
            }
        }
    }

    public static boolean setAlarm(boolean employed, boolean vacation) {
        // Your code here...
        return employed && !vacation;
    }

    public static String formatDuration(int seconds) {
        if (seconds == 0) {
            return "now";
        }
        int years = seconds / 31536000;
        int days = (seconds - years * 365 * 86400) / 86400;
        int hours = (seconds - years * 365 * 86400 - days * 86400) / 3600;
        int minutes = (seconds - years * 365 * 86400 - days * 86400 - hours * 3600) / 60;
        int second = seconds - years * 365 * 86400 - days * 86400 - hours * 3600 - minutes * 60;
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("year", years);
        map.put("day", days);
        map.put("hour", hours);
        map.put("minute", minutes);
        map.put("second", second);
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder = formatStr(map, stringBuilder);
        String result = stringBuilder.toString().trim();//remove spaces
        result = result.substring(0, result.length() - 1);//remove last comma
        result = replaceLast(result, ",", " and");// replace comma to and
        return result;
    }

    private static String replaceLast(String text, String regex, String replacement) {
        return text.replaceFirst("(?s)(.*)" + regex, "$1" + replacement);
    }

    private static StringBuilder formatStr(Map<String, Integer> map, StringBuilder stringBuilder) {
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                stringBuilder.append("1").append(" ").append(entry.getKey()).append(", ");
            } else if (entry.getValue() > 1) {
                stringBuilder.append(entry.getValue()).append(" ").append(entry.getKey()).append("s").append(", ");
            }
        }
        return stringBuilder;
    }

    public static int sequence(int[] arr) {
        if (arr.length == 0) {
            return 0;
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) {
                counter++;
            }
        }
        if (counter == arr.length) {
            return 0;
        }
        List<Integer> list = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = arr[i];
            list.add(sum);
            for (int j = i + 1; j < arr.length; j++) {
                sum += arr[j];
                list.add(sum);
            }
        }
        return list.stream().max(Integer::compare).get();
    }

    public static String longestConsec(String[] strarr, int k) {
        if (k > strarr.length || k < 0) {
            return "";
        }
        List<String> list = new ArrayList<>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < strarr.length; i++) {
            int tempI = i;
            for (int j = 0; j < k; j++) {
                if (tempI < strarr.length) {
                    stringBuilder.append(strarr[tempI]);
                    tempI++;
                }
            }
            list.add(stringBuilder.toString());
            stringBuilder.delete(0, stringBuilder.length());
        }
        String result = list.get(0);
        for (int i = 0; i < list.size() - 1; i++) {
            if (result.length() < list.get(i + 1).length()) {
                result = list.get(i + 1);
            }
        }
        return result;
    }

    public static char getGrade(int s1, int s2, int s3) {
        int score = (int) Math.round(Arrays.stream(new int[]{s1, s2, s3}).average().getAsDouble());
        if (90 <= score && score <= 100) {
            return 'A';
        } else if (80 <= score && score < 90) {
            return 'B';
        } else if (70 <= score && score < 80) {
            return 'C';
        } else if (60 <= score && score < 70) {
            return 'D';
        } else if (50 <= score && score < 60) {
            return 'E';
        } else if (40 <= score && score < 50) {
            return 'F';
        } else if (30 <= score && score < 40) {
            return 'G';
        } else if (20 <= score && score < 30) {
            return 'H';
        } else if (10 <= score && score < 20) {
            return 'I';
        } else if (0 <= score && score < 10) {
            return 'J';
        }
        return 'z';
    }

    public static int[] minMax(int[] arr) {
        int[] res = new int[2];
        res[0] = Arrays.stream(arr).min().getAsInt();
        res[1] = Arrays.stream(arr).max().getAsInt();
        return res;
    }

    public static int getAverage(int[] marks) {
        return (int) Arrays.stream(marks).average().getAsDouble();
    }

    public static String[] inArray(String[] array1, String[] array2) {
        System.out.print("arr1: ");
        for (int i = 0; i < array1.length; i++) {
            System.out.print('"' + array1[i] + '"' + ",");
        }
        System.out.println("arr2: ");
        for (int i = 0; i < array2.length; i++) {
            System.out.print('"' + array2[i] + '"' + ",");
        }
        List<String> list = new ArrayList<>();
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array2.length; j++) {
                if (array1[i] != null && array2[j] != null && array2[j].contains(array1[i])) {
                    list.add(array1[i]);
                    array1[i] = null;
                    //array2[j] = null;
                }
            }
        }
        Collections.sort(list);
        list.toArray(new String[list.size()]);
        return list.toArray(new String[list.size()]);
    }

    public static String rps(String p1, String p2) {
        if (p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won!";
        } else if (p1.equals("rock") && p2.equals("scissors")) {
            return "Player 1 won!";
        } else if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won!";
        } else if (p1.equals("paper") && p2.equals("scissors")) {
            return "Player 2 won!";
        } else if (p1.equals("scissors") && p2.equals("rock")) {
            return "Player 2 won!";
        } else if (p1.equals("rock") && p2.equals("paper")) {
            return "Player 2 won!";
        } else {
            return "Draw!";
        }
    }

    static String greet(String name, String owner) {
        if (owner.equals(name)) {
            return "Hello boss";
        }
        return "Hello guest";
    }

    public static String reverseWords1(String str) {
        List<String> list = Arrays.stream(str.split(" ")).toList();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = list.size() - 1; i >= 0; i--) {
            stringBuilder.append(list.get(i)).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static String[] dirReduc(String[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null && arr[i].equals("EAST")) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != null && arr[j].equals("WEST")) {
                        arr[i] = null;
                        arr[j] = null;
                        break;
                    }
                }
            }
            if (arr[i] != null && arr[i].equals("WEST")) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != null && arr[j].equals("EAST")) {
                        arr[i] = null;
                        arr[j] = null;
                        break;
                    }
                }
            }
            if (arr[i] != null && arr[i].equals("NORTH")) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != null && arr[j].equals("SOUTH")) {
                        arr[i] = null;
                        arr[j] = null;
                        break;
                    }
                }
            }
            if (arr[i] != null && arr[i].equals("SOUTH")) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[j] != null && arr[j].equals("NORTH")) {
                        arr[i] = null;
                        arr[j] = null;
                        break;
                    }
                }
            }

        }
        List<String> list = new ArrayList<>();
        for (String s : arr) {
            if (s != null && s.length() > 0) {
                list.add(s);
            }
        }
        arr = list.toArray(new String[list.size()]);
        return arr;
    }

    public static String[] dirReduc1(String[] arr) {
        System.out.println("arr:");
        for (int i = 0; i < arr.length; i++) {
            //System.out.print('"' + arr[i] + '"' + ",");
        }

        int centralPoint = arr.length;
        int[] temp = new int[2];
        temp[0] = centralPoint;
        temp[1] = centralPoint;
        for (int i = 0; i < arr.length; i++) {
            if (valueOf(arr[i]).equals("NORTH")) {
                temp[0] -= 1;
            } else if (valueOf(arr[i]).equals("SOUTH")) {
                temp[0] += 1;
            } else if (valueOf(arr[i]).equals("EAST")) {
                temp[1] -= 1;
            } else if (valueOf(arr[i]).equals("WEST")) {
                temp[1] += 1;
            }
        }
        List<String> resultList = new ArrayList<>();
        if (temp[0] > centralPoint) {
            for (int i = 0; i < temp[0] - centralPoint; i++) {
                resultList.add("SOUTH");
            }
        }
        if (temp[0] < centralPoint) {
            for (int i = 0; i < centralPoint - temp[0]; i++) {
                resultList.add("NORTH");
            }
        }
        if (temp[1] > centralPoint) {
            for (int i = 0; i < temp[1] - centralPoint; i++) {
                resultList.add("WEST");
            }
        }
        if (temp[1] < centralPoint) {
            for (int i = 0; i < centralPoint - temp[1]; i++) {
                resultList.add("EAST");
            }
        }
        Collections.sort(resultList);
        String[] resultArr = new String[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            resultArr[i] = resultList.get(i);
        }
        return resultArr;
    }

    public static boolean isValid(char[] walk) {
        System.out.println("arr:");
        for (int i = 0; i < walk.length; i++) {
            System.out.println("'" + walk[i] + "',");
        }
        int[] temp = new int[2];
        temp[0] = 10;
        temp[1] = 10;
        int[][] arr = new int[22][22];
        int val = 1;
        if (walk.length != 10) {
            return false;
        }
        for (int i = 0; i < walk.length; i++) {
            if (i == 9) {
                val = 2;
            }
            if (valueOf(walk[i]).equals("n")) {
                temp[0] -= 1;
                arr[temp[0]][temp[1]] = val;
            } else if (valueOf(walk[i]).equals("s")) {
                temp[0] += 1;
                arr[temp[0]][temp[1]] = val;
            } else if (valueOf(walk[i]).equals("e")) {
                System.out.println("i " + i);
                temp[1] -= 1;
                arr[temp[0]][temp[1]] = val;
            } else if (valueOf(walk[i]).equals("w")) {
                temp[1] += 1;
                arr[temp[0]][temp[1]] = val;
            }
        }
        return arr[9][9] == val;
    }

    //- h = 3, bounce = 0.66, window = 1.5, result is 3
    public static int bouncingBall(double h, double bounce, double window) {
//        if (window == h || h < 0 || bounce < 0 || bounce > 1 || window > h) {
//            return -1;
//        }
//        int times = 0;
//        do {
//            times += 2;
//            h *= bounce;
//        } while (window < h);
//        return times - 1;
        int result = 0;
        do {
            if (h <= 0 || bounce >= 1 || bounce <= 0 || window >= h)
                return -1;
            if (h > window)
                result++;
            h = h * bounce;
            if (h > window)
                result++;

        } while (h > window);

        return result;
    }

    public static int rentalCarCost(int d) {
        if (d == 1) {
            return 40;
        } else if (d >= 7) {
            return d * 40 - 50;
        } else if (d >= 3 && d < 7) {
            return d * 40 - 20;
        }
        return -1;
    }

    public static long findNb(long m) {
        long actualSum = 0;
        int i = 1;
        do {
            actualSum += (long) Math.pow(i, 3);
            if (actualSum == m) {
                return i;
            } else {
                i++;
            }
        } while (actualSum < m);
        return -1;
    }

    //new int[] { 1, 1, 3, 3, 7, 2, 2, 2 }
    //EnoughIsEnough.deleteNth( new int[] { 1, 1, 3, 3, 7, 2, 2, 2, 2 }, 3 )
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> mapping = new HashMap<>();
        for (int i = 0; i < elements.length; i++) {
            if (mapping.get(elements[i]) == null) {
                mapping.put(elements[i], 1);
            } else {
                mapping.put(elements[i], mapping.get(elements[i]) + 1);
            }
        }
        List<Integer> listForRemoving = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : mapping.entrySet()) {
            if (entry.getValue() > maxOccurrences) {
                int temp = entry.getValue() - maxOccurrences;
                for (int i = 0; i < entry.getValue() - maxOccurrences; i++) {
                    listForRemoving.add(entry.getKey());
                }
            }
        }
        List<Integer> resultList = new ArrayList<>();
        boolean removed = false;
        for (int i = elements.length - 1; i >= 0; i--) {
            for (int j = 0; j < listForRemoving.size(); j++) {
                if (elements[i] == listForRemoving.get(j)) {
                    listForRemoving.remove(j);
                    removed = true;
                    break;
                }
            }
            if (!removed) {
                resultList.add(elements[i]);
            }
            removed = false;
        }
        Collections.reverse(resultList);
        int[] arr = new int[resultList.size()];
        for (int i = 0; i < resultList.size(); i++) {
            arr[i] = resultList.get(i);
        }
        return arr;
    }

    public static char findMissingLetter(char[] array) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int startIndex = 0;
        int missingIndex = 0;
        for (int i = 0; i < alphabet.length; i++) {
            if (String.valueOf(alphabet[i]).equals(String.valueOf(array[0]).toLowerCase())) {
                startIndex = i;
                break;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (!String.valueOf(alphabet[startIndex++]).equals(String.valueOf(array[i]).toLowerCase())) {
                missingIndex = startIndex - 1;
                break;
            }
        }
        return Character.isUpperCase(array[0]) ?
                String.valueOf(alphabet[missingIndex]).toUpperCase().toCharArray()[0] :
                alphabet[missingIndex];
    }

    public String dnaToRna(String dna) {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if (Character.compare(dna.charAt(i), 'U') == 0) {
                str.append("T");
            } else if (Character.compare(dna.charAt(i), 'T') == 0) {
                str.append("U");
            } else {
                str.append(dna.charAt(i));
            }
        }
        return str.toString();
    }

    public static int grow(int[] x) {
        return Arrays.stream(x).reduce(1, (acc, k) -> acc * k);
    }

    public static boolean isDivisible(long n, long x, long y) {
        if (n % x == 0 && n % y == 0) {
            return true;
        }
        return false;
    }

    public static boolean isPrime(int num) {
//        if (num <= 1) {
//            return false;
//        }
//        for (int i = 2; i < num/3; i++) {
//            if (num % i == 0) {
//                return false;
//            }
//        }
//
////        int i = 2;
////        while (i <= num / 2) {
////            if (num % i == 0) {
////                return false;
////            }
////            ++i;
////        }
//        return true;
        return num > 1
                && IntStream.rangeClosed(2, (int) Math.sqrt(num))
                .noneMatch(n -> (num % n == 0));
    }


    //.--- ..- -- .--. ...
    //J    U   M  P    S
    public static String decode(String morseCode) {
        String[] english = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
                "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x",
                "y", "z", "1", "2", "3", "4", "5", "6", "7", "8", "9", "0",
                ",", ".", "?", "sos", "!"};

        String[] morse = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
                ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.",
                "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
                "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
                "-----", "--..--", ".-.-.-", "..--..", "...---...", "-.-.--"};

        Map<String, String> mapping = new HashMap<String, String>();
        for (int i = 0; i < english.length; ++i) {
            mapping.put(english[i], morse[i]);
        }
        String[] arr = morseCode.split(" ");
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < arr.length; i++) {
            for (Map.Entry<String, String> entry : mapping.entrySet()) {
                if (arr[i].equals("") && arr[i + 1].equals("")) {
                    stringBuilder.append(" ");
                    break;
                }
                if (arr[i].equals(entry.getValue())) {
                    stringBuilder.append(entry.getKey());
                }
            }
        }
        return stringBuilder.toString().toUpperCase().trim();
    }

    public static String rgb(int r, int g, int b) {
        if (r < 0) {
            r = 0;
        }
        if (g < 0) {
            g = 0;
        }
        if (b < 0) {
            b = 0;
        }
        if (r > 255) {
            r = 255;
        }
        if (g > 255) {
            g = 255;
        }
        if (b > 255) {
            b = 255;
        }
        return (String.format("%02x", r & 0xFF) + String.format("%02x", g & 0xFF) + String.format("%02x", b & 0xFF)).toUpperCase();
    }

    public static boolean validParentheses(String parens) {
        char[] arr = parens.toCharArray();
        if (!(parens.length() <= 100 || !(parens.length() >= 0))) {
            return false;
        }
        int openCount = 0, closeCount = 0;
        for (int i = 0; i < parens.length(); i++) {
            if (String.valueOf(arr[i]).equals("(")) {
                openCount++;
            } else if (String.valueOf(arr[i]).equals(")")) {
                closeCount++;
            }
            if (closeCount > openCount) {
                return false;
            }
        }
        return closeCount == openCount;
    }

    //{1,2,3,4,3,2,1}
    public static int findEvenIndex_(int[] arr) {
        int leftSum = 0, rightSum = 0, counter = 1;
        int positionL = 0, positionR = arr.length - 1;
        do {
            leftSum = sumCalc(arr, 0, positionL);
            if (positionL != 0) {
                counter = 2;
            }
            rightSum = sumCalc(arr, positionL + counter, positionR);
            positionL++;
            if (positionL == positionR) {
                return -1;
            }
        } while (leftSum != rightSum);
        return counter == 2 ? positionL : positionL - 1;
    }

    private static int sumCalc(int[] arr, int posStart, int posEnd) {
        int sum = 0;
        for (int i = posStart; i < posEnd; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findEvenIndex(int[] arr) {
        int leftSum = 0, rightSum = 0;
        int positionL = 0, positionR = arr.length;
        do {
            leftSum = sumCalc(arr, 0, positionL);
            rightSum = sumCalc(arr, positionL + 1, positionR);
            if (positionL == positionR) {
                return -1;
            }
            positionL++;
        } while (leftSum != rightSum);
        return positionL - 1;
    }

    public static int findEvenIndex_original(int[] arr) {
        int leftSum = 0, rightSum = 0;
        int positionL = 1, positionR = arr.length;
        do {
            leftSum = sumCalc(arr, 0, positionL++);
            rightSum = sumCalc(arr, positionL, positionR);
            if (positionL == positionR) {
                return -1;
            }
        } while (leftSum != rightSum);
        return positionL - 1;
    }

    public static int[] invert(int[] array) {
        return Arrays.stream(array).map(x -> -x).toArray();
    }

    public static boolean isLove(final int flower1, final int flower2) {
        if (flower1 % 2 == 0 && flower2 % 2 != 0) {
            return true;
        } else if (flower1 % 2 != 0 && flower2 % 2 == 0) {
            return true;
        }
        return false;
    }

    public static double findUniq(double arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + ", ");
        }
        List<Double> withDupes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            withDupes.add(arr[i]);
        }
        Map<Double, Long> elementCountMap = withDupes.stream()
                .collect(Collectors.toMap(Function.identity(), v -> 1L, Long::sum));
        for (Map.Entry<Double, Long> entry : elementCountMap.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return -1;

    }

    public static String makeReadable(int seconds) {
        int hours = seconds / 3600;
        int minutes = (seconds - hours * 3600) / 60;
        int second = seconds - hours * 3600 - minutes * 60;
        String hoursS = String.valueOf(hours).length() == 1 ? "0" + String.valueOf(hours) :
                String.valueOf(hours);
        String minutesS = String.valueOf(minutes).length() == 1 ? "0" + String.valueOf(minutes) :
                String.valueOf(minutes);
        String secondS = String.valueOf(second).length() == 1 ? "0" + String.valueOf(second) :
                String.valueOf(second);
        return hoursS + ":" + minutesS + ":" + secondS;
    }


    //* 'abc' =>  ['ab', 'c_']
    //  * 'abcdef' => ['ab', 'cd', 'ef']
    public static String[] solution1(String s) {
        char[] arr = valueOf(s).toCharArray();
        String[] res = new String[s.length() % 2 != 0 ? s.length() / 2 + 1 : s.length() / 2];
        int k = 0;
        for (int i = 0; i < res.length; i++) {
            if (s.length() % 2 != 0 && i == res.length - 1) {
                res[i] = valueOf(arr[k++]) + "_";
            } else {
                res[i] = valueOf(arr[k++]) + valueOf(arr[k++]);
            }
        }
        return res;
    }

    //695 --> 6² + 9³ + 5⁴= 1390 = 695 * 2
    public static long digPow(int n, int p) {
        System.out.println("n: " + n + " p: " + p);
        char[] arr = valueOf(n).toCharArray();
        long sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = Integer.valueOf(valueOf(arr[i]));
            sum += multiply(x, p++);
        }
        if (Double.valueOf(sum) % Double.valueOf(n) == 0) {
            return sum / n;
        }
        return -1;
    }

    private static long multiply(int n, int times) {
        long res = n;
        for (int i = 0; i < times - 1; i++) {
            res = res * n;
        }
        return res;
    }

    private static int mult(int n, int times) {
        int res = n;
        for (int i = 0; i < times - 1; i++) {
            res = res * n;
        }
        return res;
    }

    public static String printerError(String s) {
        int countofMistakes = s.replaceAll("[a-mA-M]", "").length();
        return countofMistakes + "/" + s.length();
    }

    //1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153
    public static boolean isNarcissistic(int number) {
        char[] arr = valueOf(number).toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            int x = Integer.valueOf(valueOf(arr[i]));
            sum += mult(x, arr.length);
        }
        return sum == number;
    }

    //new double []{1,1,1,3,5,9,17,31,57,105}, variabonacci.tribonacci(new double []{1,1,1},10), precision);
    public double[] tribonacci(double[] s, int n) {
        double[] res = new double[n];
        for (int i = 0; i < ((n > 3) ? 3 : n); i++) {
            res[i] = s[i];
        }
        if (n > 3) {
            for (int i = 3; i < n; i++) {
                res[i] = res[i - 1] + res[i - 2] + res[i - 3];
            }
        }
        return res;
    }

    public static long findNextSquare(long sq) {
        if (sq < 0) {
            return -1;
        }
        double val = Math.sqrt(sq);
        if (val % 1 != 0) {
            return -1;
        }
        double nextSqrt = 0.0;
        for (double i = val + 1; i < Double.MAX_VALUE; i++) {
            if ((i * i) % 1 == 0) {
                nextSqrt = i * i;
                break;
            }
        }
        return Math.round(nextSqrt);
    }

    public static int rowSumOddNumbers(int n) {
        Map<Integer, List<Integer>> map = new TreeMap<>();
        int k = 1, j = 0;
        for (int i = 1; i <= n; i++) {
            List<Integer> list = new ArrayList<>();
            do {
                list.add(k);
                k += 2;
                j++;
            } while (i != j);
            map.put(i, list);
            j = 0;
        }
        List<Integer> resList = map.get(n);
        int sum = 0;
        for (int i = 0; i < resList.size(); i++) {
            sum += resList.get(i);
        }
        return sum;
    }

    public static boolean validatePin(String pin) {
        if (pin.length() == 4) {
            return pin.replaceAll("^\\d{4}", "").equals("");
        } else if (pin.length() == 6) {
            return pin.replaceAll("^\\d{6}", "").equals("");
        }
        return false;
    }

    public static String longest(String s1, String s2) {
        return (s1 + s2).chars().mapToObj(e -> (char) e).collect(Collectors.toList()).stream().
                distinct().sorted().map(String::valueOf).collect(Collectors.joining());
    }

    public static int nbYear(int p0, double percent, int aug, int p) {
        return p0 + (int) (p0 * percent) + p - aug;
    }

    public static Integer basicMath(String op, int v1, int v2) {
        switch (op) {
            case "+": {
                return v1 + v2;
            }
            case "-": {
                return v1 - v2;
            }
            case "*": {
                return v1 * v2;
            }
            case "/": {
                return v1 / v2;
            }
        }
        return 0;
    }

    public static String greet(String name) {
        return "Hello, " + name + " how are you doing today?";
    }

    //    "the-stealth-warrior" gets converted to "theStealthWarrior"
//    "The_Stealth_Warrior" gets converted to "TheStealthWarrior"
    static String toCamelCase(String s) {
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr;
        if (s.contains("-")) {
            arr = s.split("-");
        } else {
            arr = s.split("_");
        }
        String temp = "";
        for (int i = 0; i < arr.length; i++) {
            if (i == 0) {
                stringBuilder.append(arr[i]);
            } else {
                temp = arr[i].substring(0, 1).toUpperCase().concat(arr[i].substring(1));
                stringBuilder.append(temp);
            }
        }
        return stringBuilder.toString();
    }

    public static String maskify(String str) {
        if (str.length() > 4) {
            StringBuilder stringBuilder = new StringBuilder();
            for (int i = 0; i < str.length() - 4; i++) {
                stringBuilder.append("#");
            }
            stringBuilder.append(str.substring(str.length() - 4));
            return stringBuilder.toString();
        } else {
            return str;
        }
    }

    public static int persistence(long n) {
        String val = valueOf(n);
        if (val.length() == 1) {
            return 0;
        }
        int count = 0;
        do {
            count++;
            val = multiply(val);
        } while (val.length() > 1);

        return count;
    }

    private static String multiply(String val) {
        char[] arrC = val.toCharArray();
        int[] arrI = new int[arrC.length];
        for (int i = 0; i < arrC.length; i++) {
            arrI[i] = Integer.parseInt(valueOf(arrC[i]));
        }
        int res = 1;
        for (int i = 0; i < arrI.length; i++) {
            res *= arrI[i];
        }
        return valueOf(res);
    }


    public int GetSum(int a, int b) {
        //Good luck!
        if (a == b) {
            return a;
        }
        int sum = 0;
        if (a < b) {
            for (int i = a; i <= b; i++) {
                sum += i;
            }
        } else {
            for (int i = b; i <= a; i++) {
                sum += i;
            }
        }
        return sum;
    }

    public int countSheeps(Boolean[] arrayOfSheeps) {
        // TODO May the force be with you
        int count = 0;
        for (int i = 0; i < arrayOfSheeps.length; i++) {
            if (arrayOfSheeps[i] != null && arrayOfSheeps[i]) {
                count++;
            }
        }
        return count;
    }

    static String encode(String word) {
        int counter = 0;
        String res = word.toLowerCase();
        for (int i = 0; i < word.length(); i++) {
            for (int j = i + 1; j < word.length(); j++) {
                if (valueOf(word.toLowerCase().charAt(i)).equals(valueOf(word.toLowerCase().charAt(j)))) {
                    counter = 1;
                    break;
                }
            }
            String pattern = valueOf(word.toLowerCase().charAt(i));
            if (counter == 1) {
                try {
                    res = res.replaceAll(pattern, ")");
                } catch (Exception e) {
                    res = res.replaceAll("\\%s".formatted(pattern), ")");
                }
            } else {
                try {
                    res = res.replaceAll(pattern, "(");
                } catch (Exception e) {
                    if (word.indexOf(pattern) == i) {
                        StringBuilder testSB = new StringBuilder(res);
                        testSB.setCharAt(word.indexOf(pattern), '(');
                        res = testSB.toString();
                    }
                }
            }
            counter = 0;
        }
        return res.replaceAll("\\%s".formatted("[^@#$%&*]"), "");
    }

    static int find(int[] integers) {
        int oddCount = 0, evenCount = 0, oddNumber = 0, evenNumber = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 != 0) {
                oddCount++;
                oddNumber = integers[i];
            } else {
                evenCount++;
                evenNumber = integers[i];
            }
        }
        if (evenCount > oddCount) {
            return oddNumber;
        }
        return evenNumber;
    }

    public static int findSmallestInt(int[] args) {
        return Arrays.stream(args).min().getAsInt();
    }

    //accum("abcd") -> "A-Bb-Ccc-Dddd"
    public static String accum(String s) {
        char[] arr = s.toCharArray();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            stringBuilder.append(valueOf(arr[i]).toUpperCase());
            if (i != 0) {
                for (int j = 0; j < i; j++) {
                    stringBuilder.append(valueOf(arr[i]).toLowerCase());
                }
            }
            if (i < s.length() - 1) {
                stringBuilder.append("-");
            }
        }
        return stringBuilder.toString();
    }

    public static int countBits(int n) {
        String str = Integer.toBinaryString(n);
        char[] arr = str.toCharArray();
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Character.valueOf(arr[i]).equals('1')) {
                counter++;
            }
        }
        return counter;
    }

    public static boolean isIsogram(String str) {
        Map<String, Integer> map = new TreeMap<>();
        char[] arr = str.toLowerCase().toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (map.get(valueOf(arr[i])) == null) {
                map.put(valueOf(arr[i]), 1);
            } else {
                map.put(valueOf(arr[i]), map.get(valueOf(arr[i])) + 1);
            }
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                return false;
            }
        }
        return true;
    }

    public static String remove(String str) {
        return str.substring(1, str.length() - 1);
    }

    public String spinWords(String sentence) {
        String[] arr = sentence.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilderRev = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() >= 5) {
                stringBuilderRev.append(arr[i]).reverse();
                stringBuilder.append(stringBuilderRev).append(" ");
                stringBuilderRev.delete(0, stringBuilderRev.length());
            } else {
                stringBuilder.append(arr[i]).append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }

    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        } else {
            return valueOf(word.charAt(word.length() / 2));
        }
    }

    //942  -->  9 + 4 + 2 = 15  -->  1 + 5 = 6
    public static int digital_root(int n) {
        char[] arr = valueOf(n).toCharArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += Integer.valueOf(valueOf(arr[i]));
        }
        if (valueOf(sum).length() > 1) {
            return digital_root(sum);
        } else {
            return sum;
        }
    }

    public static int findIt(int[] a) {
        Map<Integer, Integer> map = new TreeMap<>();
        for (int i = 0; i < a.length; i++) {
            try {
                map.put(a[i], map.get(a[i]) + 1);
            } catch (Exception e) {
                map.put(a[i], 1);
            }
        }
        int odd = 0;
        for (Integer val : map.values()) {
            if (val % 2 != 0) {
                odd = val;
                break;
            }
        }
        int oddValue = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (Objects.equals(odd, entry.getValue())) {
                oddValue = entry.getKey();
            }
        }
        return oddValue;
    }

    public static String createPhoneNumber(int[] numbers) {
        // Your code here!
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("(");
        for (int i = 0; i < numbers.length; i++) {
            if (i < 3) {
                stringBuilder.append(numbers[i]);
            } else if (i == 3) {
                stringBuilder.append(") " + numbers[i]);
            } else if (i == 6) {
                stringBuilder.append("-" + numbers[i]);
            } else {
                stringBuilder.append(numbers[i]);
            }
        }
        return stringBuilder.toString();
    }

    public static int[] between(int a, int b) {
        int[] arr = new int[b - a + 1];
        int temp = a;
        for (int i = 0; i <= b - a; i++) {
            arr[i] = temp++;
        }
        return arr;
    }

    public static String shortcut(String input) {
        return input.replaceAll("[aeiou]", "");
    }

    public static int findDifference(final int[] firstCuboid, final int[] secondCuboid) {
        return Arrays.stream(firstCuboid).reduce(1, Math::multiplyExact) > Arrays.stream(secondCuboid).reduce(1, Math::multiplyExact) ?
                Arrays.stream(firstCuboid).reduce(1, Math::multiplyExact) - Arrays.stream(secondCuboid).reduce(1, Math::multiplyExact) :
                Arrays.stream(secondCuboid).reduce(1, Math::multiplyExact) - Arrays.stream(firstCuboid).reduce(1, Math::multiplyExact);
    }

    public static String updateLight(String current) {
        switch (current) {
            case "red": {
                return "green";
            }
            case "yellow": {
                return "red";
            }
            case "green": {
                return "yellow";
            }
        }
        return "";
    }

    public static int countSmileys(List<String> arr) {
        int counter = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).length() > 3 || arr.get(i).length() < 2) {
            } else if (arr.get(i).length() == 3) {
                if ((Character.valueOf(arr.get(i).charAt(0)).compareTo(Character.valueOf(';')) == 0 ||
                        Character.valueOf(arr.get(i).charAt(0)).compareTo(Character.valueOf(':')) == 0) &&
                        (Character.valueOf(arr.get(i).charAt(1)).compareTo(Character.valueOf('-')) == 0 ||
                                Character.valueOf(arr.get(i).charAt(1)).compareTo(Character.valueOf('~')) == 0) &&
                        (Character.valueOf(arr.get(i).charAt(2)).compareTo(Character.valueOf(')')) == 0 ||
                                Character.valueOf(arr.get(i).charAt(2)).compareTo(Character.valueOf('D')) == 0)) {
                    counter++;
                }
            } else if (arr.get(i).length() == 2) {
                if ((Character.valueOf(arr.get(i).charAt(0)).compareTo(Character.valueOf(';')) == 0 ||
                        Character.valueOf(arr.get(i).charAt(0)).compareTo(Character.valueOf(':')) == 0) &&
                        (Character.valueOf(arr.get(i).charAt(1)).compareTo(Character.valueOf(')')) == 0 ||
                                Character.valueOf(arr.get(i).charAt(1)).compareTo(Character.valueOf('D')) == 0)) {
                    counter++;
                }
            }
        }
        return counter;
    }

    // { 1, 2, 3 }, 4
    public static int solveSuperMarketQueue(int[] customers, int n) {
        if (customers.length == 0) {
            return 0;
        }
        if (customers.length <= n) {
            return Arrays.stream(customers).max().getAsInt();
        }
        List customersL = new ArrayList<>();
        for (int i = 0; i < customers.length; i++) {
            customersL.add(customers[i]);
        }
        TreeMap<Integer, Integer> map = new TreeMap<>();
        for (int i = 1; i <= n; i++) {
            map.put(i, (Integer) customersL.get(0));
            customersL.remove(0);
        }
        int count = 0, key = 0, removedTimes = 0;
        boolean removed = false;
        do {
            int size = map.keySet().size();
            for (int i = 0; i < size; i++) {
                if (size == map.keySet().size()) {
                    key = (int) map.keySet().toArray()[i];
                } else {
                    key = (int) map.keySet().toArray()[i - removedTimes];
                }
                if (map.get(key) == 0) {
                    if (customersL.size() > 0) {
                        map.put(key, (Integer) customersL.get(0));
                        customersL.remove(0);
                    } else {
                        map.remove(key);
                        removed = true;
                        removedTimes++;
                    }
                }
                if (!removed) {
                    map.put(key, map.get(key) - 1);
                }
                removed = false;
            }
            removedTimes = 0;
            count++;
        } while (map.size() > 0);
        return count - 1;
    }

    public static long[] powersOfTwo(int n) {
        long[] arr = new long[n + 1];
        for (int i = 0; i <= n; i++) {
            if (i == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 2 * i;
            }
        }
        return arr;
    }

    public static int paperWork(int n, int m) {
        if (m <= 0 || n <= 0) {
            return 0;
        }
        return n * m;
    }

    public long numberOfDivisors(int n) {
        long count = 0;
        double val = 0.0;
        for (double i = 1; i <= n; i++) {
            val = Double.valueOf(n) / i;
            if (val % 1 == 0) {
                count++;
            }
        }
        return count;
    }

    public static String areYouPlayingBanjo(String name) {
        // Program me!
        return name.toLowerCase().substring(0, 1).equals("r") ? name + " plays banjo" : name + " does not play banjo";
    }

    public static int[] map(int[] arr) {
        return Arrays.stream(arr).map(x -> x * 2).toArray();
    }

    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        return Arrays.stream(classPoints).average().getAsDouble() > yourPoints;
    }

    public int min(int[] list) {
        return Arrays.stream(list).min().getAsInt();
    }

    public static String[] towerBuilder(int nFloors) {
        String[] arr = new String[nFloors];
        int spaceCount = 0;
        int markCount = 1;
        for (int i = 0; i < arr.length; i++) {
            spaceCount = nFloors * 2 - 1 - markCount;
            arr[i] = String.join("", Collections.nCopies(spaceCount / 2, " ")) +
                    String.join("", Collections.nCopies(markCount, "*")) +
                    String.join("", Collections.nCopies(spaceCount / 2, " "));
            markCount += 2;
        }
        return arr;
    }

    public static String convert(boolean b) {
        if (true) {
            return "true";
        } else {
            return "false";
        }
    }

    //{2,4,6,8,10}, Kata.countBy(2,5));
    public static int[] countBy(int x, int n) {
        // Your code here
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = x * (i + 1);
        }
        return arr;
    }

    public static int quarterOf(int month) {
        // Your code here
        if (month >= 1 && month <= 3) {
            return 1;
        } else if (month > 3 && month <= 6) {
            return 2;
        } else if (month > 6 && month <= 9) {
            return 3;
        } else {
            return 4;
        }
    }

    //16, TwiceAsOld.TwiceAsOld(30,7));
    public static int TwiceAsOld(int dadYears, int sonYears) {
        System.out.println(dadYears + " " + sonYears);
        return (dadYears - sonYears * 2) >= 0 ? dadYears - sonYears * 2 : dadYears - sonYears - 1;
    }

    public static int mostFrequentItemCount(int[] collection) {
        // Do your magic :)
        System.out.println("Collection length: " + collection.length);
        for (int i = 0; i < collection.length; i++) {
            System.out.println(collection[i] + ", ");
        }
        if (collection.length == 0) {
            return 0;
        }
        Map<Integer, Integer> map = new TreeMap<>();
        Integer val = 0;
        for (int i = 0; i < collection.length; i++) {
            val = map.get(collection[i]);
            if (val == null) {
                val = 0;
            }
            map.put(collection[i], ++val);
        }
        return map.values().stream().max(Integer::compare).get();
    }


    public static int howOld(final String herOld) {

        return Integer.parseInt(herOld.substring(0, 1));

    }

    public static List<String> number(List<String> lines) {
        List<String> list = new ArrayList<>();
        for (int i = 1; i <= lines.size(); i++) {
            list.add(i + ": " + lines.get(i));
        }
        return list;
    }

    //a = ["az", "toto", "picaro", "zone", "kiwi"] -->
    //[["az", "toto picaro zone kiwi"], ["az toto", "picaro zone kiwi"], ["az toto picaro", "zone kiwi"], ["az toto picaro zone", "kiwi"]]
    public static String[][] partlist(String[] arr) {
        // your code
        String[][] res = new String[arr.length - 1][2];
        StringBuilder stringBuilder1 = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        int val1 = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < 2; j++) {
                int val2 = i + 1;
                if (j == 0) {
                    for (int k = 0; k < val2; k++) {
                        stringBuilder1.append(arr[val1++]).append(" ");
                    }
                    res[i][j] = stringBuilder1.toString().trim();
                    stringBuilder1.delete(0, stringBuilder1.length());
                    val1 = 0;
                } else {
                    for (int k = val2; k < arr.length; k++) {
                        stringBuilder2.append(arr[val2++]).append(" ");
                    }
                    res[i][j] = stringBuilder2.toString().trim();
                    stringBuilder2.delete(0, stringBuilder2.length());
                }
            }
        }
        return res;
    }

    public boolean check(String sentence) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        int counter = 0;
        for (int k = 0; k < alphabet.length; k++) {
            for (int i = 0; i < sentence.length(); i++) {
                if (Character.valueOf(alphabet[k]).equals(sentence.toLowerCase().charAt(i))) {
                    counter = 1;
                    break;
                }
            }
            if (counter == 0) {
                char c = sentence.toLowerCase().charAt(k);
                return false;
            }
            counter = 0;
        }
        return true;
    }

    //"taxi", Kata.high("man i need a taxi up to ubud"));
    public static String high(String s) {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        TreeMap<Integer, String> map = new TreeMap<>();
        String[] arr = s.split(" ");
        int score = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                for (int k = 0; k < alphabet.length; k++) {
                    if (Character.valueOf(alphabet[k]).equals(arr[i].charAt(j))) {
                        score += k + 1;
                        break;
                    }
                }
            }
            if (map.containsKey(score)) {
                map.put(0, arr[i]);
            } else {
                map.put(score, arr[i]);
            }
            score = 0;
        }
        return map.lastEntry().getValue();
    }

    //([1, 2, 3], 4) == {0, 2}
    public static int[] twoSum(int[] numbers, int target) {
        int[] arr = new int[2];
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    arr[0] = i;
                    arr[1] = j;
                }
            }
        }
        return arr;
    }

    //pigIt('Hello world !');     // elloHay orldway !
    public static String pigIt(String str) {
        String[] arr = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].length() == 1 && !Character.isAlphabetic(arr[i].charAt(0))) {
                stringBuilder.append(arr[i]).append(" ");
            } else if (arr[i].length() == 1 && Character.isAlphabetic(arr[i].charAt(0))) {
                stringBuilder.append(arr[i]).append("ay").append(" ");
            }
//            } else if (arr[i].length() > 1 && Character.isAlphabetic(arr[i].charAt(arr[i].length() - 1))) {
//
//            }
            else {
                stringBuilder.append(arr[i].substring(1)).append(arr[i].substring(0, 1)).append("ay").append(" ");
            }
        }
        return stringBuilder.toString().trim();
    }

    public static int[] reverse(int n) {
        //your code
        int[] arr = new int[n];
        for (int i = n; i > 0; i--) {
            arr[n - i] = i;
        }
        return arr;
    }

    //70304 "70000 + 300 + 4"
//75324  "70000 + 5000 + 300 + 20 + 4"
    public static String expandedForm(int num) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = valueOf(num);
        String res = "";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (Character.valueOf(str.charAt(i)).compareTo('0') != 0) {
                    if (j == i + 1) {
                        stringBuilder.append(str.charAt(i));
                    }
                    stringBuilder.append('0');
                    if (j == str.length() - 1) {
                        stringBuilder.append(" + ");
                    }
                }
            }
        }
        if (Character.valueOf(str.charAt(str.length() - 1)).compareTo('0') != 0) {
            stringBuilder.append(str.charAt(str.length() - 1));
        }
        if (stringBuilder.length() > 3 && stringBuilder.substring(stringBuilder.length() - 2).equals("+ ")) {
            stringBuilder = new StringBuilder(stringBuilder.substring(0, stringBuilder.length() - 3));
        }
        res = stringBuilder.toString();
        return res;
    }

    public static int simpleMultiplication(int n) {
        //your code here
        if (n % 2 != 0) {
            return n * 9;
        }
        return n * 8;
    }

    public static String repeatStr(final int repeat, final String string) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < repeat; i++) {
            stringBuilder.append(string);
        }
        return stringBuilder.toString();
    }

    public static String whoLikesIt(String... names) {
        switch (names.length) {
            case 0: {
                return "no one likes this";
            }
            case 1: {
                return names[0] + " likes this";
            }
            case 2: {
                return names[0] + " and " + names[1] + " like this";
            }
            case 3: {
                return names[0] + ", " + names[1] + " and " + names[2] + " like this";
            }
            default: {
                return names[0] + ", " + names[1] + " and " + (names.length - 2) + " others like this";
            }
        }
    }

    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(x -> x * x).sum();
    }

    public static String[] wave(String str) {
        // Your code
        StringBuilder stringBuilder = new StringBuilder();
        List<String> list = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if (!valueOf(str.charAt(i)).equals(" ")) {
                for (int j = 0; j < str.length(); j++) {
                    if (i == j) {
                        stringBuilder.append(valueOf(str.charAt(j)).toUpperCase());
                    } else {
                        stringBuilder.append(str.charAt(j));
                    }
                }
                list.add(stringBuilder.toString());
                stringBuilder.delete(0, stringBuilder.length());
            }
        }
        return list.toArray(new String[list.size()]);
    }

    public static int summation(int n) {
        int res = 0;
        while (n > 0) {
            res += n;
            n--;
        }
        return res;
    }

    public static String camelCase(String input) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                stringBuilder.append(" ");
            }
            stringBuilder.append(input.charAt(i));
        }
        return stringBuilder.toString();
    }

    public static int sum11(int[] numbers) {
        if (numbers == null || numbers.length == 1 || numbers.length == 0) {
            return 0;
        }
        int max = Arrays.stream(numbers).max().getAsInt();
        int min = Arrays.stream(numbers).min().getAsInt();
        int sum = Arrays.stream(numbers).sum();
        return sum - max - min;
    }

    public static int sortDesc(final int num) {
        //Your code
        String arr = valueOf(num);
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length(); i++) {
            list.add(Integer.parseInt(valueOf(arr.charAt(i))));
        }
        Collections.sort(list);
        Collections.reverse(list);
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < list.size(); i++) {
            stringBuilder.append(list.get(i));
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static String reverseWords(final String original) {
        if (original.equals("")) {
            return original;
        }
        if (original.isBlank()) {
            return original;
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder stringBuilder2 = new StringBuilder();
        String[] arr = original.split(" ");
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i]).reverse();
            stringBuilder2.append(stringBuilder.toString()).append(" ");
            stringBuilder.delete(0, stringBuilder.length());
        }

        return stringBuilder2.toString().trim();
    }

    public static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }

    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] arr = phrase.split(" ");
        for (int i = 0; i < arr.length; i++) {
            stringBuilder.append(arr[i].substring(0, 1).toUpperCase()).append(arr[i].substring(1)).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static boolean solution(String str, String ending) {
        return str.substring(str.length() - ending.length()).equals(ending);
    }

    public static int findShort(String s) {
        return Arrays.stream(s.split(" ")).min(Comparator.comparing(String::length)).get().length();
    }

    //[5, 8, 6, 3, 4]  =>  [3, 8, 6, 5, 4]
    public static int[] sortArray(int[] array) {
        List<Integer> odd = new ArrayList<>();
        Map<Integer, Integer> even = new TreeMap<>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd.add(array[i]);
            } else {
                even.put(i, array[i]);
            }
        }
        Collections.sort(odd);
        int k = 0;
        for (int i = 0; i < array.length; i++) {
            if (even.containsKey(i)) {
                array[i] = even.get(i);
            } else {
                array[i] = odd.get(k);
                k++;
            }
        }
        return array;
    }

    //"is2 Thi1s T4est 3a"), equalTo("Thi1s is2 3a T4est"
    public static String order(String words) {
        List<String> list = List.of(words.split(" "));
        Map<Integer, String> map = new TreeMap<>();
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.get(i).length(); j++) {
                if (Character.isDigit(list.get(i).charAt(j))) {
                    map.put(Integer.valueOf(list.get(i).charAt(j)), list.get(i));
                    break;
                }
            }
        }
        StringBuilder stringBuilder = new StringBuilder();
        for (String value : map.values()) {
            stringBuilder.append(value).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public int squareDigits(int n) {
        // TODO Implement me
        int val = 0;
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < valueOf(n).length(); i++) {
            int exactVal = Integer.parseInt(valueOf(n).substring(i, i + 1));
            System.out.println("exactVal" + exactVal);
            val = exactVal * exactVal;
            stringBuilder.append(val);
        }
        return Integer.parseInt(stringBuilder.toString());
    }

    public static String binaryAddition(int a, int b) {
        //your code herInteger.parseInt(str.toString(), 2);
        return Integer.toBinaryString(a + b);
    }

    public static boolean comp(int[] a, int[] b) {
        if (a == null && b == null) {
            return true;
        }
        if (a != null && b == null) {
            return false;
        }
        if (a == null && b != null) {
            return false;
        }
        if (a.length != b.length) {
            return false;
        }

        List<Integer> aList = Arrays.stream(a).boxed().collect(Collectors.toList());
        Collections.sort(aList);
        List<Integer> aListSquare = new ArrayList<>();
        for (int i = 0; i < aList.size(); i++) {
            aListSquare.add(aList.get(i) * aList.get(i));
        }
        List<Integer> bList = Arrays.stream(b).boxed().collect(Collectors.toList());
        Collections.sort(bList);
        Collections.sort(aListSquare);
        for (int i = 0; i < bList.size(); i++) {
            if (!bList.get(i).equals(aListSquare.get(i))) {
                return false;
            }
        }
        return true;
    }

    public static int duplicateCount(String text) {
        String t = text.toLowerCase();
        Map<Character, Integer> duplicates = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            for (int j = i + 1; j < t.length(); j++) {
                if (Character.valueOf(t.charAt(i)).compareTo(Character.valueOf(t.charAt(j))) == 0) {
                    duplicates.put(t.charAt(i), duplicates.get(t.charAt(i) + 1));
                }
            }
        }
        return duplicates.size();
    }

    public static double find_average(int[] array) {
        System.out.println(Arrays.stream(array).average().getAsDouble());
        return Arrays.stream(array).average().getAsDouble();
    }

    public static int getCount(String str) {
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (Character.valueOf(str.charAt(i)).compareTo(Character.valueOf('a')) == 0 || Character.valueOf(str.charAt(i)).compareTo(Character.valueOf('e')) == 0 || Character.valueOf(str.charAt(i)).compareTo(Character.valueOf('i')) == 0 || Character.valueOf(str.charAt(i)).compareTo(Character.valueOf('o')) == 0 || Character.valueOf(str.charAt(i)).compareTo(Character.valueOf('u')) == 0) {
                counter++;
            }
        }
        return counter;
    }

    public static int[] arrayDiff(int[] a, int[] b) {
        // Your code here
        ArrayList<Integer> list = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (b[j] == a[i]) {
                    counter = 1;
                    break;
                }
            }
            if (counter == 0) {
                list.add(a[i]);
            }
            counter = 0;
        }
        int[] arr = new int[list.size()];
        for (int i = 0; i < list.size(); i++)
            arr[i] = list.get(i);
        return arr;
    }

    public static int century(int number) {
        double century = Double.valueOf(number) / Double.valueOf(100);
        if ((int) century != century) {
            century++;
        }
        return (int) century;
    }

    public static boolean zeroFuel(double distanceToPump, double mpg, double fuelLeft) {
        // Your code here!
        return distanceToPump / mpg <= fuelLeft ? true : false;
    }

    public static String[] split(String str) {
        return str.split(" ");
    }

    public static String oddOrEven(int[] array) {
        // your code
        if (Arrays.stream(array).sum() % 2 != 0) {
            return "Odd";
        }
        return "Even";
    }

    public static String fakeBin(String numberString) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < numberString.length(); i++) {
            if (Integer.parseInt(valueOf(numberString.charAt(i))) < 5) {
                stringBuilder.append(0);
            } else {
                stringBuilder.append(1);
            }
        }
        return stringBuilder.toString();
    }

    public static int[] digitize(long n) {
        // Code here
        String str = new StringBuilder().append(n).reverse().toString();
        int x[] = new int[str.length()];
        for (int i = 0; i < str.length(); i++) {
            x[i] = Integer.parseInt(valueOf(str.charAt(i)));
        }
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i]);
        }
        return x;
    }

    public static String highAndLow(String numbers) {
        // Code here or
        return Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).max().getAsInt() + " " + Arrays.stream(numbers.split(" ")).mapToInt(Integer::parseInt).min().getAsInt();
    }

    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        // Your Code
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < binary.size(); i++) {
            str.append(binary.get(i));
        }
        return Integer.parseInt(str.toString(), 2);
    }

    public static int countPassengers(ArrayList<int[]> stops) {
        //Code here!
        int in = 0, out = 0;
        for (int[] x : stops) {
            in += x[0];
            out += x[1];
        }
        return in - out;
    }

    public static boolean validatePin1(String pin) {
        if (pin.length() != 4) {
            return false;
        }
        try {
            int res = Integer.parseInt(pin);
            if (res > 0 && valueOf(res).length() == 4) {
                return true;
            }
            return false;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public int liters(double time) {

        //Your code goes here! Hint: You should change that -1
        return (int) (time / 2);

    }

    public static int sum(int[] arr) {
        return Arrays.stream(arr).filter(x -> x > 0).sum();
    }

    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c) {
            if (a + c > b) {
                if (b + c > a) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean getXO(String str) {
        return str.replaceAll("x", "").length() == str.replaceAll("o", "").length() ? true : false;
    }

    public static boolean check(Object[] a, Object x) {
        // Your code here
        for (int i = 0; i < a.length; i++) {
            if (a[i].equals(x)) {
                return true;
            }
        }
        return false;
    }

    public static String makeComplement(String dna) {
        //Your code
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < dna.length(); i++) {
            if (Character.compare(dna.charAt(i), 'T') == 0) {
                str.append("A");
            } else if (Character.compare(dna.charAt(i), 'A') == 0) {
                str.append("T");
            } else if (Character.compare(dna.charAt(i), 'C') == 0) {
                str.append("G");
            } else if (Character.compare(dna.charAt(i), 'G') == 0) {
                str.append("C");
            }
        }
        return str.toString();
    }

    public static List<Object> filterList(final List<Object> list) {
        // Return the List with the Strings filtered out
        return list.stream().filter(x -> x instanceof Integer).collect(Collectors.toList());
    }

    public static int points(String[] games) {
        int x, y, res = 0;
        for (int i = 0; i < games.length; i++) {
            x = Integer.parseInt(games[i].substring(0, games[i].indexOf(":")));
            y = Integer.parseInt(games[i].substring(games[i].indexOf(":") + 1));
            if (x > y) {
                res += 3;
            } else if (x == y) {
                res += 1;
            }
        }
        return res;
    }

    public static String countingSheep(boolean[] num) {
        //Add your code here
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < num.length; i++) {
            str.append(i + 1 + " sheep...");
        }
        return str.toString();
    }

    public static String abbrevName(String name) {
        return valueOf(name.charAt(0)).toUpperCase() + "." + name.substring(name.indexOf(" ") + 1, name.indexOf(" ") + 2).toUpperCase();
    }

    public static String bmi(double weight, double height) {
        double bmi = weight / height * height;
        if (bmi <= 18.5) {
            return "Underweight";
        } else if (bmi <= 25.0) {
            return "Normal";
        } else if (bmi <= 30.0) {
            return "Overweight";
        } else if (bmi > 30) {
            return "Obese";
        }
        return null;
    }

    static String removeExclamationMarks(String s) {
        return s.replaceAll("!", "");
    }

    public int sum(List<?> mixed) {

        return mixed.stream().flatMapToInt(num -> IntStream.of(Integer.parseInt(valueOf(num)))).sum();
    }

    public static String findNeedle(Object[] haystack) {
        // Your code here
        for (int i = 0; i < haystack.length; i++) {
            if (haystack[i] instanceof String && haystack[i].equals("needle")) {
                return "found the needle at position " + i;
            }
        }
        return "";
    }

    public static String smash(String... words) {
        // TODO Write your code below this comment please
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < words.length; i++) {
            str.append(words[i]).append(" ");
        }
        return str.toString().trim();
    }

    public static String solution(String str) {
        // Your code here...
        StringBuilder newString = new StringBuilder(str);
        return newString.reverse().toString();
    }

    public static String even_or_odd(int number) {
        //Place code here
        if (number % 2 != 0) {
            return "Odd";
        }
        return "Even";
    }
}

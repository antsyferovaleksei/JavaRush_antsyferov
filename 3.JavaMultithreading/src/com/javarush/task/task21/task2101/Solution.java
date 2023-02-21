//package com.javarush.task.task21.task2101;
//
///*
//Определяем адрес сети
//*/
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//public class Solution {
//    public static void main(String[] args) {
//        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
//        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
//        List<String> netAddress = getNetAddress(ip, mask);
//        print(ip);          //11000000 10101000 00000001 00000010
//        print(mask);        //11111111 11111111 11111110 00000000
//        print(netAddress);  //11000000 10101000 00000000 00000000
//    }
//
//    public static List<String> getNetAddress(byte[] ip, byte[] mask) {
//        List<String> ipList = new ArrayList<>();
//        List<String> maskList = new ArrayList<>();
//        List<String> addressList = new ArrayList<>();
//        byte[] address = new byte[4];
//        for (int i = 0; i < ip.length; i++) {
//            String ipValue = Integer.toBinaryString(ip[i] & 0xff);
//            String maskValue = Integer.toBinaryString(mask[i] & 0xff);
//            ipValue = addZero(ipValue);
//            maskValue = addZero(maskValue);
//            ipList.add(ipValue);
//            maskList.add(maskValue);
//        }
//        for (int i = 0; i < address.length; i++) {
//            String addressListLine = "";
//            for (int j = 0; j < ipList.get(i).length(); j++) {
//                boolean ipListVal = false;
//                boolean maskListVal = false;
//                if(String.valueOf(ipList.get(i).charAt(j)).equals("1")){
//                    ipListVal = true;
//                }
//                if(String.valueOf(maskList.get(i).charAt(j)).equals("1")){
//                    maskListVal = true;
//                }
//                if (ipListVal && maskListVal) {
//                    addressListLine = addressListLine.concat("1");
//                } else {
//                    addressListLine = addressListLine.concat("0");
//                }
//            }
//            addressList.add(i, addressListLine);
//        }
//        return addressList;
//    }
//
//    private static String addZero(String str) {
//        int lenIp = str.length();
//        if (lenIp < 8) {
//            String zero = "0";
//            for (int j = 1; j < 8 - lenIp; j++) {
//                zero = zero.concat("0");
//            }
//            str = zero.concat(str);
//        }
//        return str;
//    }
//
//    public static void print(List<String> strL) {
//        for (String str: strL) {
//            System.out.print(str + " ");
//        }
//        System.out.println();
//    }
//
//    public static void print(byte[] strL) {
//        for (int i = 0; i < strL.length; i++) {
//            String str = Integer.toBinaryString(strL[i] & 0xff);
//            System.out.print(addZero(str) + " ");
//        }
//        System.out.println();
//    }
//}

package com.javarush.task.task21.task2101;

/*
Определяем адрес сети
*/

public class Solution {
    public static void main(String[] args) {
        byte[] ip = new byte[]{(byte) 192, (byte) 168, 1, 2};
        byte[] mask = new byte[]{(byte) 255, (byte) 255, (byte) 254, 0};
        byte[] netAddress = getNetAddress(ip, mask);
        print(ip);          //11000000 10101000 00000001 00000010
        print(mask);        //11111111 11111111 11111110 00000000
        print(netAddress);  //11000000 10101000 00000000 00000000
    }

    public static byte[] getNetAddress(byte[] ip, byte[] mask) {
        byte[] netAddress = new byte[4];
        for (int i = 0; i < netAddress.length; i++)
            netAddress[i] = (byte) (ip[i] & mask[i]);
        return netAddress;
    }

    public static void print(byte[] bytes) {
        String currentBinary;
        for (byte aByte : bytes) {
            currentBinary = Integer.toBinaryString(256 + (int) aByte);
            System.out.print(currentBinary.substring(currentBinary.length() - 8) + " ");
        }
        System.out.println();
    }
}


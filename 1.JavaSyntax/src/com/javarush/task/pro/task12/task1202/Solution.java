package com.javarush.task.pro.task12.task1202;

/* 
Распаковка
*/

public class Solution {
        Byte byteValueBox =  new Byte((byte) 0xe0);
        Short shortValueBox = new Short((short)1);
        Integer integerValueBox = new Integer(0);
        Long longValueBox = new Long(1);

        Float floatValueBox = new Float(1F);
        Double doubleValueBox = new Double (1D);

        Character characterValueBox = new Character('c');
        Boolean booleanValueBox = new Boolean(true);

        //напишите тут ваш код
        byte byteValue = byteValueBox.byteValue();
        short shortValue = shortValueBox.shortValue();
        int intValue = integerValueBox.intValue();
        long longValue = longValueBox.longValue();
        
        float floatValue = floatValueBox.floatValue();
        double doubleValue = doubleValueBox.doubleValue();

        char charValue = characterValueBox.charValue();
        boolean booleanValue = booleanValueBox.booleanValue();
}

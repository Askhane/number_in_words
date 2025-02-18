package org.example;

public class NumbersInWords {

    private static final int TEN = 10;

    static String convertToWords(int number) {
        return getNumberWords(number).numberName();
    }

    private static NumberName getNumberWords(int number) {
        NumberName name = PrimitiveNumberName.get(number);
        if (name == null) {
            name = compositeNumber(number);
        }
        return name;
    }

    private static NumberName compositeNumber(int number) {
        int units = number % TEN;
        int tens = number - units;

        if (tens == 70) {
            tens = 60;
            units = TEN + units;
        }

        NumberName unitsAsWords = getNumberWords(units);
        PrimitiveNumberName tensAsWords = PrimitiveNumberName.get(tens);
        if(units%10 == 1) {
            return new CompositeNumberEt(tensAsWords, unitsAsWords);
        }

        return new CompositeNumber(tensAsWords, unitsAsWords);
    }
}

package org.example;

import java.util.Map;

import static java.util.Map.entry;

public class NumbersInWords {

    private static final String ET = "et-";

    private static final Map<Integer, String> primitiveNumbersToWords = Map.ofEntries(
            entry(0, "zero"),
            entry(1, "un"),
            entry(2, "deux"),
            entry(3, "trois"),
            entry(4, "quatre"),
            entry(5, "cinq"),
            entry(6, "six"),
            entry(7, "sept"),
            entry(8, "huit"),
            entry(9, "neuf"),
            entry(10, "dix"),
            entry(11, "onze"),
            entry(12, "douze"),
            entry(13, "treize"),
            entry(14, "quatorze"),
            entry(15, "quinze"),
            entry(16, "seize"),
            entry(20, "vingt"),
            entry(30, "trente"),
            entry(40, "quarante"),
            entry(50, "cinquante"),
            entry(60, "soixante")
    );

    private static final int DIX = 10;

    static String convertToWords(int number) {
        String words = primitiveNumbersToWords.get(number);
        if (words == null) {
            words = compositeNumbersToWords(number);
        }
        return words;
    }

    private static String compositeNumbersToWords(int number) {
        int units = number % DIX;
        int tens = number - units;

        if (tens == 70) {
            tens = 60;
            units = DIX + units;
        }

        String unitsAsWords = convertToWords(units);
        if(units%10 == 1) {
            unitsAsWords = ET + unitsAsWords;
        }
        String tensAsWords = primitiveNumbersToWords.get(tens);

        return String.format("%s-%s",tensAsWords, unitsAsWords);
    }
}

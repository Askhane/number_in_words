package org.example;

import java.util.Map;

public class PrimitiveNumberName implements NumberName {

    private static final Map<Integer, PrimitiveNumberName> primitiveNumbersToWords = Map.ofEntries(
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
    private final String numberName;

    public PrimitiveNumberName(String zero) {
        this.numberName = zero;
    }

    public static Map.Entry<Integer, PrimitiveNumberName> entry(int intValue, String name) {
        return Map.entry(intValue, new PrimitiveNumberName(name));
    }

    public static PrimitiveNumberName get(int number) {
        return primitiveNumbersToWords.get(number);
    }

    @Override
    public String numberName() {
        return numberName;
    }

    @Override
    public String toString() {
        return numberName();
    }
}

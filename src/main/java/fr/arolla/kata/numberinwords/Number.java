package fr.arolla.kata.numberinwords;

public class Number {
    public static String inWords(int number) {
        if (number >= 17) {
            return compoundNumberInWords(number);
        }
        return namedNumberInWords(number);
    }

    private static String compoundNumberInWords(int number) {
        int unitDigit = getUnitDigit(number);
        String unitName = namedNumberInWords(unitDigit);
        String tensName = namedNumberInWords(10);
        return tensName + "-" + unitName;
    }

    private static int getUnitDigit(int number) {
        return number % 10;
    }

    private static String namedNumberInWords(int number) {
        return switch (number) {
            case 0 -> "zero";
            case 1 -> "un";
            case 2 -> "deux";
            case 3 -> "trois";
            case 4 -> "quatre";
            case 5 -> "cinq";
            case 6 -> "six";
            case 7 -> "sept";
            case 8 -> "huit";
            case 9 -> "neuf";
            case 10 -> "dix";
            case 11 -> "onze";
            case 12 -> "douze";
            case 13 -> "treize";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "seize";
            default -> null;
        };
    }
}

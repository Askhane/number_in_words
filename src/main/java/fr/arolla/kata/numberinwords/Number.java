package fr.arolla.kata.numberinwords;

public class Number {
    public static String inWords(int number) {
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
            default -> null;
        };
    }
}

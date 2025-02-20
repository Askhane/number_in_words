package fr.arolla.kata.numberinwords;

public class Number {
    public static String inWords(int number) {
        return switch (number) {
            case 0 -> "zero";
            case 1 -> "un";
            default -> "deux";
        };
    }
}

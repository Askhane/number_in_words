package fr.arolla.kata.numberinwords;

public class Number {
    public static String inWords(int number) {
        if (number == 0) {
            return "zero";
        }
        return "un";
    }
}

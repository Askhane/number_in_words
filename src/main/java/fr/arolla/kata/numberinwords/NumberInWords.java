package fr.arolla.kata.numberinwords;

public interface NumberInWords {

    static String of(int value) {
        NumberInWords number = NumberFactory.buildNumber(value);
        return number.inWords();
    }

    String inWords();

    int value();
}

package fr.arolla.kata.numberinwords;

public interface Number {

    static String inWords(int number) {
        return NumberFactory.createNumber(number).inWords();
    }

    String inWords();

}

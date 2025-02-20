package fr.arolla.kata.numberinwords;

public class NumberFactory {
    public static Number createNumber(int number) {
        if (number >= 17 && number <= 19) {
            return new CompoundNumber(number);
        }
        return new NamedNumber(number);
    }
}

package fr.arolla.kata.numberinwords;

public class NumberFactory {
    public static Number createNumber(int number) {
        if (number >= 17 && number <= 19) {
            return buildCompoundNumber(number);
        }
        return new NamedNumber(number);
    }

    private static CompoundNumber buildCompoundNumber(int number) {
        int unitDigit = getUnitDigit(number);
        return new CompoundNumber(createNumber(10), createNumber(unitDigit));
    }

    private static int getUnitDigit(int value) {
        return value % 10;
    }
}

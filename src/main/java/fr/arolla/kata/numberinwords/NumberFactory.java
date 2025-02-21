package fr.arolla.kata.numberinwords;

public class NumberFactory {
    public static NumberInWords buildNumber(int value) {
        if (value >= 17 && value <= 19) {
            return buildCompoundNumber(value);
        }
        return new NamedNumber(value);
    }

    private static CompoundNamedNumber buildCompoundNumber(int number) {
        int unitDigit = getUnitDigit(number);
        return new CompoundNamedNumber(buildNumber(10), buildNumber(unitDigit));
    }

    private static int getUnitDigit(int value) {
        return value % 10;
    }
}

package fr.arolla.kata.numberinwords;

public class NumberFactory {
    public static NumberInWords buildNumber(int value) {
        NamedNumber namedNumber = NamedNumber.of(value);
        if (namedNumber == null) {
            return buildCompoundNumber(value);
        }
        return namedNumber;
    }

    private static CompoundNamedNumber buildCompoundNumber(int value) {
        int unitDigit = getUnitDigit(value);
        int tens = value - unitDigit;
        return new CompoundNamedNumber(NamedNumber.of(tens), NamedNumber.of(unitDigit), value);
    }

    private static int getUnitDigit(int value) {
        return value % 10;
    }
}

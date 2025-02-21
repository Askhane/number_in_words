package fr.arolla.kata.numberinwords;

public class NumberFactory {
    public static NumberInWords buildNumber(int value) {
        NamedNumber namedNumber = NamedNumber.of(value);
        if (namedNumber == null) {
            return buildCompoundNumber(value);
        }
        return namedNumber;
    }

    private static CompoundNamedNumber buildCompoundNumber(int number) {
        int unitDigit = getUnitDigit(number);
        int tens = number - unitDigit;
        return new CompoundNamedNumber(NamedNumber.of(tens), NamedNumber.of(unitDigit));
    }

    private static int getUnitDigit(int value) {
        return value % 10;
    }
}

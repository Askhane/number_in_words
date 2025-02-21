package fr.arolla.kata.numberinwords;

import java.util.Map;

public record NamedNumber(String name) implements NumberInWords {

    private static final Map<Integer, NamedNumber> valueToNamedNumber = Map.ofEntries(
            entry(0, "zero"),
            entry(1, "un"),
            entry(2, "deux"),
            entry(3, "trois"),
            entry(4, "quatre"),
            entry(5, "cinq"),
            entry(6, "six"),
            entry(7, "sept"),
            entry(8, "huit"),
            entry(9, "neuf"),
            entry(10, "dix"),
            entry(11, "onze"),
            entry(12, "douze"),
            entry(13, "treize"),
            entry(14, "quatorze"),
            entry(15, "quinze"),
            entry(16, "seize"),
            entry(20, "vingt"),
            entry(30, "trente"),
            entry(40, "quarante"),
            entry(50, "cinquante"),
            entry(60, "soixante")
    );

    public static NamedNumber of(int value) {
        return valueToNamedNumber.get(value);
    }

    @Override
    public String inWords() {
        return name;
    }

    private static Map.Entry<Integer, NamedNumber> entry(int value, String name) {
        return Map.entry(value, new NamedNumber(name));
    }
}

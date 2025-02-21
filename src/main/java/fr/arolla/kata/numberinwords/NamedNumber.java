package fr.arolla.kata.numberinwords;

import java.util.Map;

public record NamedNumber(int value) implements NumberInWords {

    private static final Map<Integer, String> valueToNames = Map.ofEntries(
            Map.entry(0, "zero"),
            Map.entry(1, "un"),
            Map.entry(2, "deux"),
            Map.entry(3, "trois"),
            Map.entry(4, "quatre"),
            Map.entry(5, "cinq"),
            Map.entry(6, "six"),
            Map.entry(7, "sept"),
            Map.entry(8, "huit"),
            Map.entry(9, "neuf"),
            Map.entry(10, "dix"),
            Map.entry(11, "onze"),
            Map.entry(12, "douze"),
            Map.entry(13, "treize"),
            Map.entry(14, "quatorze"),
            Map.entry(15, "quinze"),
            Map.entry(16, "seize"),
            Map.entry(20, "vingt")
    );

    @Override
    public String inWords() {
        return valueToNames.get(value);
    }
}

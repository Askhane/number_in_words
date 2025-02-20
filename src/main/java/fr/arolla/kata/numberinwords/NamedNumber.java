package fr.arolla.kata.numberinwords;

public record NamedNumber(int value) implements Number {
    @Override
    public String inWords() {
        return switch (value) {
            case 0 -> "zero";
            case 1 -> "un";
            case 2 -> "deux";
            case 3 -> "trois";
            case 4 -> "quatre";
            case 5 -> "cinq";
            case 6 -> "six";
            case 7 -> "sept";
            case 8 -> "huit";
            case 9 -> "neuf";
            case 10 -> "dix";
            case 11 -> "onze";
            case 12 -> "douze";
            case 13 -> "treize";
            case 14 -> "quatorze";
            case 15 -> "quinze";
            case 16 -> "seize";
            case 20 -> "vingt";
            default -> null;
        };
    }
}

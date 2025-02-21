package fr.arolla.kata.numberinwords;

public record CompoundNamedNumber(NumberInWords leftNumber,
                                  NumberInWords rightNumber, int value) implements NumberInWords {

    public static final String HYPHEN = "-";
    public static final String AND = "et";

    @Override
    public String inWords() {
        String separator = HYPHEN;
        if (rightNumber.value() == 1) {
            separator = HYPHEN + AND + HYPHEN;
        }
        return leftNumber.inWords() + separator + rightNumber.inWords();
    }

}

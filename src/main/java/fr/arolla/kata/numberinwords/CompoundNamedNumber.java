package fr.arolla.kata.numberinwords;

public record CompoundNamedNumber(NumberInWords leftNumber,
                                  NumberInWords rightNumber) implements NumberInWords {

    @Override
    public String inWords() {
        return leftNumber.inWords() + "-" + rightNumber.inWords();
    }

}

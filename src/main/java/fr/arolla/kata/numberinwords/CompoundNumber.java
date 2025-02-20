package fr.arolla.kata.numberinwords;

public record CompoundNumber(Number leftNumber, Number rightNumber) implements Number {

    @Override
    public String inWords() {
        return leftNumber.inWords() + "-" + rightNumber.inWords();
    }

}

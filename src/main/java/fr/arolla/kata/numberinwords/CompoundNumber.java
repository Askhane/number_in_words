package fr.arolla.kata.numberinwords;

public record CompoundNumber(int value) implements Number {

    @Override
    public String inWords() {
        int unitDigit = getUnitDigit();
        String unitName = Number.inWords(unitDigit);
        String tensName = Number.inWords(10);
        return tensName + "-" + unitName;
    }


    private int getUnitDigit() {
        return value % 10;
    }

}

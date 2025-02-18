package org.example;

public record CompositeNumber(NumberName leftOperand, NumberName rightOperand) implements NumberName {
    @Override
    public String numberName() {
        return String.format("%s-%s", leftOperand, rightOperand);
    }

    @Override
    public String toString() {
        return numberName();
    }
}

package org.example;

public record CompositeNumberEt(PrimitiveNumberName leftOperand, NumberName rightOperand) implements NumberName {

    @Override
    public String numberName() {
        return String.format("%s-et-%s", leftOperand, rightOperand);
    }

    @Override
    public String toString() {
        return numberName();
    }
}

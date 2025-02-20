package fr.arolla.kata.numberinwords;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberInWordsTest {

    @Test
    public void shouldWriteZeroFor0() {
        assertThat(Number.inWords(0)).isEqualTo("zero");
    }

    @Test
    void shouldWriteUnFor1() {
        assertThat(Number.inWords(1)).isEqualTo("un");
    }
}
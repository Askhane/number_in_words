package fr.arolla.kata.numberinwords;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberInWordsTest {

    @CsvSource({
            "0,zero",
            "1,un",
            "2,deux"})
    @ParameterizedTest
    void shouldReturnDigitNameForUnits(int unit, String digitName) {
        assertThat(Number.inWords(unit)).isEqualTo(digitName);
    }


}
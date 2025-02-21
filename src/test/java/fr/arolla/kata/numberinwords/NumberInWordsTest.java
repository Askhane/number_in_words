package fr.arolla.kata.numberinwords;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class NumberInWordsTest {

    @CsvSource({
            "0,zero",
            "1,un",
            "2,deux",
            "3,trois",
            "4,quatre",
            "5,cinq",
            "6,six",
            "7,sept",
            "8,huit",
            "9,neuf"})
    @ParameterizedTest
    void shouldReturnDigitNameForOneDigitNumbers(int oneDigitNumber, String digitName) {
        assertThat(NumberInWords.of(oneDigitNumber)).isEqualTo(digitName);
    }

    @CsvSource({
            "10,dix",
            "11,onze",
            "12,douze",
            "13,treize",
            "14,quatorze",
            "15,quinze",
            "16,seize",
    })
    @ParameterizedTest
    void shouldReturnNumberNameForNamedNumbersFrom10To16(int namedNumber, String numberName) {
        assertThat(NumberInWords.of(namedNumber)).isEqualTo(numberName);
    }

    @CsvSource({
            "17,dix-sept",
            "18,dix-huit",
            "19,dix-neuf",
    })
    @ParameterizedTest
    void shouldReturnCompoundNameForNumbersFrom17to19(int number, String compoundName) {
        assertThat(NumberInWords.of(number)).isEqualTo(compoundName);
    }

    @CsvSource({
            "20,vingt",
            "30,trente",
    })
    @ParameterizedTest
    void shouldReturnNumberNameForSimpleTens(int number, String tensName) {
        assertThat(NumberInWords.of(number)).isEqualTo(tensName);
    }

    @CsvSource({
            "22,vingt-deux",
            "23,vingt-trois",
            "29,vingt-neuf",
    })
    @ParameterizedTest
    void shouldReturnCompoundNameForNumbersForSimpleTensNumber(int number, String compoundName) {
        assertThat(NumberInWords.of(number)).isEqualTo(compoundName);
    }

}
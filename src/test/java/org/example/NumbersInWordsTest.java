package org.example;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class NumbersInWordsTest {

    @ParameterizedTest
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
            "9,neuf"
    })
    public void should_write_unit_number_to_words(int number, String expected) {
        assertEquals(expected, NumbersInWords.convertToWords(number));
    }

    @ParameterizedTest
    @CsvSource({
            "10, dix",
            "11, onze",
            "12, douze",
            "13, treize",
            "14, quatorze",
            "15, quinze",
            "16, seize"
    })
    public void should_write_primitive_tens_number_to_words(int number, String expected) {
        assertEquals(expected, NumbersInWords.convertToWords(number));
    }

    @ParameterizedTest
    @CsvSource({
            "17, dix-sept",
            "18, dix-huit",
            "19, dix-neuf",
    })
    public void should_write_composite_tens_number_to_words(int number, String expected) {
        assertEquals(expected, NumbersInWords.convertToWords(number));
    }

    @ParameterizedTest
    @CsvSource({
            "20, vingt",
            "30, trente",
            "40, quarante",
            "50, cinquante",
            "60, soixante"
    })
    public void should_write_multiple_tens_number_to_words(int number, String expected) {
        assertEquals(expected, NumbersInWords.convertToWords(number));
    }

    @ParameterizedTest
    @CsvSource({
            "22, vingt-deux",
            "23, vingt-trois",
            "24, vingt-quatre",
            "29, vingt-neuf"
    })
    public void should_write_composite_twenties_number_to_words(int number, String expected) {
        assertEquals(expected, NumbersInWords.convertToWords(number));
    }

    @ParameterizedTest
    @CsvSource({
            "21, vingt-et-un",
            "31, trente-et-un",
            "41, quarante-et-un",
            "51, cinquante-et-un",
            "61, soixante-et-un",
            "71, soixante-et-onze",
    })
    public void should_write_composite_number_and_one_to_words(int number, String expected) {
        assertEquals(expected, NumbersInWords.convertToWords(number));
    }

    @ParameterizedTest
    @CsvSource({
            "32, trente-deux",
            "44, quarante-quatre",
            "53, cinquante-trois",
            "65, soixante-cinq",
    })
    public void should_write_others_composite_number_to_words(int number, String expected) {
        assertEquals(expected, NumbersInWords.convertToWords(number));
    }

    @ParameterizedTest
    @CsvSource({
            "70, soixante-dix",
            "72, soixante-douze",
            "73, soixante-treize",
            "77, soixante-dix-sept"
    })
    public void should_write_70_number_to_words(int number, String expected) {
        assertEquals(expected, NumbersInWords.convertToWords(number));
    }

}

package assignment2.ex27.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class InputValidatorTest {
    InputValidator test = new InputValidator();

    @Test
    void checkName_returns_a_0_if_input_is_acceptable() {

        int expected, actual;
        expected = 0;
        actual = test.checkName("John");

        assertEquals(expected, actual);
    }

    @Test
    void checkName_returns_a_2_if_input_is_not_filled_in() {

        int expected, actual;
        expected = 2;
        actual = test.checkName("T t");

        assertEquals(expected, actual);
    }

    @Test
    void checkName_returns_a_3_if_input_is_completely_wrong() {

        int expected, actual;
        expected = 3;
        actual = test.checkName(" ");

        assertEquals(expected, actual);
    }

    @Test
    void checkName_returns_a_2_if_input_is_too_short() {

        int expected, actual;
        expected = 1;
        actual = test.checkName("J");

        assertEquals(expected, actual);
    }

    @Test
    void checkZipCode_returns_4_if_input_is_not_an_int() {
        int expected, actual;
        expected = 4;
        actual = test.checkZipCode("ABCDE");

        assertEquals(expected, actual);
    }

    @Test
    void checkZipCode_returns_4_if_input_is_not_5_digits() {
        int expected, actual;
        expected = 4;
        actual = test.checkZipCode("123");

        assertEquals(expected, actual);
    }

    @Test
    void checkZipCode_returns_0_if_input_is_acceptable() {
        int expected, actual;
        expected = 0;
        actual = test.checkZipCode("55555");

        assertEquals(expected, actual);
    }

    @Test
    void checkID_returns_5_if_input_is_longer_than_expected() {
        int expected, actual;
        expected = 5;
        actual = test.checkID("A12-1234");

        assertEquals(expected, actual);
    }

    @Test
    void checkID_returns_0_if_input_is_acceptable() {
        int expected, actual;
        expected = 0;
        actual = test.checkID("TK-4321");

        assertEquals(expected, actual);
    }
}
package assignment2.ex37.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordGeneratorTest {
    PasswordGenerator test = new PasswordGenerator();

    @Test
    void addLetters_concatenates_string_correct_number_of_times() {
        String expected = "abcd";
        String actual = "";

        actual += test.addLetters(4);

        assertEquals(expected.length(), actual.length());
    }

    @Test
    void randChar_returns_an_actually_random_char() {
        String expected = "abcd";
        String actual = "";


        for(int i=0; i<4; i++){
            actual += test.randChar(1);
        }

        assertNotEquals(expected, actual);
    }

    @Test
    void randomizePassword_actually_randomizes_passwords() {
        String expected = "abcdefg12@#";
        String actual = test.randomizePassword("abcdefg12@#");

        assertNotEquals(expected, actual);
    }
}
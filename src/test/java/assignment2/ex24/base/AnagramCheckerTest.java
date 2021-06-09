package assignment2.ex24.base;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.*;

class AnagramCheckerTest {

    @ParameterizedTest
    @ValueSource(strings = {"note", "tone"})
    void isAnagram_returning_the_right_answer(String candidate) {
        //given
        AnagramChecker detector = new AnagramChecker();

        //when
        boolean actual = detector.isAnagram(candidate, "note");

        //then
        assertTrue(actual);
    }


    @ParameterizedTest
    @ValueSource(strings = {"note", "tone"})
    void isAnagram_returns_false_for_nonAnagrams(String candidate){
        //given
        AnagramChecker checker = new AnagramChecker();

        //when
        boolean actual = checker.isAnagram(candidate, "not");

        //then
        assertFalse(actual);
    }

    @Test
    void sortedWord() {
    }

    @Test
    void displayResult_is_returning_correct_string_if_words_are_anagrams(){
        //given
        AnagramChecker checker = new AnagramChecker();

        //when
        String expected = "\"note\" and \"tone\" are anagrams.";
        String actual  = checker.displayResult(checker.isAnagram("note", "tone"), "note", "tone");

        //then
        assertEquals(expected, actual);
    }
}
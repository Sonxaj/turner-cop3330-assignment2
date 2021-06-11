package assignment2.ex25.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PasswordCheckTest {
    App testApp = new App();
    PasswordCheck testPC = new PasswordCheck();

    @Test
    void passwordValidator_is_only_returning_a_1() {
        int expected = 1;
        int actual = testPC.passwordValidator("12345");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_is_only_returning_a_2() {
        int expected = 2;
        int actual = testPC.passwordValidator("abcxyz");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_is_only_returning_a_3() {
        int expected = 3; // maximum expected
        int actual = testPC.passwordValidator("abc123xyz");

        assertEquals(expected, actual);
    }

    @Test
    void passwordValidator_is_only_returning_a_4() {
        int expected = 4; // maximum expected
        int actual = testPC.passwordValidator("1337h@xor");

        assertEquals(expected, actual);
    }

    @Test
    void validationResult_prints_expected_text() {
        String expected = "The password '1337h@xor!' is a very strong password.";
        String actual = testPC.validationResult(testPC.passwordValidator("1337h@xor!"), "1337h@xor!");

        assertEquals(expected, actual);
    }
}
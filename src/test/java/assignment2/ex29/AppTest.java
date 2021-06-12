package assignment2.ex29;

import assignment2.ex29.base.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App test = new App();

    @Test
    void doMath_returns_correct_output() {
        int expected, actual;
        expected = 18;
        actual = test.doMath(4);

        assertEquals(expected, actual);
    }
}
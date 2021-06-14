package assignment2.ex38.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FilterValuesTest {
    FilterValues test = new FilterValues();

    @Test
    void inputToArray_takes_input_into_array() {

        int[] expected = new int[]{1, 2, 3, 4, 5, 6, 7, 8};
        int[] actual = test.inputToArray("1 2 3 4 5 6 7 8");

        assertArrayEquals(expected, actual);
    }
}
package assignment2.ex28.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;

class AppTest {
    App test = new App();

    @Test
    void sum_returns_the_actual_sum_of_inputs() {
        ArrayList<Integer> inputs = new ArrayList<>();

        for(int i=0; i<5; i++){
            inputs.add(i+1);
        }

        int expected = 15;
        int actual = test.sum(inputs);

        assertEquals(expected, actual);
    }
}
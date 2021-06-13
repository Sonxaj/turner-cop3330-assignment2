package assignment2.ex32.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GuessGameTest {

    GuessGame testg = new GuessGame();

    @Test
    void randNum_returns_a_random_number_within_intended_bounds() {
        int actual = testg.randNum(3);
        int flag = 0;

        if(actual > 1000 || actual < 1){
            flag++;
        }
        assertEquals(0, flag);
    }
}
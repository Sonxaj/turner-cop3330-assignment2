package assignment2.ex33.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App testb = new App();

    @Test
    void randNum_returns_int_in_range() {
        int actual = testb.randNum();
        int flag = 0;

        if(actual > 4){
            flag++;
        }
        assertEquals(0, flag);
    }
}
package assignment2.ex35.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App test = new App();

    @Test
    void randNum_returns_int_up_to_size_of_list() {
        List<String> testNames = new ArrayList<>();

        testNames.add("Homer");
        testNames.add("Lisa");
        testNames.add("Bart");

        int actual = test.randNum(testNames);
        int flag = 0;

        if(actual > testNames.size()){
            flag++;
        }
        assertEquals(0, flag);
    }
}
package assignment2.ex36.base;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class StatisticProcessorTest {
    App app = new App();
    StatisticProcessor test = new StatisticProcessor();
    List<Integer> data = new ArrayList<>(List.of(100, 200, 1000, 300));


    @Test
    void avg_returns_correct_value() {

        double actual = test.avg(data);
        assertEquals(400.0, actual);
    }

    @Test
    void min_returns_correct_value() {

        int actual = test.min(data);
        assertEquals(100, actual);
    }

    @Test
    void max_returns_correct_value() {

        int actual = test.max(data);
        assertEquals(1000, actual);
    }

    @Test
    void stDev_returns_correct_value() {

        double actual = test.stDev(data);
        assertEquals(353.55, actual);
    }
}
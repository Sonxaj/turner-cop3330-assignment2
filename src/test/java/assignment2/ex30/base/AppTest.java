package assignment2.ex30.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App test = new App();

    @Test
    void genTable() {
        int[][] testTable = new int[12][12];

        test.genTable(testTable);
    }
}
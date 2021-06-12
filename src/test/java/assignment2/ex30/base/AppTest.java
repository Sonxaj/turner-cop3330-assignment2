package assignment2.ex30.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App test = new App();

    @Test
    void genTable_creates_table_with_expected_outputs() {
        int[][] testTable = new int[12][12];

        int flag = 0;

        test.genTable(testTable);

        // search table
        for(int i = 0; i < 12; i++){
            for(int j = 0; j < 12; j++){

                if(!(testTable[i][j] == (i+1)*(j+1))){
                    flag = 1; // set flag if no match
                }
            }
        }

        assertEquals(0, flag);
    }
}
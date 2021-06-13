package assignment2.ex31;

import assignment2.ex31.base.App;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    App test = new App();

    @Test
    void genTable_creates_table_with_expected_outputs() {
        String[][] table = new String[11][2];

        int temp = 55;
        double temp2 = 0.55;

        int flag = 0;

        test.genTable(table, 65, 22);

        for(int i=2; i<11; i++){

            String intensityCheck = temp + "%";

            // value in table is either not the rolling intensity OR the rate
            if(!(table[i][0].equalsIgnoreCase(intensityCheck)) ||
                    !(table[i][1].equalsIgnoreCase(
                            Math.round((((220 - 22) - 65) * temp2) + 65) + " bpm"))
            ){
                flag = 1;
            }
            temp2 += 0.05;
            temp += 5;
        }

        assertEquals(0, flag);
    }
}
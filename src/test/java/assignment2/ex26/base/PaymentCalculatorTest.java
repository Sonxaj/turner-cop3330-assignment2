package assignment2.ex26.base;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PaymentCalculatorTest {
    App app = new App();
    PaymentCalculator test = new PaymentCalculator();

    @Test
    void calculateMonthsUntilPaidOff_returns_correct_num_of_months() {
        int expected = 70;
        int actual = test.calculateMonthsUntilPaidOff(5000, 12, 100);

        assertEquals(expected, actual);
    }

    @Test
    void genResult_returns_correct_text() {
        String expected = "It will take you 70 months to pay off this card.";
        String actual = test.genResult(
                test.calculateMonthsUntilPaidOff(5000, 12, 100)
        );

        assertEquals(expected, actual);
    }
}
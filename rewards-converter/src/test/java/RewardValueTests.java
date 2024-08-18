
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RewardValueTests {

    @Test
    public void create_with_cash_value() {
        //Test the conversion form cash to miles
        double cashValue = 100.0;
        var rewardValue = new RewardValue(cashValue);
        double expectedMilesValue = cashValue / 0.0035;
        assertEquals(expectedMilesValue, rewardValue.getMilesValue(), 0.001, "Cash to miles conversion failed");
    }

    @Test
    public void create_with_miles_value() {
        //Tests conversion from miles to cash
        int milesValue = 10000;
        var rewardValue = new RewardValue(milesValue);
        double expectedCashValue = milesValue * 0.0035;
        assertEquals(expectedCashValue, rewardValue.getCashValue(), 0.001, "Miles to cash conversion failed");
    }
    // Ensure these tests are included in the test suite
    @Test
    public void testCashConstructor() {
        double cashValue = 200.0;
        var rewardValue = new RewardValue(cashValue);
        assertEquals(cashValue, rewardValue.getCashValue(), "Cash value is incorrect");
    }

    @Test
    public void testMilesConstructor() {
        int milesValue = 50000;
        var rewardValue = new RewardValue(milesValue);
        assertEquals(milesValue, rewardValue.getMilesValue(), "Miles value is incorrect");
    }
}


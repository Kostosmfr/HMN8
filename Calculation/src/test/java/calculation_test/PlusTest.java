package calculation_test;

import calculation.OpPlus;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by K_PC-S on 27.07.2017.
 */
public class PlusTest {
    OpPlus plus = new OpPlus();

    @Test
    public void testPlus(){
        double expectedValue = 6.0000;
        double actualValue = plus.calculate(3,3);

        assertEquals(String.format("Expeted result id %s, but was %s", expectedValue,actualValue),expectedValue,actualValue,0.0);
    }
}

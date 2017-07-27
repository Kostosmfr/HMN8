package calculation_test;

import calculation.OpMinus;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
/**
 * Created by K_PC-S on 27.07.2017.
 */
public class MinusTest {
    OpMinus minus = new OpMinus();

    @Test
    public void testMinus(){
        double expectedValue = 10;
        double actualValue = minus.calculate(20.0504,10.0504);

        assertEquals(String.format("Expeted result id %s, but was %s", expectedValue,actualValue),expectedValue,actualValue,0.0);
    }
}

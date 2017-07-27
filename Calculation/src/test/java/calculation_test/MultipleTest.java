package calculation_test;

import calculation.OpMultiple;

import org.junit.Test;

import static junit.framework.TestCase.assertEquals;


/**
 * Created by K_PC-S on 27.07.2017.
 */
public class MultipleTest {

    @Test
    public void testMultiple(){
        OpMultiple multiple = new OpMultiple();
    double expectedValue = 121;
    double actualValue = multiple.calculate(11,11);

    assertEquals(String.format("Expeted result id %s, but was %s", expectedValue,actualValue),expectedValue,actualValue,0.0);

    }
}

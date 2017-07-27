package calculation_test;

import calculation.DivByZero;
import calculation.OpDivision;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by K_PC-S on 27.07.2017.
 */
public class DivisionTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @Before
    public void setUpStream() {
        System.setOut(new PrintStream(outContent));
    }

    @After
    public void clreanUpStream() {
        System.setOut(null);
    }

    @Test
    public void testDivision(){
        OpDivision division = new OpDivision();

        double expectedValue = 2.5;
        double actualValue = 0;
        try {
            actualValue = division.calculate(5, 2);
        }catch (DivByZero e){
            e.getMessage();
        }
        assertEquals(String.format("Expeted result id %s, but was %s", expectedValue,actualValue),expectedValue,actualValue,0.0);
    }

    @Test
    public void testDivisionByZero() {
        OpDivision division = new OpDivision();

        double testValue = 0;
        double actualValue = 0;
        try {
            testValue = division.calculate(10, 0);
        } catch (DivByZero e) {
            e.getMessage();
        }
        assertEquals("Division was successful", testValue, actualValue);
    }
}

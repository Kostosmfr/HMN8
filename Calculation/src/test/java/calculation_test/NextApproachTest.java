package calculation_test;


import calculation.Input;
import calculation.MyOperationFactory;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Scanner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/**
 * Created by K_PC-S on 27.07.2017.
 */
public class NextApproachTest {

    MyOperationFactory myOp = new MyOperationFactory();
    Input input = new Input(myOp);
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
    public void testNextApproachTrue(){

        Scanner sc = new Scanner("ш");

        String inputOperation = "/";
        double inputFirstParam = 50;
        double inputSecondParam = 10;

        input.inputOperation(inputOperation);
        input.setFirstArg(inputFirstParam);
        input.setSecondArg(inputSecondParam);
        input.calculate();

        assertTrue(input.nextApproach(sc));
    }

    @Test
    public void testNextApproachFalse(){

        Scanner sc = new Scanner("q");

        String inputOperation = "/";
        double inputFirstParam = 50;
        double inputSecondParam = 10;

        input.inputOperation(inputOperation);
        input.setFirstArg(inputFirstParam);
        input.setSecondArg(inputSecondParam);
        input.calculate();

        assertFalse(input.nextApproach(sc));
    }
}

package calculation_test;
import calculation.Input;
import calculation.MyOperationFactory;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static com.sun.xml.internal.ws.dump.LoggingDumpTube.Position.Before;
import static org.junit.Assert.assertEquals;

/**
 * Created by K_PC-S on 25.07.2017.
 */
public class InputTest {
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
    public void testAddition() {
        String inputOperation = "+";
        double inputFirstParam = 2;
        double inputSecondParam = 3;
        String result = "Результат операции + равняется 5,0000\n";

        input.inputOperation(inputOperation);
        input.setFirstArg(inputFirstParam);
        input.setSecondArg(inputSecondParam);
        input.calculate();

        assertEquals("Result of add is wrong", result, outContent.toString());
    }

    @Test
    public void testMinus() {
        String inputOperation = "-";
        double inputFirstParam = 10;
        double inputSecondParam = 5;
        String result = "Результат операции - равняется 5,0000\n";

        input.inputOperation(inputOperation);
        input.setFirstArg(inputFirstParam);
        input.setSecondArg(inputSecondParam);
        input.calculate();

        assertEquals("Result of minus is wrong", result, outContent.toString());
    }

    @Test
    public void testMultiple() {
        String inputOperation = "*";
        double inputFirstParam = 1;
        double inputSecondParam = 5;
        String result = "Результат операции * равняется 5,0000\n";

        input.inputOperation(inputOperation);
        input.setFirstArg(inputFirstParam);
        input.setSecondArg(inputSecondParam);
        input.calculate();

        assertEquals("Result of mult is wrong", result, outContent.toString());
    }

    @Test
    public void testDivision() {
        String inputOperation = "/";
        double inputFirstParam = 50;
        double inputSecondParam = 10;
        String result = "Результат операции / равняется 5,0000\n";

        input.inputOperation(inputOperation);
        input.setFirstArg(inputFirstParam);
        input.setSecondArg(inputSecondParam);
        input.calculate();

        assertEquals("Result of div is wrong", result, outContent.toString());
    }

   @Test
   public void testInputOperation(){

        String inputOperation = "2";
        String result = "Должны быть операции +, -, * или / Дальнейшие расчеты не верны!";

        input.inputOperation(inputOperation);

       assertEquals("Validation failed", result, outContent.toString());
    }



}

package calculation;
import com.sun.org.apache.xpath.internal.operations.Div;

import java.lang.ArithmeticException;

/**
 * Created by K_PC-S on 18.07.2017.
 */
public class OpDivision implements Operation {

    @Override
    public double calculate(double arg1, double arg2) throws DivByZero {
        if (arg2 == 0) {
            throw new DivByZero();
        }
        try {
            return (arg1 / arg2);
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
            return 0;
        }
    }
}






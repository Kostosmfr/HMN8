package calculation;

import java.lang.ArithmeticException;

/**
 * Created by K_PC-S on 18.07.2017.
 */
public class MyOperationFactory implements OperationFactory {

    char operationChar;
    Operation operation;

    @Override
    public Operation getOperation(char operationChar) {
        this.operationChar = operationChar;

            switch (this.operationChar) {
                case '+':
                    operation = new OpPlus();
                    break;
                case '-':
                    operation = new OpMinus();
                    break;
                case '*':
                    operation = new OpMultiple();
                    break;
                case '/':
                    operation = new OpDivision();
                    break;

            }
            return operation;
/*}catch (DivByZero e){
        System.out.println("Деление на ноль!");
    }*/

    }
}



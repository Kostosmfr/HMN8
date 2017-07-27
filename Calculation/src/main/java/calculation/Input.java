package calculation;

import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 * Created by K_PC-S on 18.07.2017.
 */
public class Input {
    String operationString;
    char operation;
    double arg1, arg2;
    MyOperationFactory myOpFactory;
    //Scanner sc = new Scanner(System.in);
    Operation op;

    public Input(MyOperationFactory myOpFactory){
        this.myOpFactory = myOpFactory;
    }

    /**
     * Ввод данный с консоли
     */
    public void inputOperation(String operationString) {


        this.operationString = operationString;
        if (String.valueOf(this.operationString.charAt(0)).matches("[-,+,*,/]+")) {
            this.operation = operationString.charAt(0);

            op = myOpFactory.getOperation(operation);


        }

        //!Тут выскакивает окно с ошибкой! Но может не выскочить по верх IDE!
        else System.out.print("Должны быть операции +, -, * или / Дальнейшие расчеты не верны!");
         //throw new IllegalArgumentException(err)
            /*if (String.valueOf(this.operationString.charAt(0)).matches("[a-z,A-z,0-9,'@!#%$;№=_^]+")) {
            JOptionPane.showMessageDialog(new JFrame(),
                    new NumberFormatException("\nДолжны быть операции +, -, * или /\n" + "Дальнейшие расчеты не верны!"),
                    "Ошибка", JOptionPane.ERROR_MESSAGE);
        }*/
    }

    public void setFirstArg(double arg1){
        this.arg1 = arg1;
    }

    public void setSecondArg(double arg2){
        this.arg2 = arg2;
    }

    public double getFirstArg(){
        return arg1;
    }

    public double getSecondArg(){
        return arg2;
    }

    public void calculate(){
        try {
            System.out.printf("Результат операции " + getOperation() + " равняется %.4f\n", op.calculate(this.getFirstArg(), this.getSecondArg()));
        } catch (DivByZero e) {
            System.out.println(e.getMessage());
        }

    }

    public char getOperation(){
        return operation;
    }

    public boolean nextApproach(Scanner sc){
        return !(sc.next().equals("q"));
    }
}

package calculation;

import java.util.Scanner;
/**
 * Created by K_PC-S on 18.07.2017.
 */
public class Calculation {

    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        double arg1, arg2;
        String operation;
        MyOperationFactory myOpFactory = new MyOperationFactory();


        Input in = new Input(myOpFactory);
        try {
            do {

                System.out.println("Введите операцию(+,-,*,/)");
                operation = sc.next();
                in.inputOperation(operation);

                System.out.println("Введите числа");
                System.out.print("Первое число ");
                arg1 = sc.nextDouble();

                in.setFirstArg(arg1);

                System.out.print("Второе число ");
                arg2 = sc.nextDouble();

                in.setSecondArg(arg2);
                in.calculate();
                //System.out.printf("Результат операции " + in.getOperation() + " равняется %.4f\n", op.calculate(this.arg1, this.arg2));
                System.out.println("Продолжить? 'q' - выход, 'остальные символы' - продолжить");

            } while (in.nextApproach(sc)) ;
        }catch(Exception e){
            System.out.println("Произошла ошибка ввода");

        }
        System.out.println("Выход");
    }
}

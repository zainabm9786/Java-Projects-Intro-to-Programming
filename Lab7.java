import java.util.*;

public class Lab7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        CalcOp calcOp = new Calculator();
        while (true) {
            System.out.println("0 - Exit\n" +
                    "1 - Addition\n" +
                    "2 - Subtraction\n" +
                    "3 - Multiplication\n" +
                    "4 - Division\n");
            System.out.print("Please Choose an Option: ");
            float x = sc.nextFloat();

            if (x == 0) {
                System.exit(0);
            }

            System.out.print("Please enter the first number: ");
            float num1 = sc.nextFloat();
            System.out.print("Please enter the second number: ");
            float num2 = sc.nextFloat();
            if (x == 1) {
                System.out.println(calcOp.add(num1, num2));

            } else if (x == 2) {
                System.out.println(calcOp.subtract(num1, num2));
            } else if (x == 3) {
                System.out.println(calcOp.multiply(num1, num2));
            } else {
                System.out.println(calcOp.divide(num1, num2));
            }
        }
    }
}

interface CalcOp {
    public float add(float x, float z);

    public float subtract(float x, float z);

    public float multiply(float x, float z);

    public float divide(float x, float z);

}

class Calculator implements CalcOp {


    @Override
    public float add(float x, float z) {
        return x+z;
    }

    @Override
    public float subtract(float x, float z) {
        return x-z;
    }

    @Override
    public float multiply(float x, float z) {
        return x*z;
    }

    @Override
    public float divide(float x, float z) {
        return x/z;
    }
}


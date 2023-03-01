import java.util.*;

public class Lab6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FibIteration FI = new FibIteration();
        FibFormula FF = new FibFormula();
        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        int x = sc.nextInt();

        System.out.println("Fib of " + x + " by iteration is: " + FI.calculate_fib(x));
        System.out.println("Fib of " + x + " by formula is: " + FF.calculate_fib(x));
    }
}

interface FindFib {
    public int calculate_fib(int a);
}

class FibIteration implements FindFib {
    int previous = 1;
    int sum = 0;
    int total2;
    int count = 0;

    @Override
    public int calculate_fib(int a) {
        if (a == 1 || a == 2) {
            return 1;
        } else {
            while (count != a) {
                //sum = previous + sum;
                total2 = sum + previous;
                previous = sum;
                sum = total2;
                count++;
            }
        }
        return sum;
    }
}

class FibFormula implements FindFib {

    @Override
    public int calculate_fib(int a) {
        double z = Math.pow(((1 + Math.sqrt(5)) / 2), a);
        double v = Math.pow(((1 - Math.sqrt(5)) / 2), a);
        double x = (z - v) / Math.sqrt(5);
        return (int) x;
    }
}

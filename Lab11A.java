import java.util.*;

public class Lab11A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int x = sc.nextInt();
        System.out.print("Enter number 2: ");
        int y = sc.nextInt();

        System.out.println("Min is " + minimum(x, y));
        System.out.println("Max is " + maximum(x, y));
        if (average(x, y) % 1 == 0) {
            System.out.println("Average is " + (int) average(x, y));
        } else {
            System.out.println("Average is " + average(x, y));
        }
    }

    public static int minimum(int a, int b) {
        int min = 0;
        if (a > b) {
            return b;
        } else if (b > a) {
            return a;
        }
        return min;
    }
    public static int maximum(int a, int b) {
        int max = 0;
        if (a > b) {
            return a;
        } else if (b > a) {
            return b;
        }
        return max;
    }
     public static float average(int a, int b) {
        float avg =(float)(a+b)/2;

        return avg;
    }

    }





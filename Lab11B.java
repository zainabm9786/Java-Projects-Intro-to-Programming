import java.util.*;

public class Lab11B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String yn;
        do {
            System.out.print("Enter width: ");
            double width = sc.nextDouble();
            System.out.print("Enter height: ");
            double height = sc.nextDouble();

            isValid(width, height);
            boolean valid = false;
            if (isValid(width, height) == true) {
                System.out.println("This is a valid rectangle");
                System.out.println("The area is: " + Area(width, height));
                System.out.println("The perimeter is: " + Perimeter(width, height));

            } else {
                System.out.println("This is an invalid rectangle\n");
            }
            System.out.print("Do you want to enter another width and height (Y/N)? : ");
            yn =sc.next();
            yn=yn.toUpperCase();
            System.out.println();

        }while(yn.equals("Y"));
        System.out.println("Program Ends");

        /*
        Enter width: 4.0
Enter height: 5.0
This is an invalid rectangle
Do you want to enter another width and height (Y/N)? : Y
Enter width: 20.0
Enter height: 15.0
This is a valid rectangle
The area is: 300.0
The perimeter is: 70.0
Do you want to enter another width and height (Y/N)? : N
Program Ends


        */


    }

    public static boolean isValid(double a, double b) {
        if (a + b >= 30) {/*
            boolean valid= Boolean.parseBoolean("true");*/
            return true;
        } else {
            return false;
        }
    }

    public static double Area(double a, double b) {
        double area =  a * b;
        return area;
    }

    public static double Perimeter(double a, double b) {
        double perimeter = 2*(a + b);
        return perimeter;
    }
}
import java.util.Scanner;

public class Lab10 {

    public static void main(String[] args) throws InvalidTimeException {
        String time1, time2;
        int timeOneFinal, timeTwoFinal;
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            time1 = sc.nextLine();
            timeOneFinal = convert(time1);

            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            time2 = sc.nextLine();
            timeTwoFinal = convert(time2);

            System.out.println("Difference in seconds: "+(timeTwoFinal-timeOneFinal));

        } catch (InvalidTimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static int convert(String s) throws InvalidTimeException {
        String[] x = s.split(":", 3);
        int[] newX = new int[x.length];
        if (x.length!=3){
            throw new InvalidTimeException("Enter valid time");
        }
        else {
            for (int i = 0; i < 3; i++) {
                newX[i] = Integer.parseInt(x[i]);
            }
        }


        if (newX[0] > 23) {
            throw new InvalidTimeException("Hour must be below 24");
        } else if (newX[0] < 0) {
            throw new InvalidTimeException("Hour must be 0 or greater");
        } else if (newX[1] >= 60) {
            throw new InvalidTimeException("Minutes must be less than 60");
        } else if (newX[1] < 0) {
            throw new InvalidTimeException("Minutes must be greater then of equal to 0");
        } else if (newX[2] >= 60) {
            throw new InvalidTimeException("Seconds must be less than 60");
        } else if (newX[2] < 0) {
            throw new InvalidTimeException("Seconds must be greater then of equal to 0");
        } else {
            return (newX[0] * 60 * 60) + (newX[1] * 60) + newX[2];
        }
    }

}

class InvalidTimeException extends Exception {
    InvalidTimeException(String x) {
        super(x);
    }

}

import java.util.*;

public class Lab5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x;
        Item[] array = new Item[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Please enter B for Book or P for Periodical");
            x = sc.nextLine();
            if (x.equalsIgnoreCase("p")) {
                System.out.println("Please enter the name of Periodical");
                String p = sc.nextLine();
                System.out.println("Please enter the issue number");
                int in = sc.nextInt();
                sc.nextLine();
                array[i] = new Periodical(in, p);
            } else if (x.equalsIgnoreCase("b")) {
                System.out.println("Please enter the name of the Book");
                String b = sc.nextLine();
                System.out.println("Please enter the author of the Book");
                String a = sc.nextLine();
                System.out.println("Please enter the ISBN of the Book");
                long isbn = sc.nextLong();
                sc.nextLine();
                array[i] = new Book(isbn, a, b);
            } else {
                i--;
            }
        }
        System.out.println("\nYour Items: ");
        for (int i=0;i< array.length;i++) {
            System.out.println(array[i].getListing()+"\n");
        }
    }
}

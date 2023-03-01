import java.util.*;

public class Lab4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float balance = 0.0f;
        Checking check = new Checking(balance);
        Savings save = new Savings(balance);
      //  Account a = new Account(balance);
        while (true) {
            System.out.println("1. Withdraw from Checking\n" +
                    "2. Withdraw from Savings\n" +
                    "3. Deposit to Checking\n" +
                    "4. Deposit to Savings\n" +
                    "5. Balance of Checking\n" +
                    "6. Balance of Savings\n" +
                    "7. Award Interest to Savings now\n" +
                    "8. Quit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("How much would you like to withdraw from Checking? ");
                    float w = sc.nextFloat();
                    check.withdrawal(w);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Savings?");
                    float with = sc.nextFloat();
                    save.withdrawal(with);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    float dep = sc.nextFloat();
                    System.out.println("Doing default deposit\n");
                    check.deposit(dep);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Savings?");
                    dep = sc.nextFloat();
                    save.deposit(dep);
                    break;
                case 5:
                    System.out.println( "Your balance for checking " + check.getAccount_number() + " is " + check.getBalance());
                    break;
                case 6:
                    System.out.println("Your balance for checking " + save.getAccount_number() + " is "
                                    + save.getBalance());
                    break;
                case 7:
                    save.interest();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please select one of the options above.");
            }
        }
    }
}

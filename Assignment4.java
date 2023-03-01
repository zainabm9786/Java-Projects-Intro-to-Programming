import java.util.*;

public class Assignment4 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Loan> loans = new ArrayList<>();
        while (true) {
            System.out.print("\n1 – Add Loan\n" +
                    "2 – Delete Loan\n" +
                    "3 – Calculate Monthly Payments\n" +
                    "4 – Print Loans\n" +
                    "5 – Exit\n" +
                    "Enter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addLoan(loans);
                    break;
                case 2:
                    deleteLoan(loans);
                    break;
                case 3:
                    calculateMonthlyLoanPayment(loans);
                    break;
                case 4:
                    printLoans(loans);
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error: Please enter valid input");
                    break;

            }
        }
    }

    public static void addLoan(ArrayList<Loan> loans) {
        System.out.println("Enter Loan Type (1 – Student, 2 – Auto):");
        int SA = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Customer Name: ");
        String name = sc.nextLine();
        System.out.println("Enter Loan Amount:  ");
        double loan = sc.nextDouble();
        System.out.println("Enter Interest Rate: ");
        double interest = sc.nextDouble();
        System.out.println("Enter Number of Monthly Payments: ");
        int mp = sc.nextInt();
        if (SA == 1) {
            System.out.println("Is Loan Deferred? (Y or N) ");
            String yn = sc.next();
            yn = yn.toLowerCase(Locale.ROOT);
            if (yn == "y") { //boolean isdeffered==true
                loans.add(new StudentLoan(name, loan, interest, mp, true));
            } else {// isdefrred==false
                loans.add(new StudentLoan(name, loan, interest, mp, false));
            }
        } else {// SA==2
            System.out.println("Enter Amount of Down Payment: ");
            double down = sc.nextDouble();
            loans.add(new AutoLoan(name, loan, interest, mp, down));
        }
    }

    public static void deleteLoan(ArrayList<Loan> loans) {
        sc.nextLine();
        System.out.print("Enter Customer Name: ");
        String name = sc.nextLine();
        for (int i = 0; i < loans.size(); i++) {
            if (loans.get(i).getCustomerName().equalsIgnoreCase(name)) {
                loans.remove(i);
                Loan.decreaseNumberOfLoans();
            }
        }
    }

    public static void calculateMonthlyLoanPayment(ArrayList<Loan> loans) {
        for (Loan l : loans) {
            l.calculateMonthlyPayment();
        }
    }

    public static void printLoans(ArrayList<Loan> loans) {
        for (Loan l : loans) {
            System.out.println(l.toString() + "\n");
        }
    }
}

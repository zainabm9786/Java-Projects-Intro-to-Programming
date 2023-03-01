import java.util.*;

public class Assignment5 {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<InsurancePolicy> insurancePolicies = new ArrayList<>();
        while (true) {
            System.out.println("\n1 – Create Health Insurance Policy\n" +
                    "2 – Create Term-Life Insurance Policy\n" +
                    "3 – Exit\n\n" +
                    "Enter Choice:");
            int choice = sc.nextInt();
            if (choice == 1) {
                sc.nextLine();
                System.out.println("Enter name of policy holder:");
                String name = sc.nextLine();
                System.out.println("Enter deductible amount: ");
                double amount = sc.nextDouble();
                System.out.println("Enter co-payment amount:");
                double co = sc.nextDouble();
                System.out.println("Enter total out-of-pocket amount:");
                double oop = sc.nextDouble();
                insurancePolicies.add(new HealthInsurancePolicy(name, co, amount, oop));
            } else if (choice == 2) {
                sc.nextLine();
                System.out.println("Enter name of policy holder: ");
                String name = sc.nextLine();
                System.out.println("Enter name of beneficiary: ");
                String ben = sc.nextLine();
                System.out.println("Enter number of years in term: ");
                int years = sc.nextInt();
                System.out.println("Enter amount of payout: ");
                double payout = sc.nextDouble();
                insurancePolicies.add(new TermLifeInsurance(name, ben, years, payout));
            } else if (choice == 3) {
                for (InsurancePolicy i : insurancePolicies) {
                    System.out.println(i.toString());
                }

                System.exit(0);
            } else {
                System.out.println("Error: Please Enter Valid Input");
            }
        }
    }
}

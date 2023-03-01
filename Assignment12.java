import java.util.Scanner;

public class Assignment12 {
    public static void main(String[] args) {
        JobLeadsList jobLeadsList = new JobLeadsList();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1 – Add lead to head of list \n" +
                    "2 – Add lead to tail of list " +
                    "\n3 – Delete a lead " +
                    "\n4 – Print list from head to tail " +
                    "\n5 – Print list from tail to head \n6 – Exit \n\nEnter Choice: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    sc.nextLine();
                    System.out.print("Enter Company Name: ");
                    String compName = sc.nextLine();
                    System.out.print("Enter Contact Person Name: ");
                    String contactPerson = sc.nextLine();
                    System.out.print("Enter Contact Person Phone: ");
                    String contactPersonPhone = sc.nextLine();
                    System.out.print("Enter Job Title: ");
                    String jobTitle = sc.nextLine();
                    System.out.println("Enter Job Description: ");
                    String jobDes = sc.nextLine();
                    jobLeadsList.add_to_front(compName, contactPerson, contactPersonPhone, jobTitle, jobDes);
                    break;
                case 2:
                    sc.nextLine();
                    System.out.print("Enter Company Name: ");
                    compName = sc.nextLine();
                    System.out.print("Enter Contact Person Name: ");
                    contactPerson = sc.nextLine();
                    System.out.print("Enter Contact Person Phone: ");
                    contactPersonPhone = sc.nextLine();
                    System.out.print("Enter Job Title: ");
                    jobTitle = sc.nextLine();
                    System.out.println("Enter Job Description: ");
                    jobDes = sc.nextLine();
                    jobLeadsList.add_to_tail(compName, contactPerson, contactPersonPhone, jobTitle, jobDes);
                    break;
                case 3:
                    sc.nextLine();
                    System.out.print("Enter Company Name: ");
                    compName = sc.nextLine();
                    System.out.print("Enter Job Title: ");
                    jobTitle = sc.nextLine();
                    jobLeadsList.remove_lead(compName, jobTitle);
                    break;
                case 4:
                    sc.nextLine();
                    jobLeadsList.print_head_to_tail();
                    break;
                case 5:
                    sc.nextLine();
                    jobLeadsList.print_tail_to_head();
                    break;
                case 6:
                    System.exit(0);
                    break;
                default:
                    sc.nextLine();
                    System.out.println("Error: Please enter a valid choice (1 thru 6) ");
                    break;
            }
        }
    }
}

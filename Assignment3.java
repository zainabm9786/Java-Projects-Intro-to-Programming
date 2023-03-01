import java.util.*;

public class Assignment3 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ArrayList<Faculty> facultyArrayList = new ArrayList<Faculty>();
        int choice;
        while (true) {
            System.out.print("\n1 – Add Faculty\n" +
                    "2 – Delete Faculty\n" +
                    "3 – Calculate Faculty Pay\n" +
                    "4 – Print Faculty\n" +
                    "5 – Exit\n" +
                    "\nEnter Choice: ");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    addFaculty(facultyArrayList);
                    System.out.println("");
                    break;
                case 2:
                    removeFaculty(facultyArrayList);
                    System.out.println("");
                    break;

                case 3:
                    calculateFacultyPay(facultyArrayList);
                    System.out.println("");
                    break;
                case 4:
                    printFaculty(facultyArrayList);
                    System.out.println("");
                    break;
                case 5:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Error: Please Enter Valid Input");
                    break;
            }
        }
    }


    public static void addFaculty(ArrayList<Faculty> facultyArrayList) { // this is how to take Arraylist in a Parameter (for me)
        sc.nextLine();
        System.out.println("Enter Employee Name:");
        String name = sc.nextLine();
        name = name.trim();
        System.out.println("Enter Weekly Salary:");
        double sal = sc.nextDouble();
        System.out.println("Enter Weekly Stipend: ");
        double stip = sc.nextDouble();
        facultyArrayList.add(new Faculty(name, sal, stip)); //FIX THIS
    }

    public static void removeFaculty(ArrayList<Faculty> facultyArrayList) {
        sc.nextLine();
        System.out.print("Enter Employee Name:");
        String name = sc.nextLine();
        name = name.trim();
for (int i=0;i<facultyArrayList.size();i++){
    if (facultyArrayList.get(i).getName().equalsIgnoreCase(name)) {
        facultyArrayList.remove(i);
        Faculty.decreaseNumberOfEmployees();
    }
}

    }

    public static void calculateFacultyPay(ArrayList<Faculty> facultyArrayList) {
        for (Faculty faculty : facultyArrayList) {
            faculty.calculateWeeklyPay();
        }
    }
    public static void printFaculty(ArrayList<Faculty> facultyArrayList){
        for (Faculty faculty : facultyArrayList) {
            System.out.println(faculty.toString());
        }
    }
}

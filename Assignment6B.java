import java.util.*;

public class Assignment6B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.print("How large should the array be? ");
        int size = sc.nextInt();
        int array[] = new int[size];
        System.out.print("What should be the highest number in the sequence? ");
        int high = sc.nextInt();
        int random = rand.nextInt(high + 1);
        System.out.println();
        int i = 0;
        for (i = 0; i < array.length; i++) {
            random = rand.nextInt(high + 1);
            array[i] = random;
            System.out.print(array[i] + ", ");

        }
        while (true) {
        System.out.println();
        System.out.println("\n[Options]\n" + "1) Reset the array\n" + "2) Sort (Smallest to Largest)\n" + "3) Sort (Largest to Smallest)\n" + "4) Quit");
        System.out.print("Choice? ");
        int choice = sc.nextInt();


            switch (choice) {
                case 1:
                    System.out.println("\nResetting the array:");
                    for (i = 0; i < array.length; i++) {
                        random = rand.nextInt(high + 1);
                        array[i] = random;
                        System.out.print(array[i] + ", ");

                    }
                    break;

                case 2:
                    System.out.println("\nUsing Insertion Sort: ");
                    for (int index = 1; index < array.length; index++) {
                        int key = array[index];
                        int position = index - 1;
                        //  Shift larger values to the right
                        while (position >= 0 && array[position] > key) {
                            array[position + 1] = array[position];
                            position--;
                        }
                        array[position + 1] = key;
                    }
                        for (i = 0; i < array.length; ++i) {
                            System.out.print(array[i] + ", ");
                        }

                    break;

                case 3:
                    System.out.println("\nUsing Selection Sort: ");
                    for ( i = 0; i < array.length-1; i++)
                    {
                        // Find the minimum element in unsorted array
                        int min_idx = i;
                        for (int j = i+1; j < array.length; j++)
                            if (array[j] < array[min_idx])
                                min_idx = j;

                        // Swap the found minimum element with the first
                        // element
                        int temp = array[min_idx];
                        array[min_idx] = array[i];
                        array[i] = temp;
                    }
                    int n = array.length;
                    for (i=array.length-1; i > 0; i--){
                        System.out.print(array[i]+", ");
            }


                    break;
                case 4:
                    System.out.println("Closing out...");
                    System.exit(0);
                    break;
            }
       /* How large should the array be? 10
        What should be the highest number in the sequence? 6
        5, 2, 2, 2, 3, 0, 1, 6, 2, 1,
[Options]
        1) Reset the array
        2) Sort (Smallest to Largest)
        3) Sort (Largest to Smallest)
        4) Quit
        Choice? 2
        Using Insertion Sort:
        0, 1, 1, 2, 2, 2, 2, 3*/
        }
    }

}

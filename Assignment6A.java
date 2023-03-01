import java.util.*;

public class Assignment6A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        System.out.println("Comparing Linear Search and Binary Search: ");
        int array[] = new int[1000000];
        int target = rand.nextInt(array.length - 1);
        int i;

        for (i = 0; i < array.length; i++) {
            array[i] = i;
        }

        target = rand.nextInt(array.length - 1);
        System.out.println("Our target is " + target);
        int count = 1;
        int count2 = 1;

        // linear
        boolean isFound = false;
        for (i = 0; i < array.length; i++) {
            // If we find a match, set isFound to true and BREAK
            if (array[i] == target) {
                isFound = true;
                break;
            }
            count++;
        }

        // binary
        int low = 0, mid = 0;
        int high = array.length - 1;
        boolean found = false;

        while (high >= low) {
            mid = (low + high) / 2;
            if (target < array[mid]) {
                high = mid - 1;
            } else if (target == array[mid]) {
                found = true;
                break;
            } else
                low = mid + 1;
            count2++;
        }
        System.out.println("Linear Search: " + count + " loop(s)");
        System.out.println("Binary Search: " + count2 + " guess(es)");
        if (count < count2) {
            System.out.println("Linear Search is faster this time!");
        } else {
            System.out.println("Binary Search is faster this time!");
        }
    }
}

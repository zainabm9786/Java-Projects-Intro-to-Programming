import java.util.*;

public class Assignment6C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int x;
        int y;
        int count = 0;

        while (true) {
            System.out.println("[Minesweeper – DOS Edition]");
            System.out.print("What is the grid size? ");
            int grid = sc.nextInt();

            String array[][] = new String[grid][grid];
            int randomX = rand.nextInt(grid);
            int randomY = rand.nextInt(grid);
            System.out.println(randomX + " " + randomY);
            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[0].length; j++) {
                    array[i][j] = "?";
                    System.out.print(array[i][j]);
                }
                System.out.println();
            }
            do {
               do {
                   System.out.print("\nEnter your X coordinate: ");
                   x = sc.nextInt();

                   System.out.print("Enter your Y coordinate: ");
                   y = sc.nextInt();
               }while (x==grid || y==grid);

                if (x == randomX && y == randomY) {
                    array[y][x] = "X";
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[0].length; j++) {
                            System.out.print(array[i][j]);
                        }
                        System.out.println();
                    }
                    System.out.println("\nSorry, you hit a mine!");
                    System.exit(0);
                }
                else {
                    array[y][x] = "_";
                    for (int i = 0; i < array.length; i++) {
                        for (int j = 0; j < array[0].length; j++) {
                            System.out.print(array[i][j]);
                        }
                        System.out.println();
                    }

                    //linear search if _=grid win
                    boolean isFound = false;
                    count++;
                    for (int i = 0; i < array.length; i++) {
                        for (int j=0; j<array[0].length; j++) {
                            if (count == grid) {
                                isFound = true;
                                System.out.println("\nYou win!\n");
                                System.exit(0);
                                break;
                            }
                        }
                    }

                }
            } while (x != randomX || y != randomY);
            System.out.println("\nGame over.\n");
        }

    }
}

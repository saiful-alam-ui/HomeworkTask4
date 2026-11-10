package lt.vcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        File file = new File("duomenys.txt");

        try (Scanner scanner = new Scanner(file)) {
            if (!scanner.hasNextInt()) {
                System.out.println(0);
                return;
            }

            int n = scanner.nextInt();
            
            // If there's 1 or fewer numbers, no left neighbors exist
            if (n <= 1 || !scanner.hasNextInt()) {
                System.out.println(0);
                return;
            }

            // Read the first number to serve as the initial "left neighbor"
            int previous = scanner.nextInt();
            int count = 0;

            // Loop through the remaining n - 1 numbers
            for (int i = 1; i < n; i++) {
                if (scanner.hasNextInt()) {
                    int current = scanner.nextInt();

                    // Compare current number with its left neighbor
                    if (current < previous) {
                        count++;
                    }

                    // Move to the next number
                    previous = current;
                }
            }

            // Print the total count
            System.out.println(count);

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
        }
    }
}

package lt.vcd;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        File file = new File("duomenys.txt");

        try (Scanner scanner = new Scanner(file)) {
            // Check if file has any content
            if (!scanner.hasNextInt()) {
                System.out.println("No negative temperatures recorded");
                return;
            }

            int n = scanner.nextInt();
            int negativeCount = 0;

            // Read the n temperature values
            for (int i = 0; i < n; i++) {
                if (scanner.hasNextInt()) {
                    int temp = scanner.nextInt();
                    if (temp < 0) {
                        negativeCount++;
                    }
                }
            }

            // Display results
            if (negativeCount > 0) {
                System.out.println(negativeCount);
            } else {
                System.out.println("No negative temperatures recorded");
            }

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + file.getName());
        }
    }
}

package lt.vcd;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read inputs with prompts
        System.out.print("Enter p: ");
        int p = scanner.nextInt();

        System.out.print("Enter s: ");
        int s = scanner.nextInt();

        System.out.print("Enter m: ");
        int m = scanner.nextInt();

        // Calculate weeks required
        int k;
        if (s >= p) {
            k = 0;
        } else {
            int remaining = p - s;
            k = (remaining + m - 1) / m; // Ceiling division
        }

        // Print output
        System.out.println("k = " + k);

        scanner.close();
    }
}

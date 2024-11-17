import java.util.Scanner;

public class Code5_FibonacciSequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter the number of terms (n): ");
        int n = scanner.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Create an array to store the Fibonacci sequence
            int[] fibonacci = new int[n];

            // Generate Fibonacci sequence
            for (int i = 0; i < n; i++) {
                if (i == 0) {
                    fibonacci[i] = 0;
                } else if (i == 1) {
                    fibonacci[i] = 1;
                } else {
                    fibonacci[i] = fibonacci[i - 1] + fibonacci[i - 2];
                }
            }

            // Print the Fibonacci sequence
            System.out.print("Fibonacci sequence: ");
            for (int term : fibonacci) {
                System.out.print(term + " ");
            }
        }

        scanner.close();
    }
}
//Author - Anshu Kumar
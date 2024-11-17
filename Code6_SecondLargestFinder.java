import java.util.Scanner;

public class Code6_SecondLargestFinder {

    // Method to find the second largest number in an array
    public static int findSecondLargest(int[] arr) {
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest; // Update second largest
                largest = num;           // Update largest
            } else if (num > secondLargest && num != largest) {
                secondLargest = num;     // Update second largest
            }
        }

        return secondLargest;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the number of integers
        System.out.print("Enter the number of integers (n): ");
        int n = scanner.nextInt();

        if (n < 2) {
            System.out.println("You need at least 2 numbers to find the second largest.");
        } else {
            // Input numbers into the array
            int[] numbers = new int[n];
            System.out.println("Enter " + n + " integers:");
            for (int i = 0; i < n; i++) {
                System.out.print("Number " + (i + 1) + ": ");
                numbers[i] = scanner.nextInt();
            }

            // Find and display the second largest number
            int secondLargest = findSecondLargest(numbers);
            if (secondLargest == Integer.MIN_VALUE) {
                System.out.println("All numbers are the same. No second largest number.");
            } else {
                System.out.println("The second largest number is: " + secondLargest);
            }
        }

        scanner.close();
    }
}
//Author - Anshu Kumar

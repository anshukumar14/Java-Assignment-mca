import java.util.Scanner;

public class Code2_PrimeNumbersInArray {

    // Method to check if a number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) { // Check divisors up to the square root of num
            if (num % i == 0) {
                return false; // If divisible, not prime
            }
        }
        return true; // Otherwise, it's prime
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] numbers = new int[10];

        // Input 10 integers from the user
        System.out.println("Enter 10 integers:");
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Print prime numbers from the array
        System.out.println("Prime numbers in the array are:");
        for (int num : numbers) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

        scanner.close();
    }
}
//Author - Anshu Kumar

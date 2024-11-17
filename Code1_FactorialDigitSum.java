import java.util.Scanner;

public class Code1_FactorialDigitSum {

    // Method to calculate factorial
    public static long calculateFactorial(int n) {
        long factorial = 1;
        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }

    // Method to calculate the sum of digits of a number
    public static int sumOfDigits(long number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10; // Get the last digit
            number /= 10;       // Remove the last digit
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input from user
        System.out.print("Enter an integer: ");
        int num = scanner.nextInt();

        if (num < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } else {
            // Calculate factorial
            long factorial = calculateFactorial(num);
            System.out.println("Factorial of " + num + " is: " + factorial);

            // Calculate sum of digits
            int digitSum = sumOfDigits(factorial);
            System.out.println("Sum of the digits of the factorial is: " + digitSum);
        }

        scanner.close();
    }
}
//Author - Anshu Kumar
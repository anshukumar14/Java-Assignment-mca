import java.util.Scanner;

public class Code9_FloydsTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of rows for Floyd's Triangle
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        int number = 1; // Starting number of the triangle

        // Loop to generate Floyd's Triangle
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // Increment the number
            }
            System.out.println(); // Move to the next row
        }

        scanner.close();
    }
}
//Author - Anshu Kumar

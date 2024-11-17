import java.util.Scanner;

public class Code8_InvertedTriangle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of rows for the inverted triangle
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Loop to generate the inverted triangle
        for (int i = n; i >= 1; i--) {
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
//Author - Anshu Kumar
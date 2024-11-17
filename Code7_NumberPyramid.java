import java.util.Scanner;

public class Code7_NumberPyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input: number of rows for the pyramid
        System.out.print("Enter the number of rows: ");
        int n = scanner.nextInt();

        // Loop to generate the pyramid
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
//Author - Anshu Kumar

import java.util.Scanner;

public class Code10_CharacterCount {
    
    // Method to count occurrences of a character in a string
    public static int countCharacterOccurrences(String str, char ch) {
        int count = 0;
        
        // Loop through the string and count the occurrences of the character
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ch) {
                count++;
            }
        }
        
        return count;
    }

    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner scanner = new Scanner(System.in);
        
        // Taking string input
        System.out.print("Enter a string: ");
        String inputString = scanner.nextLine();
        
        // Taking character input to search for
        System.out.print("Enter a character to search for: ");
        char characterToSearch = scanner.next().charAt(0);
        
        // Call the method to count the occurrences
        int occurrences = countCharacterOccurrences(inputString, characterToSearch);
        
        // Display the result
        System.out.println("The character '" + characterToSearch + "' appears " + occurrences + " times in the string.");
        
        // Close the scanner
        scanner.close();
    }
}
//Author - Anshu Kumar

import java.util.Scanner;

public class Program9 {
    // Program to check if a string is a pangram (a sentence containing all the alphabets)
    public static void main(String[] args) {
        // Create Scanner object to take user input
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter the string to check pangram");

        // Convert the input string to a character array
        char[] a = sc.nextLine().toCharArray();

        int i, j, k;
        int count = 0;

        // Loop through ASCII values of A-Z and a-z
        for (i = 65, j = 97; i <= 90; i++, j++) {
            for (k = 0; k < a.length; k++) {
                // If character matches uppercase or lowercase alphabet
                if (i == a[k] || j == a[k]) {
                    count++;
                    break; // Avoid counting duplicates
                }
            }
        }

        // Check if all 26 alphabets are present
        if (count == 26) {
            System.out.println("It's a pangram");
        } else {
            System.out.println("It's not a pangram");
        }
    }
}

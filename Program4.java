// Program to reverse a string entered by the user

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        // This program reverses a string entered by the user

        // Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.println("Enter a string to reverse:");

        // Convert input string to character array
        char[] a = sc.nextLine().toCharArray();

        // Initialize two pointers: i at start, j at end
        int i, j;
        for (i = 0, j = a.length - 1; i < j; i++, j--) {
            // Swap characters at position i and j
            char c = a[i];
            a[i] = a[j];
            a[j] = c;
        }

        // Print the reversed character array as string
        System.out.println("Reversed string is: ");
        System.out.println(a);
    }
}

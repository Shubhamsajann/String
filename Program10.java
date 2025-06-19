// Program to count the number of vowels in a given sentence
import java.util.Scanner;

public class Program10 {
    public static void main(String[] args) {
        // Program to count the number of vowels in a given sentence

        // Create Scanner object to take user input
        Scanner sc = new Scanner(System.in);
        int count = 0;

        System.out.println("Enter the string to count number of vowels in the sentence");

        // Convert the input string to a character array
        char[] a = sc.nextLine().toCharArray();

        // Loop through each character and check if it is a vowel
        for (int i = 0; i < a.length; i++) {
            if (a[i] == 'a' || a[i] == 'e' || a[i] == 'i' || a[i] == 'o' || a[i] == 'u' ||
                a[i] == 'A' || a[i] == 'E' || a[i] == 'I' || a[i] == 'O' || a[i] == 'U') {
                count++;
            }
        }

        // Print the total count of vowels
        System.out.println("Number of vowels: " + count);
    }
}

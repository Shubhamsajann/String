import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.println("Enter the string to print penultimate word");

        // Read the input string and convert it to a character array
        char a[] = sc.nextLine().toCharArray();

        int count = 0;
        int i;

        // Loop from the end of the character array to count spaces
        for (i = a.length - 1; i >= 0; i--) {
            if (a[i] == ' ') {
                count++;
            }

            // Break when the second space from the end is found
            if (count == 2) {
                break;
            }
        }

        // Move index to the start of the penultimate word
        i = i + 1;

        // Print characters until the next space is encountered
        while (i < a.length && a[i] != ' ') {
            System.out.print(a[i]);
            i++;
        }
    }
}

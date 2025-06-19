import java.util.Scanner;

public class Program6 {
    public static void main(String[] args) {
        // Create Scanner object to read input from user
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to check palindrome");

        // Read input string and convert to character array
        char a[] = sc.nextLine().toCharArray();

        // Print the input string
        System.out.println("Input string is: " + new String(a));

        // Initialize pointers and a flag to check for palindrome
        int i, j;
        int mark = 0;

        // Check if string is a palindrome
        for (i = 0, j = a.length - 1; i < j; i++, j--) {
            if (a[i] != a[j]) {
                mark = 1;
            }
        }

        // Output the result
        if (mark == 0) {
            System.out.println("It's a palindrome");
        } else {
            System.out.println("It's not a palindrome");
        }
    }
}

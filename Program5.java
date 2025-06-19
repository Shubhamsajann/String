import java.util.Scanner;

public class Program5 {
    public static void main(String[] args) {
        // Scanner to read user input
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the string to sort:");
        // Convert the input string to a character array
        char[] a = sc.nextLine().toCharArray();

        int i, j;

        // Outer loop for number of passes
        for (j = 0; j < a.length; j++) {
            // Inner loop for comparing adjacent characters
            for (i = 0; i < a.length - 1; i++) {
                // Swap if characters are out of order
                if (a[i] > a[i + 1]) {
                    char c = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = c;
                }
                // Print the array after each swap in the inner loop
                System.out.println("Step " + (i + 1) + " in pass " + (j + 1) + ": " + new String(a));
            }
            // Print the array after each pass
            System.out.println("After pass " + (j + 1) + ": " + new String(a));
        }

        // Print the final sorted array
        System.out.println("Sorted result: " + new String(a));
    }
}

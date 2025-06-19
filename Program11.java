import java.util.Scanner;

public class Program11 {

    // Program to check if two strings are equal
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read the first string and convert it to a character array
        char[] a = sc.nextLine().toCharArray();

        // Read the second string and convert it to a character array
        char[] b = sc.nextLine().toCharArray();

        int mark = 0; // Flag to mark if strings are not equal

        // Check if lengths are not equal
        if (a.length != b.length) {
            mark = 1;
        } else {
            // Compare characters one by one
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    mark = 1;
                }
            }
        }

        // Print result based on comparison
        if (mark == 0) {
            System.out.println("Equals");
        } else {
            System.out.println("Not equals");
        }
    }
}

import java.util.Scanner;

// Program to check whether two strings are anagrams of each other
public class Program8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt user to enter two strings
        System.out.println("Enter two strings to check if they are anagrams:");
        char[] a = sc.nextLine().toCharArray();
        char[] b = sc.nextLine().toCharArray();

        int mark = 0;

        // Check if lengths are different
        if (a.length != b.length) {
            mark = 1;
        } else {
            // Sort first character array
            for (int j = 0; j < a.length; j++) {
                for (int i = 0; i < a.length - 1; i++) {
                    if (a[i] > a[i + 1]) {
                        char temp = a[i];
                        a[i] = a[i + 1];
                        a[i + 1] = temp;
                    }
                }
            }

            // Sort second character array
            for (int j = 0; j < b.length; j++) {
                for (int i = 0; i < b.length - 1; i++) {
                    if (b[i] > b[i + 1]) {
                        char temp = b[i];
                        b[i] = b[i + 1];
                        b[i + 1] = temp;
                    }
                }
            }

            // Compare sorted arrays
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    mark = 1;
                    break;
                }
            }
        }

        // Print result
        if (mark == 0) {
            System.out.println("It's an anagram");
        } else {
            System.out.println("It's not an anagram");
        }
    }
}

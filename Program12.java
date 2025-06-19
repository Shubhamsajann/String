import java.util.Scanner;

public class Program12 {
    // Method to reverse characters in a given string and print it
    public static void reverse(String s) {
        char[] a = s.toCharArray();
        int i, j;
        for (i = 0, j = a.length - 1; i < j; i++, j--) {
            char c = a[i];
            a[i] = a[j];
            a[j] = c;
        }
        System.out.print(a);
        System.out.print(" ");
    }

    // Main method to take user input and reverse each word in the input
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");

        // Read a line of input from the user
        String a = sc.nextLine();

        // Split the input string into words (maximum 10)
        String[] b = a.split(" ", 10);

        // Reverse each word in the array
        for (String i : b) {
            reverse(i);
        }
    }
}

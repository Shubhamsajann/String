import java.util.Scanner;

public class Program15 {
    public static void main(String[] args) {
        // Create Scanner object to take input from the user
        System.out.println("Enter a string to toggle case:");
        Scanner sc  = new Scanner(System.in);
        char[] a = sc.nextLine().toCharArray();
        // Convert the input string to a character array
        // Iterate over each character and toggle its case
        int i;
        for ( i = 0; i <a.length-1 ; i++) {
            if(a[i]>=65 && a[i]<=90){
                // If character is uppercase (A-Z), convert to lowercase by adding 32
                System.out.print((char)(a[i]+32));
            }
            else if(a[i]>=97 && a[i]<=122){
                // If character is lowercase (a-z), convert to uppercase by subtracting 32
                System.out.print((char)(a[i]-32));
            }
            else{
                // If character is not a letter, print it as it is
                System.out.print(a[i]);
            }
        }
        System.out.println(); // Move to next line after output
    }
}

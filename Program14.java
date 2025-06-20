import java.util.Scanner;

public class Program14 {
    //count capital small space words and special charater
    public static void main(String[] args) {
        // Initialize counters for different character types
        int cap=0,digit=0,sp=0,words=0,space=0,small=0;
        // Take input string from the user
        Scanner sc= new Scanner(System.in);
        // Convert the input string to a character array and loop through each character
        char[] a=sc.nextLine().toCharArray();

        for (int i = 0; i <a.length ; i++) {
            if(a[i]>='A' && a[i]<='Z'){ // Check for uppercase letters
                cap++;
            } else if (a[i]>='a' && a[i]<='z'){ // Check for lowercase letters
                small++;
            } else if(a[i]>='0' && a[i]<='9'){ // Check for digits
                digit++;
            } else if(a[i]==' '){ // Check for spaces
                space++;
            } else { // All other characters are special characters
                sp++;
            }
        }
        // Print the counts of different types of characters
        System.out.println("Uppercase letters: " + cap);
        System.out.println("Lowercase letters: " + small);
        System.out.println("Digits: " + digit);
        System.out.println("Spaces: " + space);
        System.out.println("Special characters: " + sp);
    }
}

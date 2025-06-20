import java.util.Scanner;

public class Program13 {
    public static void main(String[] args) {
        // Declare a string variable to hold user input
        String s;

        // Prompt the user to enter a string
        System.out.println("Enter the String");

        // Create Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        s = sc.nextLine();

        // Split the input string into words (maximum 10 words)
        String[] b = s.split(" ", 10);

        // Sort the array of words based on their length using bubble sort
        for (int j = 0; j < b.length; j++) {
            for (int i = 0; i < b.length - 1; i++) {
                if (b[i].length() > b[i + 1].length()) {
                    // Swap the words if current word is longer than the next
                    String c = b[i];
                    b[i] = b[i + 1];
                    b[i + 1] = c;
                }
            }
        }

        // Print all the sorted words
        System.out.println("Words sorted by length:");
        for (String word : b) {
            System.out.println(word);
        }

        // Print the longest word (last word after sorting)
        System.out.println("The longest word is:");
        System.out.print(b[b.length - 1]);
    }
}

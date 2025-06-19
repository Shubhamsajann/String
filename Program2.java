import javax.xml.transform.Source;
import java.util.Scanner;

public class Program2 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the string");
        String a =sc.nextLine();
        System.out.print(a);
        char[] b=a.toCharArray();
        b[0]='z';
        System.out.print(b);
    }
}

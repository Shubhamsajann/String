import java.util.Scanner;

public class Program7 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the string to print penultimate word");
        char a[] = sc.nextLine().toCharArray();
        int space=0;
        int count=0;

        int i;
        for ( i = a.length-1; i >=0 ; i--) {

            if(a[i]==' '){
                count++;
            }
            if(count==2){
                break;
            }

        }
        i=i+1;
        while (a[i]!=' '){
            System.out.print(a[i]);
            i++;
        }
    }
}

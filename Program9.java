import java.util.Scanner;

public class Program9 {
    //Proram to check is an panagram (its a sentence contaning all the aphabets)
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the string to check panagram");
        char[] a= sc.nextLine().toCharArray();
        int i,j,k;
        int count=0;
        for ( i = 65,j=97; i<=90 ; i++,j++) {
            for ( k = 0; k <a.length ; k++) {
                if( i==a[k] || j==a[k]){
                    count++;
                }
            }
        }
        if (count==26){
            System.out.println("Its an panagram");
        }
        else {
            System.out.println("Its not an panagram ");
        }
    }
}

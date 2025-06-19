import java.util.Scanner;

public class Program8 {
    //program to check anagram (anagram are those words which has exact some alphabetss but differnt arragement
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string and b to check is its a anagram");
        char[] a  = sc.nextLine().toCharArray();
        char[] b  = sc.nextLine().toCharArray();

        int mark = 0;
        if(a.length!=b.length){
            mark=1;
        }
        else {
            for (int j = 0; j <a.length ; j++) {
                for (int i = 0; i <a.length -1 ; i++) {
                    if(a[i]>a[i+1]){
                        char c = a[i];
                        a[i]=a[i+1];
                        a[i+1]=c;
                    }
                }

            }
            for (int j = 0; j <b.length ; j++) {
                for (int i = 0; i <b.length -1 ; i++) {
                    if(b[i]>b[i+1]){
                        char c = b[i];
                        b[i]=b[i+1];
                        b[i+1]=c;
                    }
                }

            }

            for (int i = 0; i <a.length ; i++) {
                if(a[i]!=b[i]){
                    mark=1;
                }
            }

        }
        if(mark==0){
            System.out.println("Its a anagram");
        }
        else {
            System.out.println("Its not a anagram");
        }

    }
}

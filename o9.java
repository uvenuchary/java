// Read into an array & print them
import java.util.Scanner;
/**
 * o9
 */
public class o9 {

    public static void main(String[] args) {
        int n,i;
        System.out.println("Enter size of array");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for ( i = 0; i < n; i++) {
            System.out.println("Enter the element:");
            a[i]=sc.nextInt();
        }
        System.out.print("Array elements:");
        for (i = 0; i < n; i++) {
            System.out.println(a[i]+"");
        }
    }
}
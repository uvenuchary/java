// Biggest & Smallest numbers in a given set of integers
import java.util.Scanner;
/**
 * o10
 */
public class o10 {

    public static void main(String[] args) {
        int n,i;
        System.out.println("Enter size of array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for ( i = 0; i< n; i++) {
            System.out.println("Enter the elements:");
            a[i]=sc.nextInt();
        }
        int big=a[0];
        for ( i = 1; i< n; i++) {
            if(a[i]>big)
            big=a[i];
        }
        int small=a[0];
        for ( i = 1; i < n; i++) {
            if(a[i]<small)
            small=a[i];
        }
        System.out.println("Biggest number is"+big);
        System.out.println("Smallest number is"+small);
    }
}
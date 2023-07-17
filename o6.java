// Palindrome number
import java.util.Scanner;
/**
 * o6
 */
public class o6 {

    public static void main(String[] args) {
        int n,rem,revnum=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        num=n;
        while (n>0) {
            rem=n%10;
            revnum=revnum*10+rem;
            n=n/10;
        }
        if(revnum==num)
        System.out.println("It is a Palindrome number");
        else
        System.out.println("It is not a Palindrome number");
    }
}
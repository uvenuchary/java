// Sum of digits
import java.util.Scanner;
class o2 {
    public static void main(String[] args) {
        int n,rem,sum=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number:");
        n=sc.nextInt();
        num=n;
        while (n>0) {
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        } 
        System.out.print("Sum of digits of"+sum);
    }
}
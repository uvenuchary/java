// GCD
import java.util.Scanner;

class o7 {
    public static void main(String[] args) {
        int a,b,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a:");
        a=sc.nextInt();
        System.out.println("Enter b:");
        b=sc.nextInt();
        while (a>0) {
            r=b%a;
            b=a;
            a=r;
        }
        System.out.println("GCD="+b);
    }
    
}
// Armstrong number
import java.util.Scanner;
class o5 {
    public static void main(String[] args) {
        int n,rem,revnum=0,num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number:");
        n=sc.nextInt();
        num=n;
        while (n>0) {
            rem=n%10;
            revnum=revnum+(rem*rem*rem);
            n=n/10;
        }
        if (revnum==num) 
            System.out.println("Entered number is an Armstrong number.");
        else
            System.out.println("Entered number is NOT an Armstrong number.");
        
    }

    
}
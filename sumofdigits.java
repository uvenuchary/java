// Sum of digits

import java.util.Scanner;

class o1 
{
    
public static void main(String[] args)
 {
        
int n,rem,sum=0,num;

Scanner sc=new Scanner(System.in);

System.out.print("Enter a number:");

        n=sc.nextInt();

        num=n;
        
while (num>0) 
{
            
rem=num%10;
            
sum=sum+rem;
            
num=num/10;
        
} 
        
System.out.print("Sum of digits of"+sum);
 
sc.close();
}

}
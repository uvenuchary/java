// Reverse of a number

import java.util.Scanner;

 
class o3 
{
    
public static void main(String[] args)
 {
        
int n,rem,revnum=0,num;
        
Scanner sc=new Scanner(System.in);
        
System.out.println("Enter a number");
        
n=sc.nextInt();
        
num=n;
        
while (n>0) 
{
            
rem=num%10;
            
revnum=revnum*10+rem;
            
num=num/10;
        
}
        
System.out.println("Reverse of entered number is"+revnum);
sc.close();
    
}
}
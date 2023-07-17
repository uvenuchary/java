// Biggest of 3 numbers

import java.util.Scanner;
class biggestof3
 {

    public static void main(String[] args)
{
       
  int a,b,c;

   Scanner sc=new Scanner(System.in);
 
   System.out.print("Enter a:");

   a=sc.nextInt();

   System.out.print("Enter b:");

   b=sc.nextInt();
 
   System.out.print("Enter c:");

   c=sc.nextInt();

   if(a>b && a>c)

         System.out.print("big is"+a);
 
   else if(b>c)

         System.out.println("big is"+b);
    
   else

         System.out.println("big is"+c);

  sc.close();  
    }


    
}
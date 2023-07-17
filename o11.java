// Linear Search
import java.util.Scanner;

public class o11 {

    public static void main(String[] args) {
        int n,i;
        System.out.println("Enter size of array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for ( i = 0; i< n; i++) {
            System.out.println("Enter the element:");
            a[i]=sc.nextInt();
        }
        int key,flag=0;
        System.out.println("Enter the key:");
        key=sc.nextInt();
        for(i=0; i<n; i++){
            if(a[i]==key){
                flag=1;
                break;
            }
        }
        if(flag==1)
        System.out.println("Element is found");
        else
        System.out.println("Element is not found");
    }
}
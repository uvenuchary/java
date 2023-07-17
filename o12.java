// Binary Search
import java.util.Scanner;

public class o12 {

    public static void main(String[] args) {
        int n,i,low,high,mid,key;
        System.out.println("Enter size of array:");
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int a[]=new int[n];
        for ( i = 0; i< n; i++) {
            System.out.println("Enter the element:");
            a[i]=sc.nextInt();
        }
         System.out.println("Enter the key:");
        key=sc.nextInt();
        low=0;
        high=n-1;
        int flag=0;
        while (low<=high) {
            mid=(low+high)/2;
            if(a[mid]==key){
                flag=1;
                break;
            }
            else if(key>a[mid])
            low=mid+1;
            else
            high=mid-1;
        }
        if(flag==1)
        System.out.println("Element is found");
        else
        System.out.println("Element is NOT found");
    }}
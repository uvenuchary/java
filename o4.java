
// 4th one
import java.util.Scanner;

public class o4 {
    public static void main(String[] args) {
        int n, i, fact = 1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n:");
        n = sc.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial is " + fact);
    }

}
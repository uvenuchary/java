// Read into matrix & print it
import java.util.Scanner;
/**
 * o13
 */
public class o13 {

    public static void main(String[] args) {
        int m, n, i, j;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows for your matrix:");
        m = sc.nextInt();
        System.out.println("Enter the number of columns for your matrix:");
        n = sc.nextInt();
        int a[][] = new int[m][n];
        System.out.println("Enter elements of matrix:");
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}

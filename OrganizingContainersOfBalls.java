import java.io.IOException;
import java.util.Scanner;

public class OrganizingContainersOfBalls {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int[][] a = new int[n][n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    a[j][k] = sc.nextInt();
                }
            }
            int[] row = new int[n];
            int[] column = new int[n];
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    row[j] += a[j][k];
                    column[j] += a[k][j];
                }
            }
            int ans = 0;
            for (int j = 0; j < n; j++) {
                ans ^= row[j];
                ans ^= column[j];
            }
            if (ans == 0) {
                System.out.println("Possible");
            } else {
                System.out.println("Impossible");
            }
            ;
        }
    }
}

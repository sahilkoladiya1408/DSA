import java.io.IOException;
import java.util.Scanner;

public class BetweenTwoSets {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int a[] = new int[n];
        int b[] = new int[m];

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        int cnt = 0;
        for (int i = 1; i <= 100; i++) {
            boolean ok = true;
            for (int j = 0; j < n; j++) {
                if (i % a[j] != 0)
                    ok = false;
            }
            for (int j = 0; j < m; j++) {
                if (b[j] % i != 0)
                    ok = false;
            }
            if (ok)
                cnt++;
        }
        System.out.println(cnt);
    }
}

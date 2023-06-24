import java.io.IOException;
import java.util.Scanner;

public class SubarrayDivision {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < s.length; i++) {
            s[i] = sc.nextInt();
        }
        int d = sc.nextInt();
        int m = sc.nextInt();

        int o = 0;
        int sum = 0;
        for (int i = 0; i < m - 1; i++) {
            sum += s[i];
        }
        for (int j = m - 1; j < n; j++) {
            sum -= (j - m) < 0 ? 0 : s[j - m];
            sum += s[j];
            if (sum == d)
                o++;
        }
        System.out.println(o);
    }
}

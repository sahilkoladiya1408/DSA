import java.io.IOException;
import java.util.Scanner;

public class AngryProfessor {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String[] ans = new String[t];
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int[] a = new int[n];
            for (int j = 0; j < n; j++) {
                a[j] = sc.nextInt();
            }
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (a[j] <= 0) {
                    count++;
                }
            }
            if (count < k) {
                ans[i] = "YES";
            } else {
                ans[i] = "NO";
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

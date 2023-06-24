import java.io.IOException;
import java.util.Scanner;

public class UtopianTree {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] n = new int[t];
        for (int i = 0; i < t; i++) {
            n[i] = sc.nextInt();
        }
        for (int i = 0; i < t; i++) {
            int ans = 1;
            for (int j = 1; j <= n[i]; j++) {
                if (j % 2 != 0) {
                    ans *= 2;
                } else {
                    ans++;
                }
            }

            System.out.println(ans);
        }
    }
}

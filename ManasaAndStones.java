import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class ManasaAndStones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt() - 1;
            int a = sc.nextInt();
            int b = sc.nextInt();

            if (n <= 0) {
                System.out.println(0);
            } else {
                ArrayList<Integer> ans = new ArrayList<>();
                for (int i = 0; i <= n; ++i) {
                    ans.add((n - i) * a + i * b);
                }
                Collections.sort(ans);
                System.out.print(ans.get(0));
                for (int j = 1; j < ans.size(); ++j) {
                    if (ans.get(j).equals(ans.get(j - 1))) { continue; }
                    else { System.out.print(" " + ans.get(j)); }
                }
                System.out.println();
            }
        }
    }
}

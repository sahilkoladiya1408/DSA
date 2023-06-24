import java.io.IOException;
import java.util.Scanner;

public class RepeatedString {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        long n = sc.nextLong();
        long count = 0;
        long repeat = n / s.length();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'a') {
                count++;
            }
        }
        long ans = repeat * count;
        for (int i = 0; i < n % s.length(); i++) {
            if (s.charAt(i) == 'a') {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

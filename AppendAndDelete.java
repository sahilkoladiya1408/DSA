import java.io.IOException;
import java.util.Scanner;

public class AppendAndDelete {
    static String ans(String s, String t, int k) {
        if (k >= t.length() + s.length())
            return "Yes";
        int same = Math.min(t.length(), s.length());
        for (int i = 0; i < Math.min(t.length(), s.length()); i++) {
            if (s.charAt(i) != t.charAt(i)) {
                same = i;
                break;
            }
        }
        k -= (s.length() - same);
        k -= (t.length() - same);
        return (k >= 0 && k % 2 == 0) ? "Yes" : "No";
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String t = sc.next();
        int k = sc.nextInt();
        System.out.println(ans(s, t, k));
    }
}

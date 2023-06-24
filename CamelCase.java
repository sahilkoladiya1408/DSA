import java.io.IOException;
import java.util.Scanner;

public class CamelCase {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        int ans = 1;
        for (int i = 0; i < s.length(); i++) {
            int val = s.charAt(i);
            if (Character.isUpperCase(val)) {
                ans++;
            }
        }
        System.out.println(ans);
    }
}

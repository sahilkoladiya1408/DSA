import java.io.IOException;
import java.util.Scanner;

public class CountingValleys {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        int c = 0, i = 0;
        for (int j = 0; j < s.length(); j++) {
            if (s.charAt(j) == 'U') {
                i++;
                if (i == 0) {
                    c++;
                }
            }
            if (s.charAt(j) == 'D') {
                i--;
            }

        }
        System.out.println(c);
    }
}

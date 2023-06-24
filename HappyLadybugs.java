import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class HappyLadybugs {

    public static String happyLadybugs(String b) {
        int x[] = new int[26];
        boolean sp = false;
        int count = 0;
        char d = '!';
        for (char c : b.toCharArray()) {
            if (c == '_') {
                sp = true;
                continue;
            }
            if (x[c - 'A']++ == 0)
                count++;
            if (d != c)
                count--;
            d = c;
        }
        if (!sp && count != 0)
            return "NO";
        for (int i : x)
            if (i == 1)
                return "NO";
        return "YES";

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            String b = sc.next();
            System.out.println(happyLadybugs(b));
        }
    }
}

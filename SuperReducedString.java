import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SuperReducedString {
    public static String superReducedString(String s) {
        String tempStr = "";

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                tempStr = s.substring(0, i) + s.substring(i + 2);
                return superReducedString(tempStr);
            }
        }

        if (s.length() == 0) {
            return "Empty String";
        }

        return s;
    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        System.out.println(superReducedString(s));
    }
}

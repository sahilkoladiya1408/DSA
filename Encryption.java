import java.io.IOException;
import java.util.Scanner;

public class Encryption {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        s = s.replaceAll("\\s", "");
        int col = (int) Math.ceil(Math.sqrt(s.length()));
        int row = (s.length() / col) + (((s.length() % col) > 0) ? 1 : 0);
        String res = "";
        for (int i = 0; i < col; i++) {
            int k = i;
            for (int j = 0; j < row; j++) {
                if (k < s.length()) {
                    res += s.charAt(k);
                }
                k += col;
            }
            if (i < col - 1)
                res += " ";
        }
        System.out.println(res);

    }
}

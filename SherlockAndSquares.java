import java.io.IOException;
import java.util.Scanner;

public class SherlockAndSquares {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            a = (int) Math.ceil(Math.sqrt(a));
            b = (int) Math.floor(Math.sqrt(b));
            System.out.println(b - a + 1);
        }
    }
}

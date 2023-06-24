import java.io.IOException;
import java.util.Scanner;

public class DrawingBook {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int p = sc.nextInt();
        int frontdist = p / 2;
        int backdist = n % 2 == 0 ? (n - p + 1) / 2 : (n - p) / 2;
        System.out.println(Math.min(frontdist, backdist));
    }
}

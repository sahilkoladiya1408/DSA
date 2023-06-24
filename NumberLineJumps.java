import java.io.IOException;
import java.util.Scanner;

public class NumberLineJumps {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int v1 = sc.nextInt();
        int x2 = sc.nextInt();
        int v2 = sc.nextInt();

        int vdiff = v1 - v2;
        if (vdiff <= 0) {
            System.out.println("NO");
            return;
        }
        int xdiff = x1 - x2;
        System.out.println(xdiff % vdiff == 0 ? "YES" : "NO");

    }
}

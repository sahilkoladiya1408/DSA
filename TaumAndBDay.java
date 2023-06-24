import java.io.IOException;
import java.util.Scanner;

public class TaumAndBDay {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            long b = sc.nextLong();
            long w = sc.nextLong();
            long bc = sc.nextLong();
            long wc = sc.nextLong();
            long z = sc.nextLong();
            if (bc > wc + z) {
                System.out.println(((w + b) * wc) + (b * z));
            } else if (wc > bc + z) {
                System.out.println(((w + b) * bc) + (w * z));
            } else {
                System.out.println((w * wc) + (b * bc));
            }
        }
    }
}

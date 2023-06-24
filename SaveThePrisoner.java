import java.io.IOException;
import java.util.Scanner;

public class SaveThePrisoner {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int s = sc.nextInt();
            int k = (m + s - 1) % n;
            if (k == 0) {
                k = n;
            }
            System.out.println(k);
        }
    }
}

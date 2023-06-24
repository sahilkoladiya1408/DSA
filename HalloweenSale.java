import java.io.IOException;
import java.util.Scanner;

public class HalloweenSale {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int d = sc.nextInt();
        int m = sc.nextInt();
        int s = sc.nextInt();
        int x = p;
        int totalBudget = p;
        int count = 0;
        while (totalBudget <= s) {
            if (x - d > m) {
                x = x - d;
            } else {
                x = m;
            }
            totalBudget = totalBudget + x;
            count++;
        }
        System.out.println(count);
    }
}

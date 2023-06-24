import java.io.IOException;
import java.util.Scanner;

public class FindDigits {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            int n = sc.nextInt();
            int num = n;
            int count = 0;
            while (num > 0) {
                int temp = num % 10;
                if (temp > 0 && n % temp == 0) {
                    count++;
                }
                num = num / 10;
            }
            System.out.println(count);
        }
    }
}

import java.io.IOException;
import java.util.Scanner;

public class LisaWorkbook {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int pc = 0;
        int page = 1;
        for (int i = 0; i < n; i++) {
            pc += arr[i] / k;
            if (arr[i] % k > 0) {
                pc++;
            }
            int q = 1;
            for (int j = page; j <= pc; j++) {
                for (int m = q; m <= arr[i]; m++) {
                    if (m == j) {
                        count++;
                    }
                    if (m % k == 0) {
                        q = m + 1;
                        break;
                    }
                }
            }
            page = pc + 1;
        }
        System.out.println(count);
    }

}
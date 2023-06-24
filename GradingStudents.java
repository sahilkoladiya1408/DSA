import java.io.IOException;
import java.util.Scanner;

public class GradingStudents {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        for (int j = 0; j < n; j++) {
            if (a[j] < 38) {
                continue;
            } else {
                int temp = a[j] % 5;
                if (temp >= 3) {
                    a[j] = a[j] + (5 - temp);
                }
            }
        }

        for (int p = 0; p < n; p++) {
            System.out.println(a[p]);
        }

    }
}

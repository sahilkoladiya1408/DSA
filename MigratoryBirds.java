import java.io.IOException;
import java.util.Scanner;

public class MigratoryBirds {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        int counter[] = new int[6];
        int result = 1;
        int max = 0;
        for (int i = 0; i < n; i++) {
            counter[a[i]]++;
        }

        for (int i = 1; i <= 5; i++) {
            if (counter[i] > max) {
                result = i;
                max = counter[i];
            }
        }
        System.out.println(result);
    }
}

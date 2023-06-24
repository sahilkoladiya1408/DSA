import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class PickingNumbers {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        int max = 0;
        Arrays.sort(a);
        for (int i = 0; i < n - 1; i++) {
            int next = a[i] + 1;
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                if (a[j] == next || a[j] == a[i]) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
            }
        }
        System.out.println(max + 1);
    }
}

import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class SalesByMatch {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int c = 0;
        for (int i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                c++;
                i++;
            }
        }
        System.out.println(c);
    }
}

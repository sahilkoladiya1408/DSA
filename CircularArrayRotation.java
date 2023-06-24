import java.io.IOException;
import java.util.Scanner;

public class CircularArrayRotation {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int q = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[(i + k) % n] = sc.nextInt();
        }
        int[] queries = new int[q];
        for (int i = 0; i < q; i++) {
            queries[i] = sc.nextInt();
            System.out.println(a[queries[i]]);
        }
    }
}

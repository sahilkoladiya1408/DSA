import java.io.IOException;
import java.util.Scanner;

public class BreakingtheRecords {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < a.length; i++) {
            a[i] = sc.nextInt();
        }

        int max = a[0], min = a[0], maxc = 0, minc = 0;
        for (int i = 1; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxc++;
            }
            if (a[i] < min) {
                min = a[i];
                minc++;
            }
        }

        System.out.println(maxc + " " + minc);
    }
}

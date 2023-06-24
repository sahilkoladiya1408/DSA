import java.io.IOException;
import java.util.Scanner;

public class JumpingOnTheClouds {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int i = 0;
        int count = 0;
        while (i < n - 1) {
            if (i + 2 > n - 1) {
                count++;
                i++;
            } else if (c[i + 2] == 0) {
                count++;
                i += 2;
            } else {
                count++;
                i++;
            }
        }
        System.out.println(count);
    }
}

import java.util.Scanner;

public class FlatlandSpaceStations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] c = new int[m];
        for (int i = 0; i < m; i++) {
            c[i] = sc.nextInt();
        }
        int max = 0;
        for (int i = 0; i < n; i++) {
            int min = Integer.MAX_VALUE;
            for (int j = 0; j < m; j++) {
                int d = Math.abs(c[j] - i);
                if (min > d) {
                    min = d;
                }
            }
            if (max < min) {
                max = min;
            }
        }
        System.out.println(max);
    }
}

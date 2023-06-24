import java.util.Scanner;

public class ServiceLane {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int[] width = new int[n];
        for (int i = 0; i < n; i++) {
            width[i] = sc.nextInt();
        }
        for (int p = 0; p < t; p++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int min = Integer.MAX_VALUE;
            for (int k = i; k <= j ; k++) {
                if (min > width[k]) {
                    min = width[k];
                }
            }
            System.out.println(min);
        }
    }
}

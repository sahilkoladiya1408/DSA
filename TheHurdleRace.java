import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class TheHurdleRace {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] height = new int[n];
        for (int i = 0; i < n; i++) {
            height[i] = sc.nextInt();
        }
        Arrays.sort(height);
        int dose = height[n - 1] - k;
        if (dose > 0) {
            System.out.println(dose);
        } else {
            System.out.println("0");
        }
    }
}

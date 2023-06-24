import java.io.IOException;
import java.util.Scanner;

public class MinimumDistances {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int min = Integer.MAX_VALUE;
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    if (min > j - i) {
                        min = j - i;
                        temp = 1;
                    }
                }
            }
        }
        if (temp == 0)
            min = -1;
        {
            System.out.println(min);
        }

    }
}

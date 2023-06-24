import java.io.IOException;
import java.util.Scanner;

public class BeautifulTriplets {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[j] - arr[i] == d) {
                    for (int j2 = j + 1; j2 < n; j2++) {
                        if (arr[j2] - arr[j] == d) {
                            count++;
                        }
                    }
                }
            }
        }
        System.out.println(count);
    }
}

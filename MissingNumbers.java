import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;

public class MissingNumbers {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < m; i++) {
            brr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        Arrays.sort(brr);
        int i = 0;
        while (i < m) {
            int j = 0;
            while (j < n) {
                if (arr[j] == brr[i]) {
                    i++;
                    j++;
                } else {
                    System.out.print(brr[i] + " ");
                    i++;
                }
            }
        }

    }
}

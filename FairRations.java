import java.lang.reflect.Array;
import java.util.Scanner;

public class FairRations {

    static String fairRations(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                if (i == arr.length - 1)
                    return "NO";
                arr[i]++;
                arr[i + 1]++;
                count += 2;
            }
        }
        return Integer.toString(count);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.println(fairRations(arr));
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}

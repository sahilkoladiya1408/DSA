import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class EqualizeTheArray {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            arr.add(sc.nextInt());
        }
        int max = 0;
        for (int item : arr) {
            int frequency = Collections.frequency(arr, item);
            max = Math.max(max, frequency);
        }
        System.out.println(n - max);
    }
}

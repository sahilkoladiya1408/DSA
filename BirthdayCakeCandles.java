import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BirthdayCakeCandles {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[] arr = new long[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextLong();
        }

        Arrays.sort(arr);
        long max = arr[n - 1];
        long count = 0;
        for (int index = n - 1; index >= 0; index--) {
            if (arr[index] == max) {
                count = count + 1;
            }

        }
        System.out.println(count);
    }
}

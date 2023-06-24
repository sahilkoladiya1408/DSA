import java.io.IOException;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Scanner;

public class BigSorting {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr = new String[n];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.next();
        }

        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                BigInteger num1 = new BigInteger(arr[i]);
                BigInteger num2 = new BigInteger(arr[j]);
                if (num1.compareTo(num2) == 1) {
                    String smallerNumber = arr[i];
                    arr[i] = arr[j];
                    arr[j] = smallerNumber;
                }
            }
        }
        for (int p = 0; p < n; p++) {
            System.out.println(arr[p]);
        }
    }
}

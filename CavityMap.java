import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class CavityMap {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        ArrayList<String> arr = new ArrayList<>(n);

        for (int i = 0; i < n; i++) {
            arr.add(sc.next());
        }
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < n - 1; j++) {
                char s = arr.get(i).charAt(j);
                if (s > arr.get(i - 1).charAt(j) && s > arr.get(i + 1).charAt(j) && s > arr.get(i).charAt(j - 1)
                        && s > arr.get(i).charAt(j + 1)) {
                    String temp = arr.get(i).substring(0, j) + 'X' + arr.get(i).substring(j + 1);
                    arr.set(i, temp);
                }
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.println(arr.get(i));
        }
    }
}

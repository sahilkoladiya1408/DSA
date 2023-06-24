import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class SequenceEquation {
    static int findIndex(int[] a, int x) {
        ArrayList<Integer> temp = new ArrayList<>(a.length);
        for (int i = 0; i < a.length; i++) {
            temp.add(a[i]);
        }
        int index = temp.indexOf(temp.indexOf(x) + 1);

        return index;

    }

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] p = new int[n];
        for (int i = 0; i < n; i++) {
            p[i] = sc.nextInt();
        }
        for (int i = 1; i <= n; i++) {
            int index = findIndex(p, i);
            System.out.println(index + 1);
        }
    }
}

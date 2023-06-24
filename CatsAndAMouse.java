import java.io.IOException;
import java.util.Scanner;

public class CatsAndAMouse {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String ans[] = new String[n];
        for (int i = 0; i < n; i++) {
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            int xz = Math.abs(x - z);
            int yz = Math.abs(y - z);
            if (xz == yz) {
                ans[i] = "Mouse C";
            } else if (xz < yz) {
                ans[i] = "Cat A";
            } else {
                ans[i] = "Cat B";
            }
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}

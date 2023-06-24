import java.io.IOException;
import java.util.Scanner;

public class AppleAndOrange {
    public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int t = scan.nextInt();
        int a = scan.nextInt();
        int b = scan.nextInt();
        int m = scan.nextInt();
        int n = scan.nextInt();

        int applesOnHouse = 0;
        for (int i = 0; i < m; i++) {
            int applePosition = a + scan.nextInt();
            if (applePosition >= s && applePosition <= t) {
                applesOnHouse++;
            }
        } 
        System.out.println(applesOnHouse);

        int orangesOnHouse = 0;
        for (int i = 0; i < n; i++) {
            int orangePosition = b + scan.nextInt();
            if (orangePosition >= s && orangePosition <= t) {
                orangesOnHouse++;
            }
        }
        System.out.println(orangesOnHouse);

    }
}

import java.io.IOException;
import java.util.Scanner;

public class ViralAdvertising {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int shared = 5;
        int liked = 0;
        int cumulative = 0;
        for (int i = 0; i < n; i++) {
            liked = shared / 2;
            cumulative += liked;
            shared = liked * 3;
        }
        System.out.println(cumulative);
    }
}

import java.io.IOException;
import java.util.Scanner;

public class LibraryFine {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int d1 = sc.nextInt();
        int m1 = sc.nextInt();
        int y1 = sc.nextInt();
        int d2 = sc.nextInt();
        int m2 = sc.nextInt();
        int y2 = sc.nextInt();

        if (d1 <= d2 && m1 <= m2 && y1 <= y2) {
            System.out.println(0);
        } else if (m1 < m2 && y1 == y2) {
            System.out.println(0);
        } else if (y1 < y2) {
            System.out.println(0);
        } else if (d1 > d2 && m1 == m2 && y1 == y2) {
            System.out.println((d1 - d2) * 15);
        } else if (m1 > m2 && y1 == y2) {
            System.out.println((m1 - m2) * 500);
        } else {
            System.out.println(10000);
        }
    }
}

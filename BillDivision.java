import java.io.IOException;
import java.util.Scanner;

public class BillDivision {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int bill[] = new int[n];
        for (int i = 0; i < bill.length; i++) {
            bill[i] = sc.nextInt();
        }
        int bc = sc.nextInt();
        int ba = 0;
        for (int i = 0; i < bill.length; i++) {
            if (i != k) {
                ba += bill[i];
            }
        }
        ba = ba / 2;
        if (ba == bc) {
            System.out.println("Bon Appetit");
        } else {
            System.out.println(bc - ba);
        }

    }
}

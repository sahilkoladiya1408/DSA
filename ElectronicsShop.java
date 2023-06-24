import java.io.IOException;
import java.util.Scanner;

public class ElectronicsShop {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int n = sc.nextInt();
        int m = sc.nextInt();
        int kw[] = new int[n];
        int[] usb = new int[m];
        for (int i = 0; i < kw.length; i++) {
            kw[i] = sc.nextInt();
        }
        for (int i = 0; i < usb.length; i++) {
            usb[i] = sc.nextInt();
        }
        int total = -1;
        for (int i = 0; i < kw.length; i++) {
            for (int j = 0; j < usb.length; j++) {
                int temp = kw[i] + usb[j];
                if (temp <= b) {
                    if (total < temp) {
                        total = temp;
                    }
                }
            }
        }
        System.out.println(total);
    }
}

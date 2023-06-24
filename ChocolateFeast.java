import java.util.Scanner;

public class ChocolateFeast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        for (int p = 0; p < t; p++) {
            int n = sc.nextInt();
            int c = sc.nextInt();
            int m = sc.nextInt();
            int chocolate = n/c;
            int wrappers = chocolate;
            while (wrappers >= m) {
                int temp = wrappers / m;
                chocolate += temp;
                wrappers = wrappers - (temp * m) + temp;
            }
            System.out.println(chocolate);
        }
    }

}
import java.io.IOException;
import java.util.Scanner;

public class BeautifulDaysAtTheMovies {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int count = 0;
        for (int a = i; a <= j; a++) {
            StringBuilder temp = new StringBuilder();
            temp = temp.append(a);
            temp = temp.reverse();
            int aRev = Integer.parseInt(temp.toString());
            if (Math.abs(a - aRev) % k == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}

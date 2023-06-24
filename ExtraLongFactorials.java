import java.io.IOException;
import java.math.BigInteger;
import java.util.Scanner;

public class ExtraLongFactorials {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger f = new BigInteger("1");
        for (int i = 2; i <= n; i++) {
            f = f.multiply(BigInteger.valueOf(i));
        }
        System.out.println(f);
    }
}

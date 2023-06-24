import java.math.BigInteger;
import java.util.Scanner;

public class StrangeCounter {

    public static long strangeCounter(long t) {
        long last = 3;
        long factor = 3;
        while (t > last) {
            factor *= 2;
            last = (factor - 2) * 2 + 1;
        }
        return last - t + 1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long t = sc.nextLong();
        System.out.println(strangeCounter(t));
    }
}

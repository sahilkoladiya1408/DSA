import java.io.IOException;
import java.util.Scanner;

public class CutTheSticks {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);
        int count = input.nextInt();
        int[] sticks = new int[count];
        int in = 0;
        while (in < count) {
            sticks[in] = input.nextInt();
            in++;
        }
        while (true) {
            int min = Integer.MAX_VALUE;
            for (int i = 0; i < count; i++) {
                if (sticks[i] < min && sticks[i] != 0) {
                    min = sticks[i];
                }
            }
            int slices = 0;
            for (int i = 0; i < count; i++) {
                if (sticks[i] > 0) {
                    int temp = sticks[i];
                    sticks[i] = temp - min;
                    slices++;
                }

            }
            if (slices > 0)
                System.out.printf("%d%n", slices);
            else
                break;
        }
    }
}

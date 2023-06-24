import java.io.IOException;
import java.util.Scanner;

public class JumpingontheCloudsRevisited {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) {
            c[i] = sc.nextInt();
        }
        int energy = 100;
        int currentIndex = 0;
        do {
            energy -= 1;
            currentIndex = (currentIndex + k) % c.length;
            if (c[currentIndex] == 1)
                energy -= 2;
        } while (currentIndex != 0);
        System.out.println(energy);
    }
}

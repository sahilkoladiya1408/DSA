import java.io.IOException;
import java.util.Scanner;

public class DesignerPDFViewer {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int[] h = new int[26];
        for (int i = 0; i < 26; i++) {
            h[i] = sc.nextInt();
        }
        String word = sc.next();
        int max = 0;
        for (int i = 0; i < word.length(); i++) {
            int temp = word.charAt(i) - 97;
            if (h[temp] > max) {
                max = h[temp];
            }
        }
        System.out.println(max * word.length());
    }
}

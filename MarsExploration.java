import java.util.Scanner;

public class MarsExploration {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        int count = 0;
        for (int i = 0; i < s.length(); i+=3) {
            if (83 != (int)s.charAt(i)) {
                count++;
            }if (79 != (int)s.charAt(i+1)) {
                count++;
            }if (83 != (int)s.charAt(i+2)) {
                count++;
            }
        }
        System.out.println(count);
    }
}

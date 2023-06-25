import java.util.Scanner;

public class StrongPassword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.substring(0, n);
        boolean numbers = false;
        boolean lower_case = false;
        boolean upper_case = false;
        boolean special_characters = false;
        int count = 4;
        for (int i = 0; i < s.length(); i++) {
            if (48 <= (int) s.charAt(i) && (int) s.charAt(i) <= 57) {
                if (!numbers)
                    count--;
                numbers = true;
            }
            if (97 <= (int) s.charAt(i) && (int) s.charAt(i) <= 122) {
                if (!lower_case)
                    count--;
                lower_case = true;
            }
            if (65 <= (int) s.charAt(i) && (int) s.charAt(i) <= 90) {
                if (!upper_case)
                    count--;
                upper_case = true;
            }
            if (33 <= (int) s.charAt(i) && (int) s.charAt(i) <= 47) {
                if (!special_characters)
                    count--;
                special_characters = true;
            }
        }
        if (s.length() + count < 6)
            count += 6 - s.length() - count;
        System.out.println(count);
    }
}

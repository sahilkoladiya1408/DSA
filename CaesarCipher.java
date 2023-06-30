import java.util.Scanner;

public class CaesarCipher {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();
        s = s.substring(0,n);
        int k = sc.nextInt();
        String result = "";
        while(k > 26)
            k -= 26;
        for(char c : s.toCharArray()){
            char temp = c;
            if((c >= 65 && c <= 90) || (c >= 97 && c <= 122)){
                if((c > 90 - k && c <= 90) || (c > 122 - k)){
                    temp -= 26;
                }
                temp += k;
            }
            result += temp;
        }
        System.out.println(result);
    }
}

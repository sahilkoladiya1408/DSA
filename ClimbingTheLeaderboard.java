import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class ClimbingTheLeaderboard {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] ranked = new int[n];
        for (int i = 0; i < n; i++) {
            ranked[i] = sc.nextInt();
        }
        int m = sc.nextInt();
        int[] player = new int[m];
        for (int i = 0; i < m; i++) {
            player[i] = sc.nextInt();
        }
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(ranked[0]);
        int place = 1;
        for (int index = 1; index < n; index++) {
            int currPlace = place - 1;
            int currScore = ranked[index];
            if (currScore != list.get(currPlace)) {
                place++;
                list.add(ranked[index]);
            }
        }
        int currPlace = list.size() + 1;
        for (int i = 0; i < m; i++) {
            currPlace = getPlace(currPlace, player[i], list);
            System.out.println(currPlace);
        }
    }

    static int getPlace(int currPlace, int currScore, ArrayList<Integer> list) {
        for (int i = currPlace - 1; i > 0; i--) {
            int index = i - 1;
            if (currScore < list.get(index)) {
                return i + 1;
            }
        }
        return 1;
    }
}

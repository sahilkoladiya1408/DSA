import java.io.IOException;
import java.util.Scanner;

public class ACM_ICPCTeam {
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt(); // number of people
        int M = in.nextInt(); // number of topics
        String[] person_info = new String[N];

        for (int i = 0; i < N; i++)
            person_info[i] = in.next();
        long teams = 0;
        long max_covered = 0;
        long matched_topics = 0;
        for (int i = 0; i < N; i++) {

            for (int k = i + 1; k < N; k++) {
                matched_topics = 0;
                for (int j = 0; j < M; j++) {
                    if (person_info[i].charAt(j) - '0' > 0 || person_info[k].charAt(j) - '0' > 0)
                        matched_topics++;
                }
                if (matched_topics == max_covered)
                    teams++;
                else if (matched_topics > max_covered) {
                    max_covered = matched_topics;
                    teams = 1;
                }
            }
        }
        System.out.println(max_covered);
        System.out.println(teams);
    }
}

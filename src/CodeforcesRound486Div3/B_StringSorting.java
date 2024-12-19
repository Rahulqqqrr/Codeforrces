package CodeforcesRound486Div3;

import java.util.Arrays;
import java.util.Scanner;

public class B_StringSorting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0; i < n; ++i) {
            s[i] = sc.next();
        }
        Arrays.sort(s, (a, b) -> Integer.compare(a.length(), b.length()));
        boolean can = true;
        for (int i = 1; i < n; ++i) {
            can &= s[i].contains(s[i - 1]);
        }

        if (!can) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (String ss : s) {
                System.out.println(ss);

            }
        }
    }
}
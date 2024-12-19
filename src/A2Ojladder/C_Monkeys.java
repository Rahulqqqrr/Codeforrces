package A2Ojladder;

import java.util.Scanner;

public class C_Monkeys {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {

            int m = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int rowa = m;
            int rowb = m;
            int ans = 0;
            if (a <= rowa) {
                ans += a;
                rowa = rowa - a;
            } else {
                ans += Math.min(rowa, a);
                rowa = 0;
            }
            if (b <= rowb) {
                ans += b;
                rowb = rowb - b;
            } else {
                ans += Math.min(rowb, b);
                rowb = 0;
            }
            int left = rowa + rowb;
            if (c <= left) {
                ans += c;
            } else {
                ans += Math.min(left, c);
            }

            System.out.println(ans);
        }
    }
}

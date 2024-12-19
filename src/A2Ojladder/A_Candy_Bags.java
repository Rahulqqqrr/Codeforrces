package A2Ojladder;

import java.util.Scanner;

public class A_Candy_Bags {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = 1;
        while (t-- > 0) {
            int n = sc.nextInt();
            int min = 1;
            int max = n * n;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n/2; j++) {
                    System.out.print((min++) + " " + (max--)+" 4");
                }
                System.out.println();
            }


        }
    }
}
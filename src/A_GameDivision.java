import java.util.*;
public class A_GameDivision {
    static void solve(int arr[], int n, int k) {
        for (int i = 0; i < n; i++) {
            boolean flag = true;
            for (int j = 0; j < n; j++) {
                if (i == j) {
                    continue;
                }
                int abs = Math.abs(arr[i] - arr[j]);
                if (abs % k == 0) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                System.out.println("YES");
                System.out.println(i + 1);
                return;


            }
        }
        System.out.println("NO");

    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while (t-- > 0) {
            int n = in.nextInt();
            int k = in.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = in.nextInt();


            }
            solve(arr, n, k);
        }
    }
}

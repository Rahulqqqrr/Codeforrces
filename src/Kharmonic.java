import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Kharmonic {
    public static void main(String[] args) throws IOException {
        // Input Reader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder result = new StringBuilder();
        int t = Integer.parseInt(br.readLine()); // Number of test cases

        while (t-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken());
            int k = Integer.parseInt(st.nextToken());

            // Check if k is greater than n! (impossible condition)
            if (k > factorial(n)) {
                result.append("NO\n");
                continue;
            }

            // Otherwise, construct the k-harmonic set
            result.append("YES\n");
            int[] base = new int[n];
            for (int i = 0; i < n; i++) {
                base[i] = i + 1;
            }

            for (int i = 0; i < k; i++) {
                for (int j = 0; j < n; j++) {
                    result.append(base[(j + i) % n]).append(" ");
                }
                result.append("\n");
            }
        }

        // Print all results
        System.out.print(result);
    }

    // Factorial function with overflow handling
    private static long factorial(int n) {
        long fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
            if (fact > 1_000_000) { // Stop early if k cannot fit in the limit
                return Long.MAX_VALUE;
            }
        }
        return fact;
    }
}


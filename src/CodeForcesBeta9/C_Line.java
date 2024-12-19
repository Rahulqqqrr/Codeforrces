package CodeForcesBeta9;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.*;
public class C_Line {
    public static long x, y,d;
    public static void extendEuclid(long a , long b){
        if(b == 0){
            x = 1;
            y = 0;
            d = a;
            return;
        }
        extendEuclid(b, a %  b);
        long x1 = y;
        long y1 = x - (a / b)*y;
        x = x1;
        y = y1;

    }


public static void  main(String[] args) {
        try {
            Scanner in = new Scanner();
            PrintWriter out = new PrintWriter(System.out);
            long A = in.nextLong();
            long B = in.nextLong();
            long C = -in.nextLong();
            extendEuclid(A, B);
            if(C % d == 0) {
                long val = C/d;
                out.println(x*val + " " + y*val);
            }else{
                out.println(-1);
            }
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }




    }
    public static class Scanner {

        BufferedReader br;
        StringTokenizer st;

        public Scanner() {
            // System.setOut(new PrintStream(new BufferedOutputStream(System.out), true));
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        public String next() {

            while (st == null || !st.hasMoreTokens()) {
                try {
                    st = new StringTokenizer(br.readLine());
                } catch (Exception e) {
                    throw new RuntimeException();
                }
            }
            return st.nextToken();
        }

        public long nextLong() {
            return Long.parseLong(next());
        }

        public int nextInt() {
            return Integer.parseInt(next());
        }

        public double nextDouble() {
            return Double.parseDouble(next());
        }

        public String nextLine() {
            st = null;
            try {
                return br.readLine();
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }

        public boolean endLine() {
            try {
                String next = br.readLine();
                while (next != null && next.trim().isEmpty()) {
                    next = br.readLine();
                }
                if (next == null) {
                    return true;
                }
                st = new StringTokenizer(next);
                return st.hasMoreTokens();
            } catch (Exception e) {
                throw new RuntimeException();
            }
        }
    }
}

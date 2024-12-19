import java.io.PrintWriter;
import java.util.*;
import java.io.*;
import java.lang.*;
class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;

    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream), 32768);
        tokenizer = null;
    }

    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

}
 class TaskA {
     long mod = (long) (998244353l);

     public void solve(int testNumber, InputReader in, PrintWriter out) throws IOException {
         while (testNumber-- > 0) {
             int n = in.nextInt();
             // if(n<3){
             // 	out.println("NO");
             // 	continue;
             // }
             int a[] = new int[n + 1];
             for (int i = 1; i <= n; i++)
                 a[i] = in.nextInt();
             boolean found = false;
             for (int i = 1; i <= n; i++) {
                 int x = a[i];
                 x = a[x];
                 x = a[x];
                 if (x == i) {
                     found = true;
                     break;
                 }
             }
             if (found)
                 out.println("YES");
             else
                 out.println("NO");
         }
     }
 }

public class A_Love_Triangle {
    public static void main(String[] args) throws IOException {
        InputStream inputStream = System.in;
        OutputStream outputStream = System.out;
        InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        int n = in.nextInt();
        TaskA obj = new TaskA();
        obj.solve(n,in,out);
    }
}

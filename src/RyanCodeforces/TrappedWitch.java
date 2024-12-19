package RyanCodeforces;

//import java.util.Scanner;
//
//public class TrappedWitch {
//    private static final int N = (int)1e6+10;
//    static  int n ;
//    static int m;
//    static int type[][] ;
//    static int dx [] =new int[]{-1,1,0,0};
//    static int dy [] = new int[]{0,0,-1,1};
//    static int st [][]; // this is visited array
//    static String[] s =new String[N];
//
//    private static void solve(){
//        Scanner sc = new Scanner(System.in);
//        n =sc.nextInt();
//        m =sc.nextInt();
//        st = new int[n][m];
//        type =new int[n][m];
//        for(int i=0;i<n;i++) {
//            s[i] = sc.nextLine();
//            for (int j = 0; j < m; j++) {
//                st[i][j] = 0;
//
//            }
//        }
//        for(int i=0;i<n;i++){
//            for(int j=0;j<m;j++){
//                    if(s[i].charAt(j)!='?'&&st[i][j]==0){
//                        dfs(i,j);
//                    }
//                }
//            }
//            int ans =0;
//            for(int i=0;i<n;i++){
//                for(int j=0;j<m;j++){
//                    if(s[i].charAt(j)=='?'){
//                        for(int k=0;k<4;k++){
//                            int a= i+dx[k];
//                            int b =j+dy[k];
//                            if(a<0||a>=n||b<0||b>=m){
//                                continue;
//                            }
//                            if(s[a].charAt(b)=='?'||type[a][b]==1){
//                                ans++;
//                                break;
//                            }
//                        }
//                    }else{
//                        ans+=type[i][j];
//                    }
//            }
//
//
//        }
//        System.out.println(ans);
//    }
//    private static void dfs(int x,int y){
//        if(st[x][y]==2){
//          type[x][y]=1;
//          return ;
//        }else if(st[x][y]==1){
//            return ;
//        }
//        st[x][y]=2;
//        int a=x;
//        int b=y;
//        if(s[x].charAt(y)=='L')b--;
//        else if (s[x].charAt(y)=='R')b++;
//        else if(s[x].charAt(y)=='U')a--;
//        else a++;
//        if(a<0||a>=n||b<0||b>=m){
//            type[x][y]=0;
//        }else{
//            if(s[a].charAt(b)=='?'){
//                type[x][y]=1;
//            }else{
//                dfs(a,b);
//                type[x][y]=type[a][b];
//            }
//        }
//        st[x][y]=1;
//
//    }
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int t = sc.nextInt();
//        while(t-- > 0){
//            solve();
//        }
//
//    }
//}

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.*;

public class TrappedWitch {

    static int mod = 998_244_353;

    static int inf = (int) 2e9;

    static long infL = (long) 9e18;
    /*  Q K J
    3
    3 3
    UUU
    L?R
    DDD
    2 3
    ???
    ???
    3 3
    ?U?
    R?L
    RDL

    */
    private static final int N = (int) (1e6+10);
    static int []pre = new int[N],las = new int[N];
    static int []cnt = new int[N];
    static int [][]f = new int[N][3];
    static int n,m;
    static String[] s = new String[N];

    static int[][] st;
    static int[] dx = new int[]{-1,1,0,0};
    static int[] dy = new int[]{0,0,-1,1};
    static int [][]type;

    private static void solve(){
        n = in();m = in();
        st = new int[n][m];
        type = new int[n][m];
        for(int i=0;i<n;i++){
            s[i] = inStr();
            for(int j=0;j<m;j++){
                st[i][j] = 0;
            }
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s[i].charAt(j) != '?' && st[i][j] == 0)dfs(i,j);
            }
        }
        int ans = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(s[i].charAt(j) == '?'){
                    for(int k = 0;k<4;k++){
                        int a = i + dx[k];
                        int b = j + dy[k];
                        if(a<0 || a>=n || b<0 || b>=m){
                            continue;
                        }
                        if (s[a].charAt(b) == '?' || type[a][b] == 1){
                            ans ++;
//                            System.out.println(a + " " + b);
//                            System.out.println(i + " " + j);
                            break;
                        }
                    }
                }else {
                    ans += type[i][j];
                }
            }
        }
        println(ans);
        //System.out.println(Arrays.deepToString(type));
    }

    private static void dfs(int x, int y) {
        if(st[x][y] == 2){
            type[x][y] = 1;
            return ;
        }else if(st[x][y] == 1){
            return ;
        }
        st[x][y] = 2;
        int a = x,b = y;
        if(s[x].charAt(y) == 'L')b-- ;
        else if(s[x].charAt(y) == 'R')b++;
        else if(s[x].charAt(y) == 'U')a--;
        else a++;
        if(a<0 || a>=n || b<0 || b>=m){
            type[x][y] = 0;
        }else {
            if(s[a].charAt(b) == '?'){
                type[x][y] = 1;
            }else {
                dfs(a,b);
                type[x][y] = type[a][b];
            }
        }
        st[x][y] = 1;
    }


    public static void main(String[] args) {
        int t = 1;
        t = in();
        while (t-- > 0) {
            solve();
        }
    }

    //  -===-      MATH       -===-  //

    static int fact(int n) {
        int r = 1;
        for (int i = 1; i <= n; i++) {
            r = (int) (((long) r * i) % mod);
        }
        return r;
    }

    static int C(int n, int k) {
        return (int) (((((long) fact(n) * pow(fact(k), mod - 2)) % mod) * pow(fact(n - k), mod - 2)) % mod);
    }

    static int gcd(int i1, int i2) {
        if (i2 == 0) return i1;
        return gcd(i2, i1 % i2);
    }

    static long gcd(long i1, long i2) {
        if (i2 == 0) return i1;
        return gcd(i2, i1 % i2);
    }

    static int pow(int x, int y) {
        x = x % mod;
        if (x == 0) return 0;
        int r = 1;
        while (y > 0) {
            if ((y & 1) != 0) r = (int) (((long) r * x) % mod);
            y /= 2;
            x = (int) (((long) x * x) % mod);
        }
        return r % mod;
    }

    static void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    static int digitSum(long n) {
        int r = 0;
        while (n != 0) {
            r += (int) (n % 10);
            n /= 10;
        }
        return r;
    }

    //  -===- DATA STRUCTURES -===-  //

    static class UnionFind {

        int[] p, rank, min, max, sz;
        int n, c;

        UnionFind(int n) {
            this.n = n;
            p = new int[n];
            rank = new int[n];
            min = new int[n];
            max = new int[n];
            sz = new int[n];
            for (int i = 0; i < p.length; i++) {
                p[i] = i;
                min[i] = i;
                max[i] = i;
                sz[i] = 1;
            }
        }

        int find(int a) {
            return p[a] = (p[a] == a ? a : find(p[a]));
        }

        void union(int a, int b) {
            a = find(a);
            b = find(b);
            if (a == b) return;
            if (rank[a] > rank[b]) {
                p[b] = a;
                max[a] = Math.max(max[a], max[b]);
                min[a] = Math.min(min[a], min[b]);
                sz[a] += sz[b];
            } else {
                p[a] = b;
                max[b] = Math.max(max[b], max[a]);
                min[b] = Math.min(min[b], min[a]);
                sz[b] += sz[a];
                if (rank[a] == rank[b]) {
                    rank[b]++;
                }
            }
            c--;
        }
    }

    private static class Pair<F, S> {

        F first;
        S second;

        public Pair(F f, S s) {
            this.first = f;
            this.second = s;
        }

        public F getFirst() {
            return first;
        }

        public S getSecond() {
            return second;
        }

        public void setFirst(F first) {
            this.first = first;
        }

        public void setSecond(S second) {
            this.second = second;
        }
    }


    //  -===-      IN      -===-  //
    static StringTokenizer STT;

    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    static PrintStream out = System.out;

    static String inStr() {
        while (STT == null || !STT.hasMoreElements()) {
            try {
                STT = new StringTokenizer(br.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return STT.nextToken();
    }

    static int in() {
        return Integer.parseInt(inStr());
    }

    static long inLong() {
        return Long.parseLong(inStr());
    }

    static double inDouble() {
        return Double.parseDouble(inStr());
    }

    static String inLine() {
        String s;
        try {
            if (STT != null && STT.hasMoreTokens()) {
                s = STT.nextToken("\n");
            } else {
                s = br.readLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return s;
    }

    static long[] inArrLong() {
        String[] split = inLine().split(" ");
        long[] a = new long[split.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Long.parseLong(split[i]);
        }
        return a;
    }

    static int[] inArr() {
        String s = inLine();
        String[] split = s.split(" ");
        int[] a = new int[split.length];
        for (int i = 0; i < a.length; i++) {
            a[i] = Integer.parseInt(split[i]);
        }
        return a;
    }

    //  -===-      PRINT      -===-  //

    static void YES() {
        out.println("YES");
    }

    static void NO() {
        out.println("NO");
    }

    static void println() {
        out.println();
    }

    static void println(int a) {
        out.println(a);
    }

    static void print(int a) {
        out.print(a);
    }

    static void println(long a) {
        out.println(a);
    }

    static void print(long a) {
        out.print(a);
    }

    static void println(double a) {
        out.println(a);
    }

    static void print(double a) {
        out.print(a);
    }

    static void println(String a) {
        out.println(a);
    }

    static void print(String a) {
        out.print(a);
    }

    static void print(int[] a) {
        for (int i = 0; i < a.length - 1; i++) {
            out.print(a[i] + " ");
        }
        if (a.length > 0) {
            out.println(a[a.length - 1]);
        }
    }

    static void print(List<?> l) {
        for (int i = 0; i < l.size() - 1; i++) {
            out.print(l.get(i) + " ");
        }
        if (!l.isEmpty()) {
            out.println(l.get(l.size() - 1));
 }
}

}



import java.util.*;
public class B_StripPaint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int ans=1;
            int k=1;
            while(k<n){
                k=2*k+2;
                ans++;
            }
            System.out.println(ans);
        }
    }
}

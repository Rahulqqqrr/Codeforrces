package CodeforcesRound991Div3;
import java.util.*;
public class LineBreaks {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int m = sc.nextInt();
            int count =0;
            for(int i=0;i<n;i++){

                String s =sc.next();
                int len =s.length();
                if(len ==m){
                    count =1;
                    break;
                }
                if(len<m) {
                    count++;
                }else if(len>m){
                    continue;
                }

            }
            System.out.println(count);

        }
    }
}

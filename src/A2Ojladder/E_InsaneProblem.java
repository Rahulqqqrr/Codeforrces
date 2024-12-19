package A2Ojladder;

import java.util.Scanner;

public class E_InsaneProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long k = sc.nextLong();
            long l1 = sc.nextLong();
            long r1 = sc.nextLong();
            long l2 = sc.nextLong();
            long  r2 = sc.nextLong();
            long  count=0;
            for(long x =l1;x<=r1;x++){
                long p=1;
                while(true){
                    long  y =p*x;
                    if(y>r2){
                        break;
                    }
                    if(y>=l2){
                        count++;
                    }
                    if(p>r2/k){

                        break;
                    }
                    p=p*k;
                }

            }
            System.out.println(count);

        }
    }
}
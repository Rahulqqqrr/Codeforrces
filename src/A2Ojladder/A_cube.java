package A2Ojladder;

import java.sql.SQLOutput;
import java.util.Scanner;

public class A_cube {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int count =0;
            for(int i=1;i<n;i++){
                int a =n-i;
                if(a==n-i){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}

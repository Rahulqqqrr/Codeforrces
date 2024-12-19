package A2Ojladder;

import java.util.Scanner;

public class B_reflectionString {
    public static void solve(String a){

        StringBuilder ans = new StringBuilder();
        int n= a.length();
        for(int i=n-1;i>=0;i--){
            if(a.charAt(i)=='q'){
                ans.append('p');
            }
            if(a.charAt(i)=='p'){
                ans.append('q');
            }else if(a.charAt(i)=='w'){
                ans.append('w');
            }

        }
        System.out.println(ans.toString());


    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();

        while(t-->0){
            String  a=sc.next();
            solve(a);
        }
    }




}

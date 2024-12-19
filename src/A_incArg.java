import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;

public class A_incArg {
    public static void main(String[] args) {
       Scanner in = new Scanner (System.in);
       int n =in.nextInt();
       String str = in.next();
       int count =0;
       for(int i=0;i<n;i++){
           if(str.charAt(i)=='1'){
               count ++;
           }else{
               break;
           }

       }
        System.out.println(Math.min(n,count+1));

    }
}

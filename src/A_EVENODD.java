import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class A_EVENODD {
    public static void main(String[] args)throws IOException {
//        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//        int in = Integer.parseInt(br.readLine());
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        long k = sc.nextLong();
        long no = (n+1)/2;
        if(k<=no){
            System.out.println(2*k-1);
        }else{
            System.out.println((k-no)*2);
        }









    }
}

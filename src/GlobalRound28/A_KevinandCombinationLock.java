package GlobalRound28;

import java.util.Scanner;

public class A_KevinandCombinationLock {

//    static boolean check(long n){
//        int count =0;
//        while(n!=0){
//            long rem =n%10;
//            if(rem==3){
//                count++;
//
//            }
//            long div= n/10;
//            if(count==2){
//                return true;
//            }
//        }
//        return false;
//
//    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
         long x =sc.nextLong();
//         while(true){
//             if(x>33){
//                 x=x-33;
//
//             }else if(check(x)){
//
//             }
            if(x%33==0){
                System.out.println("YES");
            }else{
                System.out.println("NO");

            }





        }

    }
}

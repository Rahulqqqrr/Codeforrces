package CodeforcesContest990div2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Alyona {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-->0){
            int n =in.nextInt();
            int arr [] = new int[n];
            for(int i=0;i<n;i++){
                arr[i]=in.nextInt();
            }
            int c =1;
            int ans =1;
            int temp;
            for(int i=1;i<n;i++){
//                if(i%2!=0){
//                    if(i*i==arr[i]){
//                        System.out.println(i);
//                    }else if(i*i>arr[i]){
//                        System.out.println(i);
//                        break;
//                    }else{
//                        continue;
//                    }
//
//                }else{
//                    int i1 =i+1;
//                    if(i1*i1==arr[i]){
//                        System.out.println(i);
//                    }else if(i1*i1>arr[i]){
//                        System.out.println(i);
//                        break;
//                    }else{
//                        continue;
//                    }
//
//                }
                c+=arr[i];
                if(c%2==0){
                    continue;
                }
                temp =(int)Math.sqrt(c);
                if(temp*temp==c){
                    ans++;
                }





            }
            System.out.println(ans);

        }

    }
}




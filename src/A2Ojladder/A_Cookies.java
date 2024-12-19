package A2Ojladder;

import java.util.Scanner;

public class A_Cookies {


    public static void solve(int n ,int arr[]){
        int count1 =0;
        int sume=0;
        int sumodd=0;
        int count2=0;

        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                count1++;
                sume+=arr[i];
            }else{
                sumodd+=arr[i];
                count2++;
            }
        }
        if(sumodd%2==0){
            System.out.println(count1 );
        }else{
            System.out.println(count2);
        }





    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int arr[] = new int [n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();


        }

        solve(n,arr)     ;










    }

}

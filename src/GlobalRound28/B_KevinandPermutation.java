package GlobalRound28;

import java.util.Scanner;

public class B_KevinandPermutation {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int k=sc.nextInt();
            int arr[] =new int[n];
            int s=1;
            int e=n;
            for(int i=0;i<n;i++){
                if((i+1)<n&&(i+1)%k==0){
                    arr[i]=s;
                    s++;
                }else{
                    arr[i]=e;
                    e--;
                }
            }
            for(int i=0;i<n;i++){
                System.out.print(arr[i]+" ");
            }
            System.out.println();

        }
    }
}

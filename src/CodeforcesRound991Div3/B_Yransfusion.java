package CodeforcesRound991Div3;

import java.util.Scanner;

public class B_Yransfusion {
    public static  void solve(int arr[],int n) {

        int odd = 0;
        int even = 0;
        int totalsum=0;
        for (int i = 0; i < n; i++) {
            totalsum+=arr[i];
        }
        if(totalsum%n!=0){
            System.out.println("NO");
                    }
        int k =totalsum/n;
       int codd= (n+1)/2;
       int ceven= (n)/2;



    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        while (t-- > 0) {

            solve(arr,n);
        }
    }
}

package CodeforcesRound850div2;
import java.util.*;
public class BArrayMerging {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) {
                arr[i] = sc.nextInt();
            }
            int arr1[] = new int[n];
            for(int i=0;i<n;i++) {
                arr1[i] = sc.nextInt();
            }
            int cnt1[] = new int[2*n+1];
            for(int i=0;i<2*n+1;i++){
                cnt1[i]=0;
            }
            int cnt2[] = new int[2*n+1];
            for(int i=0;i<2*n+1;i++){
                cnt2[i]=0;
            }
            for(int i=0;i<n;i++){
                int j =i;
                while(j<n&&arr[j]==arr[i]){

                    j++;
                }
                cnt1[arr[i]]= Math.max(cnt1[arr[i]],j-i);
                i=--j;
            }
            for(int i=0;i<n;i++){
                int j =i;
                while(j<n&&arr1[j]==arr1[i]){

                    j++;
                }
                cnt2[arr1[i]]= Math.max(cnt2[arr1[i]],j-i);
                i=--j;
            }
            int ans = Integer.MIN_VALUE;
            for(int i=1;i<=2*n;i++){
                ans =Math.max(ans,cnt1[i]+cnt2[i]);
            }
            System.out.println(ans);
        }

        }

    }




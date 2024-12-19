package EducationContestes172div2;

import java.util.Arrays;
import java.util.Scanner;

public class AGreedyMonocarp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            int sum = 0;
            int min = Integer.MAX_VALUE;
            for (int i = n - 1; i >= 0; i--) {
                sum += arr[i];
                if(sum>k){
                    break;
                }
                min= Math.min(min,k-sum);


            }
            System.out.println(min);
        }


    }
}
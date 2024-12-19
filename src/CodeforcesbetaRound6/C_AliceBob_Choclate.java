package CodeforcesbetaRound6;
import java.util.*;
public class C_AliceBob_Choclate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int i = 0;
        int j = n - 1;
        int a = 0;
        int b = 0;

        if (n == 1) {
            System.out.println("1 0");
        } else {
            while (i < j) {
//            if(A>B)
//            {
//                B+=arr[--j];
//                cb++;
//            }
//            else if(B>=A)
//            {
//                A+=arr[++i];
//                ca++;
//            }
//            if(i>j)break;
//        }
//        System.out.print(ca);
//        System.out.println(cb);
                if (arr[i] <= arr[j]) {
                    a++;
                    arr[j] = arr[j] - arr[i];
                    arr[i] = 0;
                    i++;
                    if (i == j)
                        b++;
                } else {
                    b++;
                    arr[i] = arr[i] - arr[j];
                    arr[j] = 0;
                    j--;
                    if (i == j)
                        a++;
                }

            }
            System.out.println(a + " " + b);
        }
    }
}

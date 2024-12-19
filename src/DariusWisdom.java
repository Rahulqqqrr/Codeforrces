import java.util.Scanner;

public class DariusWisdom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int arr[] =new int[n];
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
            }
            int moves =0;

            for(int i=0;i<n;i++){
                for(int j=0;j<n-1;j++) {
                    if (Math.abs(arr[j] - arr[j + 1]) == 1) {
                        if (arr[j] > arr[j + 1]) {
                            int temp = arr[j];
                            arr[j] = arr[j + 1];
                            arr[j + 1] = temp;
                            moves++;
                        }
                    }else{

                    }
                }
            }
            System.out.println(moves);
            for(int i=0;i<n;i++){
                System.out.print(arr[i]);
            }
            System.out.println();



        }
    }
}

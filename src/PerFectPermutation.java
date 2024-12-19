import java.util.Scanner;

public class PerFectPermutation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);int max=0;
        int t=sc.nextInt();
        if(t%2!=0)System.out.println(-1);
        else{
            int a[]=new int[t];for(int i=0;i<t;i++)a[i]=i+1;
            //  System.out.println(Arrays.toString(a));
            for(int i=0;i<a.length-1;i+=2){
                int temp=a[i];
                a[i]=a[i+1];
                a[i+1]=temp;
            }
            for(int i=0;i<a.length;i++)   System.out.print(a[i]+" ");
        }

    }
    }



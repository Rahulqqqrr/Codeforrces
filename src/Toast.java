import java.util.Scanner;

public class Toast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int l=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int p=sc.nextInt();
        int nl=sc.nextInt();
        int np=sc.nextInt();
        int drink=k*l;
        int toast1=drink/nl;
        int toast2=c*d;
        int toast3=p/np;
        int toast4=Math.min(toast1,toast2);
        int toast5=Math.min(toast3,toast4);
        System.out.println(toast5/n);

    }
}

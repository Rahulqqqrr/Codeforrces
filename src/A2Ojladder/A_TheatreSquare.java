package A2Ojladder;

import java.util.Scanner;

public class A_TheatreSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n =sc.nextLong();
        long m =sc.nextLong();
        long a =sc.nextLong();
        long len =(long) Math.ceil((double)n/a);
        long width =(long )Math.ceil((double)m/a);
        System.out.println(len*width);

    }
}

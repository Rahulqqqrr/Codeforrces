package A2Ojladder;
import java.util.*;
public class AVasily_the_Bear_And_Triangle {


    public static void solve(int x,int y){
        int d = Math.abs(x)+Math.abs(y);

        int y2 = d * ((y < 0)? -1:1);
        if( x < 0)
            System.out.println((d * -1 +" 0 0 " +y2 ));
        else
          System.out.println("0 " + y2+" "+ d + " 0");









    }
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      int x= sc.nextInt();
      int y= sc.nextInt();
      solve(x,y);
    }
}

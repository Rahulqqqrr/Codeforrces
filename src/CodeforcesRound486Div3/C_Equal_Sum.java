package CodeforcesRound486Div3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class C_Equal_Sum {
    public static class pair implements Comparable<pair>{
        int index ;
        int value ;
        int x ;





        public pair(int x, int y , int w ){

            this.index=x ;
            this.value=y ;
            this.x =w ;
        }


        @Override
        public int compareTo(pair p) {
            if(this.value > p.value)
                return 1 ;
            else if (this.value == p.value)
                if(this.index>p.index)
                    return 1 ;
                else if(this.index == this.index)
                    return 0 ;
                else
                    return -1 ;
            else
                return -1 ;
        }




    }

    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in) ;

        int k = sc.nextInt() ;
        ArrayList<Integer> arrs[]= new ArrayList[k] ;
        ArrayList<Integer> arrs1[]= new ArrayList[k] ;
        ArrayList<pair> y = new ArrayList<pair>() ;

        for (int i = 0; i < k; i++)
        {
            int n = sc.nextInt() ;
            arrs[i] = new ArrayList<Integer>() ;
            arrs1[i] = new ArrayList<Integer>() ;

            int sum= 0 ;

            for (int j = 0; j <n; j++)
            {
                int x = sc.nextInt();
                arrs[i].add(x) ;
                sum += x ;
            }
            for (int j2 = 0; j2 < n; j2++)
            {
                arrs1[i].add(sum-arrs[i].get(j2)) ;
            }
            for (int j = 0; j < n; j++)
            {
                y.add(new pair((i+1), arrs1[i].get(j),(j+1) ));
            }
        }



        Collections.sort(y);

        for (int i = 0; i < y.size()-1; i++)
        {
            if(y.get(i).value == y.get(i+1).value && y.get(i).index!= y.get(i+1).index)
            {
                System.out.println("YES");
                System.err.println(y.get(i).value);
                System.out.println(y.get(i).index+" "+y.get(i).x);
                System.out.println(y.get(i+1).index+" "+y.get(i+1).x);

                return ;
            }
        }

        System.out.println("NO");

    }
    }


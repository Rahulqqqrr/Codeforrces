package CodeforcesRound486Div3;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class A__DiverseTeam {
//    There are n
//    students in a school class, the rating of the
//   -ith  student on Codehorses is ai
//    You have to form a team consisting of k
//    students (1≤k≤n) such that the ratings of all team members are distinct.
//    If it is impossible to form a suitable team, print "NO" (without quotes).
//    Otherwise print "YES", and then

//    Input
//    The first line contains two integers n
//    and k
//            (1≤k≤n≤100
//            ) — the number of students and the size of the team you have to form.
//
//    The second line contains n
//    integers a1,a2,…,an
//            (1≤ai≤100
//            ), where ai
//    is the rating of i
//-th student.
//    Output
//    If it is impossible to form a suitable team, print "NO" (without quotes). Otherwise print "YES", and then print k
//    distinct integers from 1
//    to n
//    which should be the indices of students in the team you form. All the ratings of the students in the team should be distinct. You may print the indices in any order. If there are multiple answers, print any of them.
//
//    Assume that the students are numbered from 1
//    to n
//Examples
//        Input
//        5 3
//        15 13 15 15 12
//Output
//        YES
//        1 2 5

    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        int n=sc.nextInt();
//        int k =sc.nextInt();
//        int arr[] = new int[n];
//        int ans[] = new  int[k];
//        for(int i=0;i<n;i++){
//            arr[i]= sc.nextInt();
//        }
//        ArrayList<Integer>al = new ArrayList<>();
//        int index =0;
//        for(int i=0;i<n;i++){
//            if(!al.contains(arr[i])){
//                al.add(arr[i]);
//                ans[index++]=i+1;
//            }else{
//                continue;
//            }
//        }
//        if(al.size()==k){
//            System.out.println("YES");
//            for(int i=0;i<k;i++){
//                System.out.print(ans[i]+" ");
//            }
//        }else{
//            System.out.println("N0");
//        }
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();

        HashSet<Integer> el = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < n; ++i) {
            int x = sc.nextInt();
            if (!el.contains(x)) {
                ans.add(i);
                el.add(x);
            }
        }

        if (ans.size() < k) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
            for (int i = 0; i < k; ++i) {
                System.out.print(ans.get(i) + 1 + " ");
            }
            System.out.println();
        }
    }







}

package EducationContestes172div2;
import java.util.*;
public class GamewithColoredMarbles {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t= sc.nextInt();
        while(t-->0){
            int n =sc.nextInt();
            int arr[] =new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            Arrays.sort(arr);
            //HashSet<Integer>h = new HashSet<>();
            HashMap<Integer,Integer>m = new HashMap<>();
            int count =0;
            for(int i=0;i<n;i++){
                if(!m.containsKey(arr[i])){
                    m.put(arr[i],1);
                }else{
                    int old = m.get(arr[i]);
                    int new1 = old+1;
                    m.put(arr[i],new1);

                }
            }
            for(int i=0;i<n;i=i+2) {

                if (m.containsKey(arr[i])) {
                    if (m.get(arr[i]) == 1) {
                        count = count + 2;
                    }
//            }else{
//                   count++;
//                }

                }

            }
            System.out.println(count);

        }
    }
}
//int test=sc.nextInt();
//int M=(int)1e9+7;
//        while(test-->0){
//int n = sc.nextInt();
//List<Integer> a = new ArrayList<>(n);
//
//        for (int i = 0; i < n; i++) {
//        a.add(sc.nextInt());
//        }
//Map<Integer, Integer> mp = new HashMap<>();
//
//        for (int it : a) {
//        mp.put(it, mp.getOrDefault(it, 0) + 1);
//        }
//
//int ans = 0;
//int cnt = 0;
//int flag = 0;
//
//        for (Map.Entry<Integer, Integer> entry : mp.entrySet()) {
//        if (entry.getValue() == 1) {
//        if (flag == 0) {
//flag = 1;
//cnt++;
//        } else {
//flag = 0;
//        }
//        } else {
//ans++;
//        }
//        }
//
//ans = ans + 2 * cnt;
//        System.out.println(ans);
//
//        }
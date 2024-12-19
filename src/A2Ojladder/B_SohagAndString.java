package A2Ojladder;
import java.util.Scanner;

public class B_SohagAndString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t =sc.nextInt();
        while(t-->0){
            String s = sc.next();
            if (s.length() == 1) {
                System.out.println(-1);
                continue;
            }
            String result = null;
            for (int i = 0; i < s.length() - 1; i++) {
                if (s.charAt(i) == s.charAt(i + 1)) {
                    result = "" + s.charAt(i) + s.charAt(i + 1);
                    break;
                }
                if (i < s.length() - 2 && s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i + 2) && s.charAt(i + 1) != s.charAt(i + 2)) {
                    result = "" + s.charAt(i) + s.charAt(i + 1) + s.charAt(i + 2);
                    break;
                }
            }
            System.out.println(result == null ? -1 : result);
        }


        }
    }


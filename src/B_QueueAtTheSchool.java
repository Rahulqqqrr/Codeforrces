import java.util.Scanner;

public class B_QueueAtTheSchool {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int t= sc.nextInt();
        String st = sc.next();
        StringBuffer br = new StringBuffer(st);
        for(int i=0;i<t;i++){
            for(int j=0;j<st.length()-1;){
                if(br.charAt(j)=='B'&&br.charAt(j+1)=='G'){
                    br.setCharAt(j,'G');
                    br.setCharAt(j+1,'B');
                    j+=2;
                }else{
                    j++;
                }

            }
        }
        System.out.println(br.toString());

//GGBGBBBB


    }
}

package CodeForcesBeta9;


import java.util.Scanner;

public class A_Klevitch {
    static void solve(char[][] arr){
        int row [] = new int[8];
        int col[] = new int [8];



        for(int i=0;i<8;i++){
            for(int j=0;j<8;j++){
                if(arr[i][j]=='B'){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int rowcount =0;
        for(int i=0;i<8;i++){
            if(row[i]==8){
                rowcount ++;
            }
        }
        int  colcount=0;
        for(int j=0;j<8;j++){
            if(col[j]==8){
                colcount ++;
            }
        }


        if(rowcount+colcount<16) {

            System.out.println(rowcount+colcount);

        }else{
            System.out.println(rowcount);
        }




    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char [][]arr = new char [8][8];
        for(int i=0;i<8;i++){
           arr[i]=sc.next().toCharArray();
        }
        solve(arr);



    }
}

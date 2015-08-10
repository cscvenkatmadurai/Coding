/**
 * Created by HARISH on 4/24/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HRSnakeAndLadder {
    static int arr[][];
    static final int boardSize = 100;
    static final int diceCap = 6;
    static final int notConnected = 100000;
    static final int snakeLaddesSelf = 0;
    static final int conn =1;

    static  void setBoard(){
        arr = new int[boardSize][boardSize];
        int j,temp;
        for (int i = 0; i < boardSize; i++) {
            //readable version have to optimize later
            for(j = 0; j < i;j++){
                arr[i][j] = notConnected;
            }
            arr[i][j] = snakeLaddesSelf;
            j++;
            temp = j+diceCap;//starting pos is included say 1 should be connected 1 2 3 4 5 6
            for(; j < boardSize && j<temp;j++){
                arr[i][j] = conn;
            }
            for (;j < boardSize;j++){
                arr[i][j] = notConnected;
            }
        }
    }
    static void printBoard(){

        for (int i = 0; i <  boardSize; i++) {
            System.out.print((i + 1)+"  ");
            for (int j = 0; j < boardSize; j++) {
                System.out.print((j+1)+" "+arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    static void removeConnection(int j){
        int i = j;
        j++;
        int temp = j+diceCap;
        for(;j<=temp && j < boardSize;j++){
            arr[i][j] = notConnected;
        }

    }

    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt(kb.readLine() ),snake,ladder;


        while (tt-- > 0){
            setBoard();
         //   printBoard();

            fillLadderSnake (kb);
            fillLadderSnake(kb);

          //  printBoard();
            FloydWalshal();
          //  printBoard();
            if(arr[0][99] == notConnected ){
                arr[0][99] = -1;
            }
            System.out.println(arr[0][99]);


        }


    }

    public static void fillLadderSnake(BufferedReader kb) throws IOException {
        int ladder;
        String[] temp;
        ladder = Integer.parseInt(kb.readLine());
        for (int i = 0; i < ladder ; i++) {
            temp = kb.readLine().split(" ");
            arr[Integer.parseInt(temp[0])-1][Integer.parseInt(temp[1])-1] = snakeLaddesSelf;
            removeConnection(Integer.parseInt(temp[0])-1);

        }
    }

    public static void FloydWalshal() {
        int i,j,k;
        for ( i = 0; i < boardSize ; i++) {
            for ( j = 0; j < boardSize ; j++) {
                for ( k = 0; k <  boardSize; k++) {
                  //  System.out.println("i = "+i+" j = "+j+" k = "+k+" arr[j][k]"+arr[j][k]+" arr[j][i]="+arr[j][i]+" + arr[i][k]"+arr[i][k]);
                  if(arr[j][k] >  arr[j][i]+arr[i][k] ){
                 //     System.out.println(arr[j][k]+" < "+arr[j][i]+" + "+arr[i][k]+" "+i+" "+j+" "+k);
                      arr[j][k] = arr[j][i] +arr[i][k];
               //       System.out.println(arr[j][k]+" "+i+" "+j+" "+k);
                  }
                }

            }

        }
    }
}

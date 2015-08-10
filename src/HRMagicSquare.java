import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by HARISH on 7/30/2015.
 */
public class HRMagicSquare {


    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        boolean magicSquare;
        int arr[][],i,j;
        int n = Integer.parseInt(kb.readLine());
        arr = new int[n][n];
        String ip[];
        for ( i = 0; i < n; i++) {
            ip = kb.readLine().split(" ");
            for ( j = 0; j < n; j++) {
                arr[i][j] = Integer.parseInt(ip[j]);
             }
        }
        ArrayList<Integer> ans = new ArrayList<>();
        long diag =0 ,antiDiag = 0,row = 0,col = 0;
        for ( i = 0,j = n-1; i < n ; i++,j--) {
          diag += arr[i][i];
          antiDiag +=arr[i][j];
        }
        if(diag != antiDiag){
            ans.add(0);
            magicSquare = true;

        }

        for (int k = 0; k < n; k++) {
            row = col = 0;
            for (int l = 0; l < n; l++) {
                row += arr[k][l];
                col += arr[l][k];
            }
            if(row != diag){
                ans.add(k+1);
                magicSquare = true;

            }
            if(col != diag){
                ans.add(-(k+1));
                magicSquare = true;

            }

        }
        Collections.sort(ans);
        if(ans.size() == 0){
            System.out.println("0");
        }else {
            System.out.println(ans.size());
            for (int k = 0; k < ans.size(); k++) {
                System.out.println(ans.get(k));
            }
        }

        System.out.println();



    }
}

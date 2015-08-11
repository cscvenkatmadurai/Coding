/**
 * Created by HARISH on 4/30/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class HRGridChallenge {
    static char arr[][];
    static int size;
    public static boolean checkColumn(int col){
        boolean flag = true;

        for (int i = 0; i < arr.length-1 && flag; i++) {
            if(arr[i][col] > arr[i+1][col]   ){
                flag = false;
            }
        }
        return flag;
    }
    public static void main(String[] args) throws  IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt( kb.readLine() );
        String temp;
        boolean ans;
        while(tt-- > 0){

            size =Integer.parseInt( kb.readLine() );
            arr = new char[size][];
            ans = true;

            for (int i = 0; i < size ; i++) {
                arr[i] = kb.readLine().toCharArray();

                Arrays.sort(arr[i]);
            }

            for (int i = 0; i < size && ans ; i++) {
                if(!checkColumn(i)){
                    ans = false;

                }
            }
            if(ans){
                System.out.println("YES");
            }else{
                System.out.println("NO");
            }



        }

    }
}

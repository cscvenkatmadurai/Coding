/**
 * Created by HARISH on 4/21/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class HELittleDeepuArray {
    public static void main(String[] args) throws  IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in));
        int n = Integer.parseInt(kb.readLine()),arr[] = new int[n],q,qu;
        String temp[ ] = kb.readLine().split(" ");
        for (int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(temp[i]);
        }
        q = Integer.parseInt( kb.readLine());
        while(q-- > 0){
            qu = Integer.parseInt(kb.readLine());
            for (int i = 0; i < n; i++) {
                if(arr[i] > qu) arr[i]--;
            }
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }



    }
}

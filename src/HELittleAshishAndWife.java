/**
 * Created by HARISH on 4/20/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Arrays;
public class HELittleAshishAndWife {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt( kb.readLine()),arr[],distinct,t;
        String temp[],temp1[];
        while (tt-- > 0){
            temp = kb.readLine().split(" ");
            arr = new int[Integer.parseInt(temp[0])];
            temp1 = kb.readLine().split(" ");
            for (int i = 0; i <  Integer.parseInt(temp[0]) ; i++) {
                arr[i] = Integer.parseInt(temp1[i]);
            }
            distinct = 0;
            Arrays.sort(arr);
            for (int i = 0; i < Integer.parseInt(temp[0]) ; ) {
                distinct++;
                t = arr[i];
                while(i < arr.length && t == arr[i]) i++;
               
            }
            if(distinct == Integer.parseInt(temp[1])){
                System.out.println("Perfect husband");
            }else if(distinct < Integer.parseInt(temp[1])){
                System.out.println("Bad husband");
            }else if(distinct > Integer.parseInt(temp[1])){
                System.out.println("Lame husband");
            }
        }


    }
}

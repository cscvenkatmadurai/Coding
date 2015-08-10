/**
 * Created by HARISH on 4/21/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 class CCTwoDog {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        String temp[] = kb.readLine().split(" ");
        int k = Integer.parseInt( temp[1]),arr []= new int[ Integer.parseInt( temp[0] ) ],ans =  Integer.MAX_VALUE,left,right,lr;

        temp = kb.readLine().split(" ");
        for (int i = 0; i < arr.length ; i++) {
            arr[i]=  Integer.parseInt( temp[i]);
        }
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]+arr[j] == k){
                    left = j+1;
                    right = arr.length-i;
                    lr = Integer.max(i+1,arr.length-j);
                    ans = Math.min(ans,Math.min(lr,Math.min(left,right)));
                }
            }
        }
        if(ans == Integer.MAX_VALUE){
            ans = -1;
        }
        System.out.println(ans);


    }
}

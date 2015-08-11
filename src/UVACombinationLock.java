/**
 * Created by HARISH on 5/11/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class UVACombinationLock {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        int arr[],ans,t1;
        final int val = 9,circleLength = 40;
        String temp,t[];
        while((temp=kb.readLine())!= null){
            t = temp.split(" ");
            arr = new int[t.length];
            for (int i = 0; i < t.length; i++) {
                arr[i] = Integer.parseInt(t[i]);
            }
            ans = 720;
            t1 = arr[1];
            if(arr[0]>arr[1]){
                t1+= circleLength;
            }
            ans+=(t1-arr[0])*val;
            ans+=360;
            if(arr[1]<arr[2]){
                ans+= ( (circleLength-arr[2]+arr[1] )*val );
            }else{
                ans+=Math.abs(arr[1]-arr[2])*val;
            }
            if(arr[2]>arr[3]){
                arr[3]+=circleLength;
            }
            ans+= ( (arr[3]-arr[2])*val );
            System.out.println(ans);

        }
    }
}

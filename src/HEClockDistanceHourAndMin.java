
import  java.io.*;
import java.util.Arrays;

/**
 * Created by HARISH on 6/16/2015.
 */
public class HEClockDistanceHourAndMin {
    public static void main(String[] args)  throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt = Integer.parseInt(kb.readLine()),count;
        int hr,min,ans,minHand,hrHand;
        String arr[];
        while (tt-- > 0){
            arr = kb.readLine().split(" ");
            hr = Integer.parseInt(arr[0]);
            min = Integer.parseInt(arr[1]);
            minHand = min * 6;
            hrHand = ( (hr%12) * 5 * 6 )+ (int) (.5*min);
            if( (360 - Math.abs(hrHand -  minHand )) < Math.abs(hrHand-minHand) ){
                System.out.println( (360 - Math.abs(hrHand -  minHand )));
            }else{
                System.out.println( Math.abs(hrHand -  minHand) );
            }

        }

    }
}

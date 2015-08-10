/**
 * Created by HARISH on 6/16/2015.
 */
import java.io.*;
public class HEClimbingStairs {
    static long arr[] = new long[1001];
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in));
        computeValues();
        int tt = Integer.parseInt(kb.readLine()),n;
        while(tt-- > 0){
            n = Integer.parseInt( kb.readLine() );
            System.out.println(arr[n]);
        }

    }

    public static void computeValues() {
        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        for (int i = 3; i < 1001 ; i++) {
            arr[i] = arr[i-1] + arr[i-2] ;
        }
    }

}

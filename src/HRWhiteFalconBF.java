import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by HARISH on 6/21/2015.
 */
public class HRWhiteFalconBF {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(kb.readLine()),k;
        long arr[] = new long[n],tempAns = 0,finalAns;
        finalAns = Long.MIN_VALUE;
        int maxArr = ( n* (n+1) ) /2;
        long possArr[][] = new long[ ( (n/2)*( (n/2)+1 ) ) /2 ][];
        String ip[] = kb.readLine().split(" ");

        for (int i = 0; i < n ; i++) {
            arr[i] = Long.parseLong(ip[i]);
            // System.out.println(arr[i]);
        }
        for (int i = 0; i < arr.length/2; i++) {
            for (int j = 0; j < arr.length-i ; j++) {


            }

        }
    }
}

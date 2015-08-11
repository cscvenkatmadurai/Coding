/**
 * Created by HARISH on 6/29/2015.
 */
import java.io.*;
import java.util.Arrays;

public class HRPairs {
    public static void main(String[] args) throws  IOException{
        BufferedReader kb =new BufferedReader( new InputStreamReader( System.in ));
        String ip[];
        ip = kb.readLine().split(" ");
        int n = Integer.parseInt(ip[0]), k = Integer.parseInt(ip[1]),arr[] = new int[n],count = 0;
        ip = kb.readLine().split(" ");
        for (int i = 0; i < ip.length; i++) {
            arr[i] = Integer.parseInt(ip[i]);
        }
        Arrays.sort(arr);
        for (int i = 0; i < arr.length -1 ; i++) {
            for (int j = i+1; j < arr.length && arr[j]-arr[i] <= k ; j++) {
                if(arr[j] -arr[i] == k){
                    count++;
                }
            }

        }
        System.out.println(count);



    }
}

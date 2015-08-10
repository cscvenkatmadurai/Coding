/**
 * Created by HARISH on 6/20/2015.
 */
import java.io.*;
public class HRFunction {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int l = Integer.parseInt(kb.readLine());
        long arr[] = new long[26];
        long ans = 0;
        String ip = kb.readLine();
        for (int i = 0; i < ip.length() ; i++) {
            arr[ip.charAt(i)-97]++;
        }
        for (int i = 0; i < arr.length ; i++) {
            ans+= ( (arr[i]*(arr[i]+1))/2);

        }


        System.out.println(ans);
    }
}

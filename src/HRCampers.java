import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by HARISH on 8/1/2015.
 */


public class HRCampers {
    public static int calcSnoppers(int s,int e){
        if(s>e){
            return 0;
        }
        return (int)Math.ceil( ((double)(e-s+1))/2);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int no ,k,arr[],ans;
        String ip[] = kb.readLine().split(" ");
        no = Integer.parseInt(ip[0]);
        k = Integer.parseInt(ip[1]);
        arr = new int[k];
        ip = kb.readLine().split(" ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(ip[i]);
        }
        Arrays.sort(arr);
        ans = k;
        ans += calcSnoppers(1,arr[0]-2);
        //System.out.println(1+" "+(arr[0]-2));
        for (int i = 0; i < arr.length-1 ; i++) {
            ans += calcSnoppers(arr[i]+2,arr[i+1]-2);
            //System.out.println(arr[i]+2+" "+ (arr[i+1]-2));

        }
        ans += calcSnoppers(arr[arr.length-1]+2,no);
        //System.out.println((arr[arr.length-1]+2)+" "+n);
        System.out.println(ans);




    }
}

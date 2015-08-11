import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by HARISH on 7/10/2015.
 */
public class PairNumbers {
    final static int maxLength = 10;
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in ));
        int tt  = Integer.parseInt(kb.readLine() ),no;

        String ip[];
        long arr[],ans = 0,val,count;
        while(tt-- > 0){
            no = Integer.parseInt(kb.readLine());
            ip = kb.readLine().split(" ");
            arr = new long[no];
            ans = 0;
            for (int i = 0; i < ip.length ; i++) {
                arr[i] = Long.parseLong(ip[i]);

            }
            Arrays.sort(arr);
            for (int i = 0; i < arr.length;) {
                long indexNo = arr[i];
                count = 0;
                while(i < arr.length && arr[i] == indexNo){
                    count++;
                    i++;
                }
                ans+=(count * (count+1))>>1;

            }
            System.out.println(ans);

        }

    }
}

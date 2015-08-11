import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.math.BigInteger;

/**
 * Created by HARISH on 6/21/2015.
 */
public class HRWhiteFalcon {
    public static void main(String[] args) throws Exception {
        // HRWhiteFalcon kb = new HRWhiteFalcon( System.in );
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(kb.readLine()), k;
        long arr[] = new long[n], tempAns = 0, finalAns;
        finalAns = 0;
        String ip[] = kb.readLine().split(" ");

        for (int i = 0; i < n; i++) {
            arr[i] = Long.parseLong(ip[i]);

        }
    //    System.out.println();
        for (int i = 0; i < n; i++) {

            for (int j = arr.length - 1; j > i; j--) {
                k = i;
                tempAns = 0;
                for (int l = j; l > k; l--, k++) {
                    tempAns += (arr[k] * arr[l]);
                    System.out.println(arr[k] + " " + arr[l]);
                }
                System.out.println("tempAns"+" "+tempAns);
                if (tempAns > finalAns) {
                    finalAns = tempAns;
                }
            }
        }
        System.out.println(finalAns);
    }
}


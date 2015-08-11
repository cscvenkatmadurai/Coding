/**
 * Created by HARISH on 5/8/2015.
 */
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.Arrays;

 class CCSetDifference {
    public static void main(String[] args) throws IOException {
        BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
        int tt =  Integer.parseInt(kb. readLine() ),no,value,arr[];
        BigInteger l,r,highSum,lowSum;
        String data[];

        while (tt-- > 0){
            no = Integer.parseInt(kb.readLine());
            l = BigInteger.ONE;
            l = l.shiftLeft(no-1);
            r = BigInteger.ONE;
            highSum = BigInteger.ZERO;
            lowSum = BigInteger.ZERO;
            arr = new int[no];
            data  = kb.readLine().split(" ");
            for (int i = 0; i < no ; i++) {
                arr[i] = Integer.parseInt( data[i] );

            }
           Arrays.sort(arr);
            for (int i = 0; i < no ; i++) {
                lowSum = lowSum.add( l.multiply( new BigInteger(Integer.toString(arr[i]) ) )  ).mod(new BigInteger("1000000007"));
                l = l.shiftRight(1);

                highSum = highSum.add( r.multiply( new BigInteger(Integer.toString(arr[i])  ) ) ).mod(new BigInteger("1000000007"));
                r = r.shiftLeft(1);
            }
            System.out.println(highSum.subtract(lowSum).mod(new BigInteger("1000000007")));
        }


    }
}

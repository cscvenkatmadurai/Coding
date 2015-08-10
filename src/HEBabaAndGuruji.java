/**
 * Created by HARISH on 4/21/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.math.BigInteger;
public class HEBabaAndGuruji {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in));
        long x,y,q,d,ans;
        String temp[] = kb.readLine().split(" ");
        x = Long.parseLong(temp[0]);
        y = Long.parseLong(temp[1]);
        q = Long.parseLong( kb.readLine() );
        BigInteger a,b,c;
        while (q-- > 0){
            d = Long.parseLong( kb.readLine() );
            a = new BigInteger(Long.toString(x));
            a = a.pow((int) d);
            b = new BigInteger(Long.toString(x));
            b = b.pow((int) d);
            b = b.subtract(new BigInteger("1"));
            b = b.divide(new BigInteger(Long.toString(x - 1)));
            b = b.multiply(new BigInteger( Long.toString(y)));
            a = a.subtract(b);
            System.out.println(a.mod(new BigInteger("1000000007")));

        }
    }
}

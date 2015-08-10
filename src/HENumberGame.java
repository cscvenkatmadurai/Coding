/**
 * Created by HARISH on 6/30/2015.
 */
import java.io.*;
public class HENumberGame {
    public static long gcd(long p, long q) {
        if (q == 0) {
            return p;
        }
        return gcd(q, p % q);
    }
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ) );
        long tt = Long.parseLong( kb.readLine() ),no1,no2,gcd;
        String ip[];
        while(tt-- > 0){
            ip = kb.readLine().split(" ");
            no1 = Long.parseLong(ip[0]);
            no2 = Long.parseLong(ip[1]);
            gcd = gcd(Math.max(no1, no2), Math.min(no1, no2));
            System.out.println( (no1*no2/gcd )+" / "+ gcd);


        }
    }
}

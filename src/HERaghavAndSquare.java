/**
 * Created by HARISH on 6/16/2015.
 */
import  java.io.*;
public class HERaghavAndSquare {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in ) );
        int tt = Integer.parseInt(kb.readLine());
        long n;
        while(tt-- > 0){
            n = Long.parseLong(kb.readLine());
            System.out.println( ( n * (n+1) *( (2*n) + 1) )/6 );
            System.out.println( ( (n*(n+1) )/2) * ( (n*(n+1) )/2)  );
        }
    }
}

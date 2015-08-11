/**
 * Created by HARISH on 6/14/2015.
 */
import java.io.*;

public class HEAgeOfUltron {
    public static void main(String args[]) throws IOException{

            BufferedReader kb = new BufferedReader(new InputStreamReader(System.in));
            int tt = Integer.parseInt (kb.readLine());

            while(tt-- > 0){
                long n=Long.parseLong(kb.readLine());

                System.out.println((n*(n-1))>>1);
            }



    }

}

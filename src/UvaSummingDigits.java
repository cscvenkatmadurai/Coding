/**
 * Created by HARISH on 5/13/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class UvaSummingDigits {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in));
        long n,ans;
        while( (n = Integer.parseInt( kb.readLine()) )!=0 ){
            ans=0;
            while(n>9){
                ans = 0;
                while(n > 0){
                    ans+=(n%10);
                    n/=10;
                }
                n = ans;
            }
            System.out.println(n);
        }

    }
}


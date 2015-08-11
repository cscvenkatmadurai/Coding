/**
 * Created by HARISH on 5/15/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
public class CCTriangleMason {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader(new InputStreamReader( System.in ) );
        int tt = Integer.parseInt(kb.readLine());
        long n,m,ans;
        String ip[];
        while(tt-- > 0){
            ip = kb.readLine().split(" ");
            n = Long.parseLong(ip[0]);
            m = Long.parseLong(ip[1]);
            ans = 0;
            for (int i = 0; i < n; i++) {
                ans+=(2*(m-i)*(n-i));
                ans%=1000000007;
            }
            System.out.println(ans);

        }

    }
}

/**
 * Created by HARISH on 4/23/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 class CCZeros {
    public static void main(String[] args) throws  IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt(kb.readLine() );
        long no,ans,temp,tc;
        while (tt-- > 0){
            no  = Long.parseLong( kb.readLine());
            ans = 0;
            for (long i = 5; i <= no ; i++) {
                temp = i;
                tc = 0;
                if(temp % 5 == 0){
                    while( temp%5 == 0){
                       tc++;
                        temp/=5;
                    }
                    ans+=(i*tc);
                }
            }
            System.out.println(ans);
        }



    }
}

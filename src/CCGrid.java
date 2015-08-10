/**
 * Created by HARISH on 4/23/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
 class CCGrid {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader( System.in ));
        int tt = Integer.parseInt( kb.readLine());
        String temp[];
        long n,m,ans;
        while(tt-- > 0){
            temp = kb.readLine().split(" ");
            n = Long.parseLong(temp[0]);
            m = Long.parseLong(temp[1]);
            ans = 0;
            if(n>= 2 && m>= 2){
                ans = ((n-2)*(m-2)<<3)+( (  ( (n-2 )+(m-2) )<<1 ) *5)+(3<<2 );

            }else{
                if(n == 1 && m == 1){
                    ans =0;
                }else if (Math.min(n,m) == 1){
                    ans = ( ( Math.max(n,m)-2)  <<1  )+(2);
                }
            }
            System.out.println(ans);
        }

    }
}


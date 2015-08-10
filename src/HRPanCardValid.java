/**
 * Created by HARISH on 4/22/2015.
 */

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.regex.Pattern;
public class HRPanCardValid {
    public static void main(String[] args) throws IOException{
        BufferedReader kb = new BufferedReader( new InputStreamReader(System.in));
        String ip;
        int tt = Integer.parseInt(kb.readLine()),i,end;
        StringBuffer temp;

        while(tt-- > 0){
            ip = kb.readLine();

            if ( (Pattern.matches("[018]+",ip)) && ip.equals(new StringBuffer(ip).reverse().toString()) ){
                System.out.println("YES");
            }else {
                System.out.println("NO");
            }

        }

    }
}
